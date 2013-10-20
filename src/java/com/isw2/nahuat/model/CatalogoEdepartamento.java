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
@Table(name = "CATALOGO_EDEPARTAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoEdepartamento.findAll", query = "SELECT c FROM CatalogoEdepartamento c"),
    @NamedQuery(name = "CatalogoEdepartamento.findByIdCatalogoEdepartamento", query = "SELECT c FROM CatalogoEdepartamento c WHERE c.idCatalogoEdepartamento = :idCatalogoEdepartamento"),
    @NamedQuery(name = "CatalogoEdepartamento.findByNombre", query = "SELECT c FROM CatalogoEdepartamento c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoEdepartamento.findByDescripcion", query = "SELECT c FROM CatalogoEdepartamento c WHERE c.descripcion = :descripcion")})
public class CatalogoEdepartamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_EDEPARTAMENTO")
    private String idCatalogoEdepartamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public CatalogoEdepartamento() {
    }

    public CatalogoEdepartamento(String idCatalogoEdepartamento) {
        this.idCatalogoEdepartamento = idCatalogoEdepartamento;
    }

    public CatalogoEdepartamento(String idCatalogoEdepartamento, String nombre) {
        this.idCatalogoEdepartamento = idCatalogoEdepartamento;
        this.nombre = nombre;
    }

    public String getIdCatalogoEdepartamento() {
        return idCatalogoEdepartamento;
    }

    public void setIdCatalogoEdepartamento(String idCatalogoEdepartamento) {
        this.idCatalogoEdepartamento = idCatalogoEdepartamento;
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
        hash += (idCatalogoEdepartamento != null ? idCatalogoEdepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoEdepartamento)) {
            return false;
        }
        CatalogoEdepartamento other = (CatalogoEdepartamento) object;
        if ((this.idCatalogoEdepartamento == null && other.idCatalogoEdepartamento != null) || (this.idCatalogoEdepartamento != null && !this.idCatalogoEdepartamento.equals(other.idCatalogoEdepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoEdepartamento[ idCatalogoEdepartamento=" + idCatalogoEdepartamento + " ]";
    }
    
}
