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
@Table(name = "EMPLEADO_DOCUMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpleadoDocumento.findAll", query = "SELECT e FROM EmpleadoDocumento e"),
    @NamedQuery(name = "EmpleadoDocumento.findByIdEmpleadoDocumento", query = "SELECT e FROM EmpleadoDocumento e WHERE e.idEmpleadoDocumento = :idEmpleadoDocumento"),
    @NamedQuery(name = "EmpleadoDocumento.findByInstitucion", query = "SELECT e FROM EmpleadoDocumento e WHERE e.institucion = :institucion"),
    @NamedQuery(name = "EmpleadoDocumento.findByFechaEmision", query = "SELECT e FROM EmpleadoDocumento e WHERE e.fechaEmision = :fechaEmision"),
    @NamedQuery(name = "EmpleadoDocumento.findByLugarEmision", query = "SELECT e FROM EmpleadoDocumento e WHERE e.lugarEmision = :lugarEmision"),
    @NamedQuery(name = "EmpleadoDocumento.findByFechaVencimiento", query = "SELECT e FROM EmpleadoDocumento e WHERE e.fechaVencimiento = :fechaVencimiento")})
public class EmpleadoDocumento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_EMPLEADO_DOCUMENTO")
    private String idEmpleadoDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "INSTITUCION")
    private String institucion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_EMISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LUGAR_EMISION")
    private String lugarEmision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FECHA_VENCIMIENTO")
    private String fechaVencimiento;
    @JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "ID_CATALOGO_DOCUMENTO", referencedColumnName = "ID_CATALOGO_DOCUMENTO")
    @ManyToOne(optional = false)
    private CatalogoDocumento idCatalogoDocumento;

    public EmpleadoDocumento() {
    }

    public EmpleadoDocumento(String idEmpleadoDocumento) {
        this.idEmpleadoDocumento = idEmpleadoDocumento;
    }

    public EmpleadoDocumento(String idEmpleadoDocumento, String institucion, Date fechaEmision, String lugarEmision, String fechaVencimiento) {
        this.idEmpleadoDocumento = idEmpleadoDocumento;
        this.institucion = institucion;
        this.fechaEmision = fechaEmision;
        this.lugarEmision = lugarEmision;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getIdEmpleadoDocumento() {
        return idEmpleadoDocumento;
    }

    public void setIdEmpleadoDocumento(String idEmpleadoDocumento) {
        this.idEmpleadoDocumento = idEmpleadoDocumento;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getLugarEmision() {
        return lugarEmision;
    }

    public void setLugarEmision(String lugarEmision) {
        this.lugarEmision = lugarEmision;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public CatalogoDocumento getIdCatalogoDocumento() {
        return idCatalogoDocumento;
    }

    public void setIdCatalogoDocumento(CatalogoDocumento idCatalogoDocumento) {
        this.idCatalogoDocumento = idCatalogoDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleadoDocumento != null ? idEmpleadoDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoDocumento)) {
            return false;
        }
        EmpleadoDocumento other = (EmpleadoDocumento) object;
        if ((this.idEmpleadoDocumento == null && other.idEmpleadoDocumento != null) || (this.idEmpleadoDocumento != null && !this.idEmpleadoDocumento.equals(other.idEmpleadoDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.EmpleadoDocumento[ idEmpleadoDocumento=" + idEmpleadoDocumento + " ]";
    }
    
}
