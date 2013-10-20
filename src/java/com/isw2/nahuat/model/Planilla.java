/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author karlos
 */
@Entity
@Table(name = "PLANILLA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planilla.findAll", query = "SELECT p FROM Planilla p"),
    @NamedQuery(name = "Planilla.findByIdPlanilla", query = "SELECT p FROM Planilla p WHERE p.idPlanilla = :idPlanilla"),
    @NamedQuery(name = "Planilla.findByFechaCreacion", query = "SELECT p FROM Planilla p WHERE p.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Planilla.findByFechaPago", query = "SELECT p FROM Planilla p WHERE p.fechaPago = :fechaPago"),
    @NamedQuery(name = "Planilla.findByTotalPagar", query = "SELECT p FROM Planilla p WHERE p.totalPagar = :totalPagar")})
public class Planilla implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_PLANILLA")
    private String idPlanilla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_PAGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_PAGAR")
    private short totalPagar;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne(optional = false)
    private Empresa idEmpresa;
    @JoinColumn(name = "ID_CATALOGO_PLANILLA", referencedColumnName = "ID_CATALOGO_PLANILLA")
    @ManyToOne(optional = false)
    private CatalogoPlanilla idCatalogoPlanilla;
    @JoinColumn(name = "ID_CATALOGO_PERIODO", referencedColumnName = "ID_CATALOGO_PERIODO")
    @ManyToOne(optional = false)
    private CatalogoPeriodo idCatalogoPeriodo;
    @JoinColumn(name = "ID_CATALOGO_ESTADO", referencedColumnName = "ID_CATALOGO_ESTADO")
    @ManyToOne(optional = false)
    private CatalogoEstado idCatalogoEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlanilla")
    private List<CatalogoIsr> catalogoIsrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlanilla")
    private List<DetallePlanilla> detallePlanillaList;

    public Planilla() {
    }

    public Planilla(String idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public Planilla(String idPlanilla, Date fechaCreacion, Date fechaPago, short totalPagar) {
        this.idPlanilla = idPlanilla;
        this.fechaCreacion = fechaCreacion;
        this.fechaPago = fechaPago;
        this.totalPagar = totalPagar;
    }

    public String getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(String idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public short getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(short totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public CatalogoPlanilla getIdCatalogoPlanilla() {
        return idCatalogoPlanilla;
    }

    public void setIdCatalogoPlanilla(CatalogoPlanilla idCatalogoPlanilla) {
        this.idCatalogoPlanilla = idCatalogoPlanilla;
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

    @XmlTransient
    public List<CatalogoIsr> getCatalogoIsrList() {
        return catalogoIsrList;
    }

    public void setCatalogoIsrList(List<CatalogoIsr> catalogoIsrList) {
        this.catalogoIsrList = catalogoIsrList;
    }

    @XmlTransient
    public List<DetallePlanilla> getDetallePlanillaList() {
        return detallePlanillaList;
    }

    public void setDetallePlanillaList(List<DetallePlanilla> detallePlanillaList) {
        this.detallePlanillaList = detallePlanillaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlanilla != null ? idPlanilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planilla)) {
            return false;
        }
        Planilla other = (Planilla) object;
        if ((this.idPlanilla == null && other.idPlanilla != null) || (this.idPlanilla != null && !this.idPlanilla.equals(other.idPlanilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.Planilla[ idPlanilla=" + idPlanilla + " ]";
    }
    
}
