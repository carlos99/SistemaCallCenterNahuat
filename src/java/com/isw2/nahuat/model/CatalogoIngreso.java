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
@Table(name = "CATALOGO_INGRESO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoIngreso.findAll", query = "SELECT c FROM CatalogoIngreso c"),
    @NamedQuery(name = "CatalogoIngreso.findByIdCatalogoIngreso", query = "SELECT c FROM CatalogoIngreso c WHERE c.idCatalogoIngreso = :idCatalogoIngreso"),
    @NamedQuery(name = "CatalogoIngreso.findByNombre", query = "SELECT c FROM CatalogoIngreso c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoIngreso.findByDescripcion", query = "SELECT c FROM CatalogoIngreso c WHERE c.descripcion = :descripcion")})
public class CatalogoIngreso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_INGRESO")
    private String idCatalogoIngreso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoIngreso")
    private List<DplanillaIngreso> dplanillaIngresoList;

    public CatalogoIngreso() {
    }

    public CatalogoIngreso(String idCatalogoIngreso) {
        this.idCatalogoIngreso = idCatalogoIngreso;
    }

    public CatalogoIngreso(String idCatalogoIngreso, String nombre) {
        this.idCatalogoIngreso = idCatalogoIngreso;
        this.nombre = nombre;
    }

    public String getIdCatalogoIngreso() {
        return idCatalogoIngreso;
    }

    public void setIdCatalogoIngreso(String idCatalogoIngreso) {
        this.idCatalogoIngreso = idCatalogoIngreso;
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
    public List<DplanillaIngreso> getDplanillaIngresoList() {
        return dplanillaIngresoList;
    }

    public void setDplanillaIngresoList(List<DplanillaIngreso> dplanillaIngresoList) {
        this.dplanillaIngresoList = dplanillaIngresoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoIngreso != null ? idCatalogoIngreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoIngreso)) {
            return false;
        }
        CatalogoIngreso other = (CatalogoIngreso) object;
        if ((this.idCatalogoIngreso == null && other.idCatalogoIngreso != null) || (this.idCatalogoIngreso != null && !this.idCatalogoIngreso.equals(other.idCatalogoIngreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoIngreso[ idCatalogoIngreso=" + idCatalogoIngreso + " ]";
    }
    
}
