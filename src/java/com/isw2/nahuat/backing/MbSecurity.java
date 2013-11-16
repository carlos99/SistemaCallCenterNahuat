/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.backing;
import com.isw2.nahuat.model.Usuario;
import com.isw2.nahuat.backing.util.plugin;
import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@Named(value = "MbSecurity")
@RequestScoped
public class MbSecurity {
    
    @EJB
    private com.isw2.nahuat.session.SbSecurity sbSecurity;
    private String user, password;

    public MbSecurity() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void login() {
        Usuario user = this.sbSecurity.loginStart(this.user, plugin.avoidSQL(this.password));
        if (user != null) {
            FacesContext context = FacesContext.getCurrentInstance();
            HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
            request.getSession(true);
            request.getSession().setAttribute("login", user);
            System.out.println("role : " + user.getIdUsuarioNivel().getNombre());
            plugin.redirec("./index.jsf");            
        } else {
            plugin.message(plugin.mError, "Error no se encontro el user");
        }
    }

    public void logout() {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
            if (request.getSession() != null) {
                request.getSession().removeAttribute("login");
                request.getSession().removeAttribute("menu");
                request.getSession(false).invalidate();
                plugin.redirec("../login.jsf");
            }
        } catch (Exception e) {
            plugin.message(plugin.mError, "Error en logout");
        }

    }
}
