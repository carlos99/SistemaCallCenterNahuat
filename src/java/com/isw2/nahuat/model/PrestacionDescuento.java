/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "PRESTACION_DESCUENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrestacionDescuento.findAll", query = "SELECT p FROM PrestacionDescuento p"),
    @NamedQuery(name = "PrestacionDescuento.findByIdPrestacionDescuento", query = "SELECT p FROM PrestacionDescuento p WHERE p.idPrestacionDescuento = :idPrestacionDescuento"),
    @NamedQuery(name = "PrestacionDescuento.findByNombre", query = "SELECT p FROM PrestacionDescuento p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "PrestacionDescuento.findByPorcentaje", query = "SELECT p FROM PrestacionDescuento p WHERE p.porcentaje = :porcentaje"),
    @NamedQuery(name = "PrestacionDescuento.findByCantidadMaxima", query = "SELECT p FROM PrestacionDescuento p WHERE p.cantidadMaxima = :cantidadMaxima"),
    @NamedQuery(name = "PrestacionDescuento.findByDescripcion", query = "SELECT p FROM PrestacionDescuento p WHERE p.descripcion = :descripcion")})
public class PrestacionDescuento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PRESTACION_DESCUENTO")
    private Character idPrestacionDescuento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PORCENTAJE")
    private BigInteger porcentaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD_MAXIMA")
    private BigInteger cantidadMaxima;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrestacionDescuento")
    private List<PrestacionContratacion> prestacionContratacionList;

    public PrestacionDescuento() {
    }

    public PrestacionDescuento(Character idPrestacionDescuento) {
        this.idPrestacionDescuento = idPrestacionDescuento;
    }

    public PrestacionDescuento(Character idPrestacionDescuento, String nombre, BigInteger porcentaje, BigInteger cantidadMaxima) {
        this.idPrestacionDescuento = idPrestacionDescuento;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.cantidadMaxima = cantidadMaxima;
    }

    public Character getIdPrestacionDescuento() {
        return idPrestacionDescuento;
    }

    public void setIdPrestacionDescuento(Character idPrestacionDescuento) {
        this.idPrestacionDescuento = idPrestacionDescuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigInteger getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigInteger porcentaje) {
        this.porcentaje = porcentaje;
    }

    public BigInteger getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(BigInteger cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrestacionDescuento != null ? idPrestacionDescuento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrestacionDescuento)) {
            return false;
        }
        PrestacionDescuento other = (PrestacionDescuento) object;
        if ((this.idPrestacionDescuento == null && other.idPrestacionDescuento != null) || (this.idPrestacionDescuento != null && !this.idPrestacionDescuento.equals(other.idPrestacionDescuento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.PrestacionDescuento[ idPrestacionDescuento=" + idPrestacionDescuento + " ]";
    }
    
}
