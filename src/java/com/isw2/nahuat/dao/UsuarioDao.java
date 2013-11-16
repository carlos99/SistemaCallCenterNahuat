/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.dao;

import com.isw2.nahuat.model.Usuario;

/**
 *
 * @author carlos
 */
public interface UsuarioDao {
    public Usuario buscarPorUsuario(Usuario usuario);
    public Usuario login(Usuario usuario);
}
