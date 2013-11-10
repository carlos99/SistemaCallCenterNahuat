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
@Table(name = "EMPLEADO_EXPERIENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpleadoExperiencia.findAll", query = "SELECT e FROM EmpleadoExperiencia e"),
    @NamedQuery(name = "EmpleadoExperiencia.findByIdEmpleadoExperiencia", query = "SELECT e FROM EmpleadoExperiencia e WHERE e.idEmpleadoExperiencia = :idEmpleadoExperiencia"),
    @NamedQuery(name = "EmpleadoExperiencia.findBySalario", query = "SELECT e FROM EmpleadoExperiencia e WHERE e.salario = :salario"),
    @NamedQuery(name = "EmpleadoExperiencia.findByEmpresa", query = "SELECT e FROM EmpleadoExperiencia e WHERE e.empresa = :empresa"),
    @NamedQuery(name = "EmpleadoExperiencia.findByDescripcionExperiencia", query = "SELECT e FROM EmpleadoExperiencia e WHERE e.descripcionExperiencia = :descripcionExperiencia"),
    @NamedQuery(name = "EmpleadoExperiencia.findByFechaInicio", query = "SELECT e FROM EmpleadoExperiencia e WHERE e.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "EmpleadoExperiencia.findByFechaFin", query = "SELECT e FROM EmpleadoExperiencia e WHERE e.fechaFin = :fechaFin")})
public class EmpleadoExperiencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_EMPLEADO_EXPERIENCIA")
    private String idEmpleadoExperiencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SALARIO")
    private BigInteger salario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "EMPRESA")
    private String empresa;
    @Size(max = 50)
    @Column(name = "DESCRIPCION_EXPERIENCIA")
    private String descripcionExperiencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "ID_CATALOGO_CARGO", referencedColumnName = "ID_CATALOGO_CARGO")
    @ManyToOne(optional = false)
    private CatalogoCargo idCatalogoCargo;

    public EmpleadoExperiencia() {
    }

    public EmpleadoExperiencia(String idEmpleadoExperiencia) {
        this.idEmpleadoExperiencia = idEmpleadoExperiencia;
    }

    public EmpleadoExperiencia(String idEmpleadoExperiencia, BigInteger salario, String empresa, Date fechaInicio, Date fechaFin) {
        this.idEmpleadoExperiencia = idEmpleadoExperiencia;
        this.salario = salario;
        this.empresa = empresa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getIdEmpleadoExperiencia() {
        return idEmpleadoExperiencia;
    }

    public void setIdEmpleadoExperiencia(String idEmpleadoExperiencia) {
        this.idEmpleadoExperiencia = idEmpleadoExperiencia;
    }

    public BigInteger getSalario() {
        return salario;
    }

    public void setSalario(BigInteger salario) {
        this.salario = salario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcionExperiencia() {
        return descripcionExperiencia;
    }

    public void setDescripcionExperiencia(String descripcionExperiencia) {
        this.descripcionExperiencia = descripcionExperiencia;
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

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
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
        hash += (idEmpleadoExperiencia != null ? idEmpleadoExperiencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoExperiencia)) {
            return false;
        }
        EmpleadoExperiencia other = (EmpleadoExperiencia) object;
        if ((this.idEmpleadoExperiencia == null && other.idEmpleadoExperiencia != null) || (this.idEmpleadoExperiencia != null && !this.idEmpleadoExperiencia.equals(other.idEmpleadoExperiencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.EmpleadoExperiencia[ idEmpleadoExperiencia=" + idEmpleadoExperiencia + " ]";
    }
    
}
