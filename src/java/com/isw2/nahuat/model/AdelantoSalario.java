/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author karlos
 */
@Entity
@Table(name = "ADELANTO_SALARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdelantoSalario.findAll", query = "SELECT a FROM AdelantoSalario a"),
    @NamedQuery(name = "AdelantoSalario.findByIdAdelantoSalario", query = "SELECT a FROM AdelantoSalario a WHERE a.idAdelantoSalario = :idAdelantoSalario"),
    @NamedQuery(name = "AdelantoSalario.findByFechaSolicitudCreada", query = "SELECT a FROM AdelantoSalario a WHERE a.fechaSolicitudCreada = :fechaSolicitudCreada"),
    @NamedQuery(name = "AdelantoSalario.findByFechaSolicitudResolucion", query = "SELECT a FROM AdelantoSalario a WHERE a.fechaSolicitudResolucion = :fechaSolicitudResolucion"),
    @NamedQuery(name = "AdelantoSalario.findByMonto", query = "SELECT a FROM AdelantoSalario a WHERE a.monto = :monto")})
public class AdelantoSalario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_ADELANTO_SALARIO")
    private String idAdelantoSalario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_SOLICITUD_CREADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitudCreada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_SOLICITUD_RESOLUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitudResolucion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTO")
    private short monto;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne(optional = false)
    private Empresa idEmpresa;
    @JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "ID_CATALOGO_PERIODO", referencedColumnName = "ID_CATALOGO_PERIODO")
    @ManyToOne(optional = false)
    private CatalogoPeriodo idCatalogoPeriodo;
    @JoinColumn(name = "ID_CATALOGO_ESTADO", referencedColumnName = "ID_CATALOGO_ESTADO")
    @ManyToOne(optional = false)
    private CatalogoEstado idCatalogoEstado;

    public AdelantoSalario() {
    }

    public AdelantoSalario(String idAdelantoSalario) {
        this.idAdelantoSalario = idAdelantoSalario;
    }

    public AdelantoSalario(String idAdelantoSalario, Date fechaSolicitudCreada, Date fechaSolicitudResolucion, short monto) {
        this.idAdelantoSalario = idAdelantoSalario;
        this.fechaSolicitudCreada = fechaSolicitudCreada;
        this.fechaSolicitudResolucion = fechaSolicitudResolucion;
        this.monto = monto;
    }

    public String getIdAdelantoSalario() {
        return idAdelantoSalario;
    }

    public void setIdAdelantoSalario(String idAdelantoSalario) {
        this.idAdelantoSalario = idAdelantoSalario;
    }

    public Date getFechaSolicitudCreada() {
        return fechaSolicitudCreada;
    }

    public void setFechaSolicitudCreada(Date fechaSolicitudCreada) {
        this.fechaSolicitudCreada = fechaSolicitudCreada;
    }

    public Date getFechaSolicitudResolucion() {
        return fechaSolicitudResolucion;
    }

    public void setFechaSolicitudResolucion(Date fechaSolicitudResolucion) {
        this.fechaSolicitudResolucion = fechaSolicitudResolucion;
    }

    public short getMonto() {
        return monto;
    }

    public void setMonto(short monto) {
        this.monto = monto;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public CatalogoPeriodo getIdCatalogoPeriodo() {
        return idCatalogoPeriodo;
    }

    public void setIdCatalogoPeriodo(CatalogoPeriodo idCatalogoPeriodo) {
        this.idCatalogoPeriodo = idCatalogoPeriodo;
    }

    public CatalogoEstado getIdCatalogoEstado() {
        return idCatalogoEstado;
    }

    public void setIdCatalogoEstado(CatalogoEstado idCatalogoEstado) {
        this.idCatalogoEstado = idCatalogoEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdelantoSalario != null ? idAdelantoSalario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdelantoSalario)) {
            return false;
        }
        AdelantoSalario other = (AdelantoSalario) object;
        if ((this.idAdelantoSalario == null && other.idAdelantoSalario != null) || (this.idAdelantoSalario != null && !this.idAdelantoSalario.equals(other.idAdelantoSalario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.AdelantoSalario[ idAdelantoSalario=" + idAdelantoSalario + " ]";
    }
    
}
