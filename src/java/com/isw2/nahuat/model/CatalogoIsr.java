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
 * @author carlos
 */
@Entity
@Table(name = "CATALOGO_ISR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoIsr.findAll", query = "SELECT c FROM CatalogoIsr c"),
    @NamedQuery(name = "CatalogoIsr.findByIdCatalogoIsr", query = "SELECT c FROM CatalogoIsr c WHERE c.idCatalogoIsr = :idCatalogoIsr"),
    @NamedQuery(name = "CatalogoIsr.findByDesde", query = "SELECT c FROM CatalogoIsr c WHERE c.desde = :desde"),
    @NamedQuery(name = "CatalogoIsr.findByHasta", query = "SELECT c FROM CatalogoIsr c WHERE c.hasta = :hasta"),
    @NamedQuery(name = "CatalogoIsr.findByPorcentajeAplicar", query = "SELECT c FROM CatalogoIsr c WHERE c.porcentajeAplicar = :porcentajeAplicar"),
    @NamedQuery(name = "CatalogoIsr.findByMontoExceso", query = "SELECT c FROM CatalogoIsr c WHERE c.montoExceso = :montoExceso"),
    @NamedQuery(name = "CatalogoIsr.findByCuotaFija", query = "SELECT c FROM CatalogoIsr c WHERE c.cuotaFija = :cuotaFija")})
public class CatalogoIsr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_CATALOGO_ISR")
    private String idCatalogoIsr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DESDE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date desde;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HASTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hasta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PORCENTAJE_APLICAR")
    private short porcentajeAplicar;
    @Column(name = "MONTO_EXCESO")
    private Short montoExceso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUOTA_FIJA")
    private short cuotaFija;
    @JoinColumn(name = "ID_PLANILLA", referencedColumnName = "ID_PLANILLA")
    @ManyToOne(optional = false)
    private Planilla idPlanilla;
    @JoinColumn(name = "ID_CATALOGO_ESTADO", referencedColumnName = "ID_CATALOGO_ESTADO")
    @ManyToOne(optional = false)
    private CatalogoEstado idCatalogoEstado;

    public CatalogoIsr() {
    }

    public CatalogoIsr(String idCatalogoIsr) {
        this.idCatalogoIsr = idCatalogoIsr;
    }

    public CatalogoIsr(String idCatalogoIsr, Date desde, Date hasta, short porcentajeAplicar, short cuotaFija) {
        this.idCatalogoIsr = idCatalogoIsr;
        this.desde = desde;
        this.hasta = hasta;
        this.porcentajeAplicar = porcentajeAplicar;
        this.cuotaFija = cuotaFija;
    }

    public String getIdCatalogoIsr() {
        return idCatalogoIsr;
    }

    public void setIdCatalogoIsr(String idCatalogoIsr) {
        this.idCatalogoIsr = idCatalogoIsr;
    }

    public Date getDesde() {
        return desde;
    }

    public void setDesde(Date desde) {
        this.desde = desde;
    }

    public Date getHasta() {
        return hasta;
    }

    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }

    public short getPorcentajeAplicar() {
        return porcentajeAplicar;
    }

    public void setPorcentajeAplicar(short porcentajeAplicar) {
        this.porcentajeAplicar = porcentajeAplicar;
    }

    public Short getMontoExceso() {
        return montoExceso;
    }

    public void setMontoExceso(Short montoExceso) {
        this.montoExceso = montoExceso;
    }

    public short getCuotaFija() {
        return cuotaFija;
    }

    public void setCuotaFija(short cuotaFija) {
        this.cuotaFija = cuotaFija;
    }

    public Planilla getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(Planilla idPlanilla) {
        this.idPlanilla = idPlanilla;
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
        hash += (idCatalogoIsr != null ? idCatalogoIsr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoIsr)) {
            return false;
        }
        CatalogoIsr other = (CatalogoIsr) object;
        if ((this.idCatalogoIsr == null && other.idCatalogoIsr != null) || (this.idCatalogoIsr != null && !this.idCatalogoIsr.equals(other.idCatalogoIsr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoIsr[ idCatalogoIsr=" + idCatalogoIsr + " ]";
    }
    
}
