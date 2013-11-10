/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.model;

import java.io.Serializable;
import java.math.BigInteger;
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
 * @author carlos
 */
@Entity
@Table(name = "MARCACION_DEXTRA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MarcacionDextra.findAll", query = "SELECT m FROM MarcacionDextra m"),
    @NamedQuery(name = "MarcacionDextra.findByIdMarcacionDextra", query = "SELECT m FROM MarcacionDextra m WHERE m.idMarcacionDextra = :idMarcacionDextra"),
    @NamedQuery(name = "MarcacionDextra.findByFechaCreacion", query = "SELECT m FROM MarcacionDextra m WHERE m.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "MarcacionDextra.findByFechaInicioExtra", query = "SELECT m FROM MarcacionDextra m WHERE m.fechaInicioExtra = :fechaInicioExtra"),
    @NamedQuery(name = "MarcacionDextra.findByHoraInicioExtra", query = "SELECT m FROM MarcacionDextra m WHERE m.horaInicioExtra = :horaInicioExtra"),
    @NamedQuery(name = "MarcacionDextra.findByFechaFinExtra", query = "SELECT m FROM MarcacionDextra m WHERE m.fechaFinExtra = :fechaFinExtra"),
    @NamedQuery(name = "MarcacionDextra.findByHoraFinExtra", query = "SELECT m FROM MarcacionDextra m WHERE m.horaFinExtra = :horaFinExtra"),
    @NamedQuery(name = "MarcacionDextra.findByMinutosExtraTotal", query = "SELECT m FROM MarcacionDextra m WHERE m.minutosExtraTotal = :minutosExtraTotal")})
public class MarcacionDextra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_MARCACION_DEXTRA")
    private String idMarcacionDextra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INICIO_EXTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioExtra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HORA_INICIO_EXTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicioExtra;
    @Column(name = "FECHA_FIN_EXTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinExtra;
    @Column(name = "HORA_FIN_EXTRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFinExtra;
    @Column(name = "MINUTOS_EXTRA_TOTAL")
    private BigInteger minutosExtraTotal;
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
    @JoinColumn(name = "ID_CATALOGO_DEXTRA", referencedColumnName = "ID_CATALOGO_DEXTRA")
    @ManyToOne(optional = false)
    private CatalogoDextra idCatalogoDextra;

    public MarcacionDextra() {
    }

    public MarcacionDextra(String idMarcacionDextra) {
        this.idMarcacionDextra = idMarcacionDextra;
    }

    public MarcacionDextra(String idMarcacionDextra, Date fechaCreacion, Date fechaInicioExtra, Date horaInicioExtra) {
        this.idMarcacionDextra = idMarcacionDextra;
        this.fechaCreacion = fechaCreacion;
        this.fechaInicioExtra = fechaInicioExtra;
        this.horaInicioExtra = horaInicioExtra;
    }

    public String getIdMarcacionDextra() {
        return idMarcacionDextra;
    }

    public void setIdMarcacionDextra(String idMarcacionDextra) {
        this.idMarcacionDextra = idMarcacionDextra;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaInicioExtra() {
        return fechaInicioExtra;
    }

    public void setFechaInicioExtra(Date fechaInicioExtra) {
        this.fechaInicioExtra = fechaInicioExtra;
    }

    public Date getHoraInicioExtra() {
        return horaInicioExtra;
    }

    public void setHoraInicioExtra(Date horaInicioExtra) {
        this.horaInicioExtra = horaInicioExtra;
    }

    public Date getFechaFinExtra() {
        return fechaFinExtra;
    }

    public void setFechaFinExtra(Date fechaFinExtra) {
        this.fechaFinExtra = fechaFinExtra;
    }

    public Date getHoraFinExtra() {
        return horaFinExtra;
    }

    public void setHoraFinExtra(Date horaFinExtra) {
        this.horaFinExtra = horaFinExtra;
    }

    public BigInteger getMinutosExtraTotal() {
        return minutosExtraTotal;
    }

    public void setMinutosExtraTotal(BigInteger minutosExtraTotal) {
        this.minutosExtraTotal = minutosExtraTotal;
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

    public CatalogoDextra getIdCatalogoDextra() {
        return idCatalogoDextra;
    }

    public void setIdCatalogoDextra(CatalogoDextra idCatalogoDextra) {
        this.idCatalogoDextra = idCatalogoDextra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMarcacionDextra != null ? idMarcacionDextra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarcacionDextra)) {
            return false;
        }
        MarcacionDextra other = (MarcacionDextra) object;
        if ((this.idMarcacionDextra == null && other.idMarcacionDextra != null) || (this.idMarcacionDextra != null && !this.idMarcacionDextra.equals(other.idMarcacionDextra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.MarcacionDextra[ idMarcacionDextra=" + idMarcacionDextra + " ]";
    }
    
}
