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
 * @author karlos
 */
@Entity
@Table(name = "DPLANILLA_EGRESO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DplanillaEgreso.findAll", query = "SELECT d FROM DplanillaEgreso d"),
    @NamedQuery(name = "DplanillaEgreso.findByIdDplanillaEgreso", query = "SELECT d FROM DplanillaEgreso d WHERE d.idDplanillaEgreso = :idDplanillaEgreso"),
    @NamedQuery(name = "DplanillaEgreso.findByMonto", query = "SELECT d FROM DplanillaEgreso d WHERE d.monto = :monto")})
public class DplanillaEgreso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_DPLANILLA_EGRESO")
    private String idDplanillaEgreso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTO")
    private short monto;
    @JoinColumn(name = "ID_DETALLE_PLANILLA", referencedColumnName = "ID_DETALLE_PLANILLA")
    @ManyToOne(optional = false)
    private DetallePlanilla idDetallePlanilla;
    @JoinColumn(name = "ID_CATALOGO_EGRESO", referencedColumnName = "ID_CATALOGO_EGRESO")
    @ManyToOne(optional = false)
    private CatalogoEgreso idCatalogoEgreso;

    public DplanillaEgreso() {
    }

    public DplanillaEgreso(String idDplanillaEgreso) {
        this.idDplanillaEgreso = idDplanillaEgreso;
    }

    public DplanillaEgreso(String idDplanillaEgreso, short monto) {
        this.idDplanillaEgreso = idDplanillaEgreso;
        this.monto = monto;
    }

    public String getIdDplanillaEgreso() {
        return idDplanillaEgreso;
    }

    public void setIdDplanillaEgreso(String idDplanillaEgreso) {
        this.idDplanillaEgreso = idDplanillaEgreso;
    }

    public short getMonto() {
        return monto;
    }

    public void setMonto(short monto) {
        this.monto = monto;
    }

    public DetallePlanilla getIdDetallePlanilla() {
        return idDetallePlanilla;
    }

    public void setIdDetallePlanilla(DetallePlanilla idDetallePlanilla) {
        this.idDetallePlanilla = idDetallePlanilla;
    }

    public CatalogoEgreso getIdCatalogoEgreso() {
        return idCatalogoEgreso;
    }

    public void setIdCatalogoEgreso(CatalogoEgreso idCatalogoEgreso) {
        this.idCatalogoEgreso = idCatalogoEgreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDplanillaEgreso != null ? idDplanillaEgreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DplanillaEgreso)) {
            return false;
        }
        DplanillaEgreso other = (DplanillaEgreso) object;
        if ((this.idDplanillaEgreso == null && other.idDplanillaEgreso != null) || (this.idDplanillaEgreso != null && !this.idDplanillaEgreso.equals(other.idDplanillaEgreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.DplanillaEgreso[ idDplanillaEgreso=" + idDplanillaEgreso + " ]";
    }
    
}
