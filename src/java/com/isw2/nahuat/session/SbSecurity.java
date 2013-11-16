/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.session;
import com.isw2.nahuat.model.Usuario;
import com.isw2.nahuat.backing.util.plugin;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
/**
 *
 * @author Soporte
 */
@Stateless
@LocalBean
public class SbSecurity {
    @PersistenceContext(unitName = "aciloPU")
    private EntityManager em;

    public SbSecurity() {
    }

    public EntityManager getEntityManager() {
        return em;
    }

    public Usuario loginStart(String user, String pass) {
        try {
            pass = plugin.md5(plugin.avoidSQL(pass));
            user = user;
            Query query = getEntityManager().createNamedQuery("Usuario.login");
            query.setParameter("idUser", user);
            query.setParameter("userPass", pass);
            Usuario entUser = (Usuario) query.getSingleResult();
            return entUser;
        } catch (NoResultException e) {
            return null;
        }
    }
}
