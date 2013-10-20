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
@Table(name = "CONTRATACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contratacion.findAll", query = "SELECT c FROM Contratacion c"),
    @NamedQuery(name = "Contratacion.findByIdContratacion", query = "SELECT c FROM Contratacion c WHERE c.idContratacion = :idContratacion"),
    @NamedQuery(name = "Contratacion.findByFechaInicio", query = "SELECT c FROM Contratacion c WHERE c.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Contratacion.findByFechaFin", query = "SELECT c FROM Contratacion c WHERE c.fechaFin = :fechaFin"),
    @NamedQuery(name = "Contratacion.findBySalarioActual", query = "SELECT c FROM Contratacion c WHERE c.salarioActual = :salarioActual")})
public class Contratacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CONTRATACION")
    private String idContratacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SALARIO_ACTUAL")
    private String salarioActual;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne(optional = false)
    private Empresa idEmpresa;
    @JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "ID_CATALOGO_HORARIO", referencedColumnName = "ID_CATALOGO_HORARIO")
    @ManyToOne(optional = false)
    private CatalogoHorario idCatalogoHorario;
    @JoinColumn(name = "ID_CATALOGO_CONTRATACION", referencedColumnName = "ID_CATALOGO_CONTRATACION")
    @ManyToOne(optional = false)
    private CatalogoContratacion idCatalogoContratacion;
    @JoinColumn(name = "ID_CATALOGO_CARGO", referencedColumnName = "ID_CATALOGO_CARGO")
    @ManyToOne(optional = false)
    private CatalogoCargo idCatalogoCargo;

    public Contratacion() {
    }

    public Contratacion(String idContratacion) {
        this.idContratacion = idContratacion;
    }

    public Contratacion(String idContratacion, Date fechaInicio, String salarioActual) {
        this.idContratacion = idContratacion;
        this.fechaInicio = fechaInicio;
        this.salarioActual = salarioActual;
    }

    public String getIdContratacion() {
        return idContratacion;
    }

    public void setIdContratacion(String idContratacion) {
        this.idContratacion = idContratacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getSalarioActual() {
        return salarioActual;
    }

    public void setSalarioActual(String salarioActual) {
        this.salarioActual = salarioActual;
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

    public CatalogoHorario getIdCatalogoHorario() {
        return idCatalogoHorario;
    }

    public void setIdCatalogoHorario(CatalogoHorario idCatalogoHorario) {
        this.idCatalogoHorario = idCatalogoHorario;
    }

    public CatalogoContratacion getIdCatalogoContratacion() {
        return idCatalogoContratacion;
    }

    public void setIdCatalogoContratacion(CatalogoContratacion idCatalogoContratacion) {
        this.idCatalogoContratacion = idCatalogoContratacion;
    }

    public CatalogoCargo getIdCatalogoCargo() {
        return idCatalogoCargo;
    }

    public void setIdCatalogoCargo(CatalogoCargo idCatalogoCargo) {
        this.idCatalogoCargo = idCatalogoCargo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idContratacion != null ? idContratacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contratacion)) {
            return false;
        }
        Contratacion other = (Contratacion) object;
        if ((this.idContratacion == null && other.idContratacion != null) || (this.idContratacion != null && !this.idContratacion.equals(other.idContratacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.Contratacion[ idContratacion=" + idContratacion + " ]";
    }
    
}
