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
@Table(name = "DPLANILLA_INGRESO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DplanillaIngreso.findAll", query = "SELECT d FROM DplanillaIngreso d"),
    @NamedQuery(name = "DplanillaIngreso.findByIdDplanillaIngreso", query = "SELECT d FROM DplanillaIngreso d WHERE d.idDplanillaIngreso = :idDplanillaIngreso"),
    @NamedQuery(name = "DplanillaIngreso.findByMonto", query = "SELECT d FROM DplanillaIngreso d WHERE d.monto = :monto")})
public class DplanillaIngreso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_DPLANILLA_INGRESO")
    private String idDplanillaIngreso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTO")
    private short monto;
    @JoinColumn(name = "ID_DETALLE_PLANILLA", referencedColumnName = "ID_DETALLE_PLANILLA")
    @ManyToOne(optional = false)
    private DetallePlanilla idDetallePlanilla;
    @JoinColumn(name = "ID_CATALOGO_INGRESO", referencedColumnName = "ID_CATALOGO_INGRESO")
    @ManyToOne(optional = false)
    private CatalogoIngreso idCatalogoIngreso;

    public DplanillaIngreso() {
    }

    public DplanillaIngreso(String idDplanillaIngreso) {
        this.idDplanillaIngreso = idDplanillaIngreso;
    }

    public DplanillaIngreso(String idDplanillaIngreso, short monto) {
        this.idDplanillaIngreso = idDplanillaIngreso;
        this.monto = monto;
    }

    public String getIdDplanillaIngreso() {
        return idDplanillaIngreso;
    }

    public void setIdDplanillaIngreso(String idDplanillaIngreso) {
        this.idDplanillaIngreso = idDplanillaIngreso;
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

    public CatalogoIngreso getIdCatalogoIngreso() {
        return idCatalogoIngreso;
    }

    public void setIdCatalogoIngreso(CatalogoIngreso idCatalogoIngreso) {
        this.idCatalogoIngreso = idCatalogoIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDplanillaIngreso != null ? idDplanillaIngreso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DplanillaIngreso)) {
            return false;
        }
        DplanillaIngreso other = (DplanillaIngreso) object;
        if ((this.idDplanillaIngreso == null && other.idDplanillaIngreso != null) || (this.idDplanillaIngreso != null && !this.idDplanillaIngreso.equals(other.idDplanillaIngreso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.DplanillaIngreso[ idDplanillaIngreso=" + idDplanillaIngreso + " ]";
    }
    
}
