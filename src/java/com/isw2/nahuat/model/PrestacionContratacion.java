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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carlos
 */
@Entity
@Table(name = "PRESTACION_CONTRATACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrestacionContratacion.findAll", query = "SELECT p FROM PrestacionContratacion p"),
    @NamedQuery(name = "PrestacionContratacion.findByIdPrestacionContratacion", query = "SELECT p FROM PrestacionContratacion p WHERE p.idPrestacionContratacion = :idPrestacionContratacion"),
    @NamedQuery(name = "PrestacionContratacion.findByNombre", query = "SELECT p FROM PrestacionContratacion p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PrestacionContratacion.findByDescripcion", query = "SELECT p FROM PrestacionContratacion p WHERE p.descripcion = :descripcion")})
public class PrestacionContratacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_PRESTACION_CONTRATACION")
    private String idPrestacionContratacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "ID_PRESTACION_DESCUENTO", referencedColumnName = "ID_PRESTACION_DESCUENTO")
    @ManyToOne(optional = false)
    private PrestacionDescuento idPrestacionDescuento;
    @JoinColumn(name = "ID_CATALOGO_CONTRATACION", referencedColumnName = "ID_CATALOGO_CONTRATACION")
    @ManyToOne(optional = false)
    private CatalogoContratacion idCatalogoContratacion;

    public PrestacionContratacion() {
    }

    public PrestacionContratacion(String idPrestacionContratacion) {
        this.idPrestacionContratacion = idPrestacionContratacion;
    }

    public PrestacionContratacion(String idPrestacionContratacion, String nombre) {
        this.idPrestacionContratacion = idPrestacionContratacion;
        this.nombre = nombre;
    }

    public String getIdPrestacionContratacion() {
        return idPrestacionContratacion;
    }

    public void setIdPrestacionContratacion(String idPrestacionContratacion) {
        this.idPrestacionContratacion = idPrestacionContratacion;
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

    public PrestacionDescuento getIdPrestacionDescuento() {
        return idPrestacionDescuento;
    }

    public void setIdPrestacionDescuento(PrestacionDescuento idPrestacionDescuento) {
        this.idPrestacionDescuento = idPrestacionDescuento;
    }

    public CatalogoContratacion getIdCatalogoContratacion() {
        return idCatalogoContratacion;
    }

    public void setIdCatalogoContratacion(CatalogoContratacion idCatalogoContratacion) {
        this.idCatalogoContratacion = idCatalogoContratacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrestacionContratacion != null ? idPrestacionContratacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrestacionContratacion)) {
            return false;
        }
        PrestacionContratacion other = (PrestacionContratacion) object;
        if ((this.idPrestacionContratacion == null && other.idPrestacionContratacion != null) || (this.idPrestacionContratacion != null && !this.idPrestacionContratacion.equals(other.idPrestacionContratacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.PrestacionContratacion[ idPrestacionContratacion=" + idPrestacionContratacion + " ]";
    }
    
}
