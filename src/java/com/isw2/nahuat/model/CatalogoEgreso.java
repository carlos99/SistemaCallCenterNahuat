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
@Table(name = "CATALOGO_EGRESO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoEgreso.findAll", query = "SELECT c FROM CatalogoEgreso c"),
    @NamedQuery(name = "CatalogoEgreso.findByIdCatalogoEgreso", query = "SELECT c FROM CatalogoEgreso c WHERE c.idCatalogoEgreso = :idCatalogoEgreso"),
    @NamedQuery(name = "CatalogoEgreso.findByNombre", query = "SELECT c FROM CatalogoEgreso c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoEgreso.findByDescripcion", query = "SELECT c FROM CatalogoEgreso c WHERE c.descripcion = :descripcion")})
public class CatalogoEgreso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_CATALOGO_EGRESO")
    private String idCatalogoEgreso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoEgreso")
    private List<DplanillaEgreso> dplanillaEgresoList;

    public CatalogoEgreso() {
    }

    public CatalogoEgreso(String idCatalogoEgreso) {
        this.idCatalogoEgreso = idCatalogoEgreso;
    }

    public CatalogoEgreso(String idCatalogoEgreso, String nombre) {
        this.idCatalogoEgreso = idCatalogoEgreso;
        this.nombre = nombre;
    }

    public String getIdCatalogoEgreso() {
        return idCatalogoEgreso;
    }

    public void setIdCatalogoEgreso(String idCatalogoEgreso) {
        this.idCatalogoEgreso = idCatalogoEgreso;
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
    public List<DplanillaEgreso> getDplanillaEgresoList() {
        return dplanillaEgresoList;
    }

    public void setDplanillaEgresoList(List<DplanillaEgreso> dplanillaEgresoList) {
        this.dplanillaEgresoList = dplanillaEgresoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoEgreso != null ? idCatalogoEgreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoEgreso)) {
            return false;
        }
        CatalogoEgreso other = (CatalogoEgreso) object;
        if ((this.idCatalogoEgreso == null && other.idCatalogoEgreso != null) || (this.idCatalogoEgreso != null && !this.idCatalogoEgreso.equals(other.idCatalogoEgreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoEgreso[ idCatalogoEgreso=" + idCatalogoEgreso + " ]";
    }
    
}
