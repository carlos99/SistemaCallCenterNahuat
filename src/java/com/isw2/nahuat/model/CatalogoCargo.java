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
@Table(name = "CATALOGO_CARGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoCargo.findAll", query = "SELECT c FROM CatalogoCargo c"),
    @NamedQuery(name = "CatalogoCargo.findByIdCatalogoCargo", query = "SELECT c FROM CatalogoCargo c WHERE c.idCatalogoCargo = :idCatalogoCargo"),
    @NamedQuery(name = "CatalogoCargo.findByNombre", query = "SELECT c FROM CatalogoCargo c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoCargo.findByDescripcion", query = "SELECT c FROM CatalogoCargo c WHERE c.descripcion = :descripcion")})
public class CatalogoCargo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_CARGO")
    private String idCatalogoCargo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoCargo")
    private List<Contratacion> contratacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoCargo")
    private List<EmpleadoExperiencia> empleadoExperienciaList;

    public CatalogoCargo() {
    }

    public CatalogoCargo(String idCatalogoCargo) {
        this.idCatalogoCargo = idCatalogoCargo;
    }

    public CatalogoCargo(String idCatalogoCargo, String nombre) {
        this.idCatalogoCargo = idCatalogoCargo;
        this.nombre = nombre;
    }

    public String getIdCatalogoCargo() {
        return idCatalogoCargo;
    }

    public void setIdCatalogoCargo(String idCatalogoCargo) {
        this.idCatalogoCargo = idCatalogoCargo;
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
    public List<Contratacion> getContratacionList() {
        return contratacionList;
    }

    public void setContratacionList(List<Contratacion> contratacionList) {
        this.contratacionList = contratacionList;
    }

    @XmlTransient
    public List<EmpleadoExperiencia> getEmpleadoExperienciaList() {
        return empleadoExperienciaList;
    }

    public void setEmpleadoExperienciaList(List<EmpleadoExperiencia> empleadoExperienciaList) {
        this.empleadoExperienciaList = empleadoExperienciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoCargo != null ? idCatalogoCargo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoCargo)) {
            return false;
        }
        CatalogoCargo other = (CatalogoCargo) object;
        if ((this.idCatalogoCargo == null && other.idCatalogoCargo != null) || (this.idCatalogoCargo != null && !this.idCatalogoCargo.equals(other.idCatalogoCargo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoCargo[ idCatalogoCargo=" + idCatalogoCargo + " ]";
    }
    
}
