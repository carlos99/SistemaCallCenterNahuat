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
@Table(name = "EMPRESA_CONTACTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpresaContacto.findAll", query = "SELECT e FROM EmpresaContacto e"),
    @NamedQuery(name = "EmpresaContacto.findByIdEmpresaContacto", query = "SELECT e FROM EmpresaContacto e WHERE e.idEmpresaContacto = :idEmpresaContacto"),
    @NamedQuery(name = "EmpresaContacto.findByFechaCreacion", query = "SELECT e FROM EmpresaContacto e WHERE e.fechaCreacion = :fechaCreacion")})
public class EmpresaContacto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_EMPRESA_CONTACTO")
    private String idEmpresaContacto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne(optional = false)
    private Empresa idEmpresa;
    @JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;

    public EmpresaContacto() {
    }

    public EmpresaContacto(String idEmpresaContacto) {
        this.idEmpresaContacto = idEmpresaContacto;
    }

    public EmpresaContacto(String idEmpresaContacto, Date fechaCreacion) {
        this.idEmpresaContacto = idEmpresaContacto;
        this.fechaCreacion = fechaCreacion;
    }

    public String getIdEmpresaContacto() {
        return idEmpresaContacto;
    }

    public void setIdEmpresaContacto(String idEmpresaContacto) {
        this.idEmpresaContacto = idEmpresaContacto;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresaContacto != null ? idEmpresaContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaContacto)) {
            return false;
        }
        EmpresaContacto other = (EmpresaContacto) object;
        if ((this.idEmpresaContacto == null && other.idEmpresaContacto != null) || (this.idEmpresaContacto != null && !this.idEmpresaContacto.equals(other.idEmpresaContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.EmpresaContacto[ idEmpresaContacto=" + idEmpresaContacto + " ]";
    }
    
}
