/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.bean;

import com.isw2.nahuat.dao.UsuarioDao;
import com.isw2.nahuat.daoimpl.UsuarioDaoImpl;
import com.isw2.nahuat.model.Usuario;
import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import myutil.jpaUtil;
import org.primefaces.context.RequestContext;

/**
 *
 * @author carlos
 */
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

   private Usuario usuario;
    private UsuarioDao usuarioDao;
    
    public LoginBean() {
        this.usuarioDao = new UsuarioDaoImpl();
        if(this.usuario == null){
            this.usuario = new Usuario();  
        }
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void login(ActionEvent actionEvent) {  
        RequestContext context = RequestContext.getCurrentInstance();  
        FacesMessage msg;  
        boolean loggedIn;
        String ruta = "";
        
        this.usuario = this.usuarioDao.login(this.usuario);
          
        if(this.usuario != null) {  
            loggedIn = true; 
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.usuario.getNombreUsuario());
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", this.usuario.getNombreUsuario()); 
            ruta = jpaUtil.basepath()+"views/inicio.jsf";
            System.out.println("Valida Usuario pero no contraseña correcta");
        } else {  
            loggedIn = false;  
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Usuario y/o Contraseña son incorrectos");
            if(this.usuario == null){
            this.usuario = new Usuario(); 
            }
            System.out.println("Valida Contraseña");
        }  
          
        FacesContext.getCurrentInstance().addMessage(null, msg);  
        context.addCallbackParam("loggedIn", loggedIn);  
        context.addCallbackParam("ruta", ruta);  
    }
}
