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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "DETALLE_PLANILLA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallePlanilla.findAll", query = "SELECT d FROM DetallePlanilla d"),
    @NamedQuery(name = "DetallePlanilla.findByIdDetallePlanilla", query = "SELECT d FROM DetallePlanilla d WHERE d.idDetallePlanilla = :idDetallePlanilla"),
    @NamedQuery(name = "DetallePlanilla.findByIngresoBase", query = "SELECT d FROM DetallePlanilla d WHERE d.ingresoBase = :ingresoBase"),
    @NamedQuery(name = "DetallePlanilla.findByIngresoOtrosTotal", query = "SELECT d FROM DetallePlanilla d WHERE d.ingresoOtrosTotal = :ingresoOtrosTotal"),
    @NamedQuery(name = "DetallePlanilla.findByIsss", query = "SELECT d FROM DetallePlanilla d WHERE d.isss = :isss"),
    @NamedQuery(name = "DetallePlanilla.findByAfp", query = "SELECT d FROM DetallePlanilla d WHERE d.afp = :afp"),
    @NamedQuery(name = "DetallePlanilla.findByIpsfa", query = "SELECT d FROM DetallePlanilla d WHERE d.ipsfa = :ipsfa"),
    @NamedQuery(name = "DetallePlanilla.findByRenta", query = "SELECT d FROM DetallePlanilla d WHERE d.renta = :renta"),
    @NamedQuery(name = "DetallePlanilla.findByAdelantoSalario", query = "SELECT d FROM DetallePlanilla d WHERE d.adelantoSalario = :adelantoSalario"),
    @NamedQuery(name = "DetallePlanilla.findByDeduccionOtros", query = "SELECT d FROM DetallePlanilla d WHERE d.deduccionOtros = :deduccionOtros"),
    @NamedQuery(name = "DetallePlanilla.findBySalarioNeto", query = "SELECT d FROM DetallePlanilla d WHERE d.salarioNeto = :salarioNeto")})
public class DetallePlanilla implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_DETALLE_PLANILLA")
    private String idDetallePlanilla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INGRESO_BASE")
    private BigInteger ingresoBase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "INGRESO_OTROS_TOTAL")
    private BigInteger ingresoOtrosTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ISSS")
    private BigInteger isss;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AFP")
    private BigInteger afp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IPSFA")
    private BigInteger ipsfa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RENTA")
    private BigInteger renta;
    @Column(name = "ADELANTO_SALARIO")
    private BigInteger adelantoSalario;
    @Column(name = "DEDUCCION_OTROS")
    private BigInteger deduccionOtros;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SALARIO_NETO")
    private BigInteger salarioNeto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDetallePlanilla")
    private List<DplanillaEgreso> dplanillaEgresoList;
    @JoinColumn(name = "ID_PLANILLA", referencedColumnName = "ID_PLANILLA")
    @ManyToOne(optional = false)
    private Planilla idPlanilla;
    @JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDetallePlanilla")
    private List<DplanillaIngreso> dplanillaIngresoList;

    public DetallePlanilla() {
    }

    public DetallePlanilla(String idDetallePlanilla) {
        this.idDetallePlanilla = idDetallePlanilla;
    }

    public DetallePlanilla(String idDetallePlanilla, BigInteger ingresoBase, BigInteger ingresoOtrosTotal, BigInteger isss, BigInteger afp, BigInteger ipsfa, BigInteger renta, BigInteger salarioNeto) {
        this.idDetallePlanilla = idDetallePlanilla;
        this.ingresoBase = ingresoBase;
        this.ingresoOtrosTotal = ingresoOtrosTotal;
        this.isss = isss;
        this.afp = afp;
        this.ipsfa = ipsfa;
        this.renta = renta;
        this.salarioNeto = salarioNeto;
    }

    public String getIdDetallePlanilla() {
        return idDetallePlanilla;
    }

    public void setIdDetallePlanilla(String idDetallePlanilla) {
        this.idDetallePlanilla = idDetallePlanilla;
    }

    public BigInteger getIngresoBase() {
        return ingresoBase;
    }

    public void setIngresoBase(BigInteger ingresoBase) {
        this.ingresoBase = ingresoBase;
    }

    public BigInteger getIngresoOtrosTotal() {
        return ingresoOtrosTotal;
    }

    public void setIngresoOtrosTotal(BigInteger ingresoOtrosTotal) {
        this.ingresoOtrosTotal = ingresoOtrosTotal;
    }

    public BigInteger getIsss() {
        return isss;
    }

    public void setIsss(BigInteger isss) {
        this.isss = isss;
    }

    public BigInteger getAfp() {
        return afp;
    }

    public void setAfp(BigInteger afp) {
        this.afp = afp;
    }

    public BigInteger getIpsfa() {
        return ipsfa;
    }

    public void setIpsfa(BigInteger ipsfa) {
        this.ipsfa = ipsfa;
    }

    public BigInteger getRenta() {
        return renta;
    }

    public void setRenta(BigInteger renta) {
        this.renta = renta;
    }

    public BigInteger getAdelantoSalario() {
        return adelantoSalario;
    }

    public void setAdelantoSalario(BigInteger adelantoSalario) {
        this.adelantoSalario = adelantoSalario;
    }

    public BigInteger getDeduccionOtros() {
        return deduccionOtros;
    }

    public void setDeduccionOtros(BigInteger deduccionOtros) {
        this.deduccionOtros = deduccionOtros;
    }

    public BigInteger getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(BigInteger salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    @XmlTransient
    public List<DplanillaEgreso> getDplanillaEgresoList() {
        return dplanillaEgresoList;
    }

    public void setDplanillaEgresoList(List<DplanillaEgreso> dplanillaEgresoList) {
        this.dplanillaEgresoList = dplanillaEgresoList;
    }

    public Planilla getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(Planilla idPlanilla) {
        this.idPlanilla = idPlanilla;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
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
        hash += (idDetallePlanilla != null ? idDetallePlanilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePlanilla)) {
            return false;
        }
        DetallePlanilla other = (DetallePlanilla) object;
        if ((this.idDetallePlanilla == null && other.idDetallePlanilla != null) || (this.idDetallePlanilla != null && !this.idDetallePlanilla.equals(other.idDetallePlanilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.DetallePlanilla[ idDetallePlanilla=" + idDetallePlanilla + " ]";
    }
    
}
