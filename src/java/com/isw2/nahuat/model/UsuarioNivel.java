/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author carlos
 */
@Entity
@Table(name = "USUARIO_NIVEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioNivel.findAll", query = "SELECT u FROM UsuarioNivel u"),
    @NamedQuery(name = "UsuarioNivel.findByIdUsuarioNivel", query = "SELECT u FROM UsuarioNivel u WHERE u.idUsuarioNivel = :idUsuarioNivel"),
    @NamedQuery(name = "UsuarioNivel.findByNombre", query = "SELECT u FROM UsuarioNivel u WHERE u.nombre = :nombre"),
    @NamedQuery(name = "UsuarioNivel.findByDescripcion", query = "SELECT u FROM UsuarioNivel u WHERE u.descripcion = :descripcion")})
public class UsuarioNivel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_USUARIO_NIVEL")
    private String idUsuarioNivel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuarioNivel")
    private List<Usuario> usuarioList;

    public UsuarioNivel() {
    }

    public UsuarioNivel(String idUsuarioNivel) {
        this.idUsuarioNivel = idUsuarioNivel;
    }

    public UsuarioNivel(String idUsuarioNivel, String nombre) {
        this.idUsuarioNivel = idUsuarioNivel;
        this.nombre = nombre;
    }

    public String getIdUsuarioNivel() {
        return idUsuarioNivel;
    }

    public void setIdUsuarioNivel(String idUsuarioNivel) {
        this.idUsuarioNivel = idUsuarioNivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioNivel != null ? idUsuarioNivel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioNivel)) {
            return false;
        }
        UsuarioNivel other = (UsuarioNivel) object;
        if ((this.idUsuarioNivel == null && other.idUsuarioNivel != null) || (this.idUsuarioNivel != null && !this.idUsuarioNivel.equals(other.idUsuarioNivel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.UsuarioNivel[ idUsuarioNivel=" + idUsuarioNivel + " ]";
    }
    
}
