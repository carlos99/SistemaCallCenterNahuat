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
@Table(name = "CATALOGO_ESTADO_CIVIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoEstadoCivil.findAll", query = "SELECT c FROM CatalogoEstadoCivil c"),
    @NamedQuery(name = "CatalogoEstadoCivil.findByIdCatalogoEstadoCivil", query = "SELECT c FROM CatalogoEstadoCivil c WHERE c.idCatalogoEstadoCivil = :idCatalogoEstadoCivil"),
    @NamedQuery(name = "CatalogoEstadoCivil.findByNombre", query = "SELECT c FROM CatalogoEstadoCivil c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoEstadoCivil.findByDescripcion", query = "SELECT c FROM CatalogoEstadoCivil c WHERE c.descripcion = :descripcion")})
public class CatalogoEstadoCivil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_CATALOGO_ESTADO_CIVIL")
    private String idCatalogoEstadoCivil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoEstadoCivil")
    private List<Empleado> empleadoList;

    public CatalogoEstadoCivil() {
    }

    public CatalogoEstadoCivil(String idCatalogoEstadoCivil) {
        this.idCatalogoEstadoCivil = idCatalogoEstadoCivil;
    }

    public CatalogoEstadoCivil(String idCatalogoEstadoCivil, String nombre) {
        this.idCatalogoEstadoCivil = idCatalogoEstadoCivil;
        this.nombre = nombre;
    }

    public String getIdCatalogoEstadoCivil() {
        return idCatalogoEstadoCivil;
    }

    public void setIdCatalogoEstadoCivil(String idCatalogoEstadoCivil) {
        this.idCatalogoEstadoCivil = idCatalogoEstadoCivil;
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
    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoEstadoCivil != null ? idCatalogoEstadoCivil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoEstadoCivil)) {
            return false;
        }
        CatalogoEstadoCivil other = (CatalogoEstadoCivil) object;
        if ((this.idCatalogoEstadoCivil == null && other.idCatalogoEstadoCivil != null) || (this.idCatalogoEstadoCivil != null && !this.idCatalogoEstadoCivil.equals(other.idCatalogoEstadoCivil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoEstadoCivil[ idCatalogoEstadoCivil=" + idCatalogoEstadoCivil + " ]";
    }
    
}
