/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author karlos
 */
@Entity
@Table(name = "CATALOGO_ESTUDIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoEstudio.findAll", query = "SELECT c FROM CatalogoEstudio c"),
    @NamedQuery(name = "CatalogoEstudio.findByIdCatalogoEstudio", query = "SELECT c FROM CatalogoEstudio c WHERE c.idCatalogoEstudio = :idCatalogoEstudio"),
    @NamedQuery(name = "CatalogoEstudio.findByNombre", query = "SELECT c FROM CatalogoEstudio c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoEstudio.findByDescripcion", query = "SELECT c FROM CatalogoEstudio c WHERE c.descripcion = :descripcion")})
public class CatalogoEstudio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_ESTUDIO")
    private String idCatalogoEstudio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public CatalogoEstudio() {
    }

    public CatalogoEstudio(String idCatalogoEstudio) {
        this.idCatalogoEstudio = idCatalogoEstudio;
    }

    public CatalogoEstudio(String idCatalogoEstudio, String nombre) {
        this.idCatalogoEstudio = idCatalogoEstudio;
        this.nombre = nombre;
    }

    public String getIdCatalogoEstudio() {
        return idCatalogoEstudio;
    }

    public void setIdCatalogoEstudio(String idCatalogoEstudio) {
        this.idCatalogoEstudio = idCatalogoEstudio;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoEstudio != null ? idCatalogoEstudio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoEstudio)) {
            return false;
        }
        CatalogoEstudio other = (CatalogoEstudio) object;
        if ((this.idCatalogoEstudio == null && other.idCatalogoEstudio != null) || (this.idCatalogoEstudio != null && !this.idCatalogoEstudio.equals(other.idCatalogoEstudio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoEstudio[ idCatalogoEstudio=" + idCatalogoEstudio + " ]";
    }
    
}
