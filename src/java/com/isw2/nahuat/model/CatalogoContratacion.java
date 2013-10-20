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
 * @author karlos
 */
@Entity
@Table(name = "CATALOGO_CONTRATACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoContratacion.findAll", query = "SELECT c FROM CatalogoContratacion c"),
    @NamedQuery(name = "CatalogoContratacion.findByIdCatalogoContratacion", query = "SELECT c FROM CatalogoContratacion c WHERE c.idCatalogoContratacion = :idCatalogoContratacion"),
    @NamedQuery(name = "CatalogoContratacion.findByNombre", query = "SELECT c FROM CatalogoContratacion c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoContratacion.findByDescripcion", query = "SELECT c FROM CatalogoContratacion c WHERE c.descripcion = :descripcion")})
public class CatalogoContratacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_CONTRATACION")
    private String idCatalogoContratacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoContratacion")
    private List<PrestacionContratacion> prestacionContratacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoContratacion")
    private List<Contratacion> contratacionList;

    public CatalogoContratacion() {
    }

    public CatalogoContratacion(String idCatalogoContratacion) {
        this.idCatalogoContratacion = idCatalogoContratacion;
    }

    public CatalogoContratacion(String idCatalogoContratacion, String nombre) {
        this.idCatalogoContratacion = idCatalogoContratacion;
        this.nombre = nombre;
    }

    public String getIdCatalogoContratacion() {
        return idCatalogoContratacion;
    }

    public void setIdCatalogoContratacion(String idCatalogoContratacion) {
        this.idCatalogoContratacion = idCatalogoContratacion;
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
    public List<PrestacionContratacion> getPrestacionContratacionList() {
        return prestacionContratacionList;
    }

    public void setPrestacionContratacionList(List<PrestacionContratacion> prestacionContratacionList) {
        this.prestacionContratacionList = prestacionContratacionList;
    }

    @XmlTransient
    public List<Contratacion> getContratacionList() {
        return contratacionList;
    }

    public void setContratacionList(List<Contratacion> contratacionList) {
        this.contratacionList = contratacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoContratacion != null ? idCatalogoContratacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoContratacion)) {
            return false;
        }
        CatalogoContratacion other = (CatalogoContratacion) object;
        if ((this.idCatalogoContratacion == null && other.idCatalogoContratacion != null) || (this.idCatalogoContratacion != null && !this.idCatalogoContratacion.equals(other.idCatalogoContratacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoContratacion[ idCatalogoContratacion=" + idCatalogoContratacion + " ]";
    }
    
}
