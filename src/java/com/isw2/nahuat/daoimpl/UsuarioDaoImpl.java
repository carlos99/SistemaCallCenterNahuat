/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.daoimpl;

import com.isw2.nahuat.dao.UsuarioDao;
import com.isw2.nahuat.model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import myutil.jpaUtil;

/**
 *
 * @author carlos
 */
public class UsuarioDaoImpl implements UsuarioDao {

    @Override
    public Usuario buscarPorUsuario(Usuario usuario) {
        Usuario listaUsuarios = null;
        EntityManager em = jpaUtil.getEntityManagerFactory().createEntityManager();
        String sql = "FROM Usuario WHERE usuario = '" + usuario.getNombreUsuario() + "'";
        try {
            Query query = em.createQuery("SELECT d FROM Departamentos d");
            em.getTransaction().commit();
            listaUsuarios = (Usuario) query.getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally{
            em.close();
        }

        return listaUsuarios;
    }

    @Override
    public Usuario login(Usuario usuario) {
        Usuario model = this.buscarPorUsuario(usuario);
        if (model != null) {
            if (!usuario.getClaveUsuario().equals(model.getClaveUsuario())) {
                model = null;
            }
        }

        return model;
    }
}
