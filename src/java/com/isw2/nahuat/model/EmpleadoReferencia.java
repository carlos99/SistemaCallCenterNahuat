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
 * @author carlos
 */
@Entity
@Table(name = "EMPLEADO_REFERENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpleadoReferencia.findAll", query = "SELECT e FROM EmpleadoReferencia e"),
    @NamedQuery(name = "EmpleadoReferencia.findByIdEmpleadoReferencia", query = "SELECT e FROM EmpleadoReferencia e WHERE e.idEmpleadoReferencia = :idEmpleadoReferencia"),
    @NamedQuery(name = "EmpleadoReferencia.findByNombreReferencia", query = "SELECT e FROM EmpleadoReferencia e WHERE e.nombreReferencia = :nombreReferencia"),
    @NamedQuery(name = "EmpleadoReferencia.findByTelefono", query = "SELECT e FROM EmpleadoReferencia e WHERE e.telefono = :telefono")})
public class EmpleadoReferencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_EMPLEADO_REFERENCIA")
    private String idEmpleadoReferencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE_REFERENCIA")
    private String nombreReferencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "TELEFONO")
    private String telefono;
    @JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "ID_CATALOGO_REFENCIA", referencedColumnName = "ID_CATALOGO_REFERENCIA")
    @ManyToOne(optional = false)
    private CatalogoReferencia idCatalogoRefencia;

    public EmpleadoReferencia() {
    }

    public EmpleadoReferencia(String idEmpleadoReferencia) {
        this.idEmpleadoReferencia = idEmpleadoReferencia;
    }

    public EmpleadoReferencia(String idEmpleadoReferencia, String nombreReferencia, String telefono) {
        this.idEmpleadoReferencia = idEmpleadoReferencia;
        this.nombreReferencia = nombreReferencia;
        this.telefono = telefono;
    }

    public String getIdEmpleadoReferencia() {
        return idEmpleadoReferencia;
    }

    public void setIdEmpleadoReferencia(String idEmpleadoReferencia) {
        this.idEmpleadoReferencia = idEmpleadoReferencia;
    }

    public String getNombreReferencia() {
        return nombreReferencia;
    }

    public void setNombreReferencia(String nombreReferencia) {
        this.nombreReferencia = nombreReferencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public CatalogoReferencia getIdCatalogoRefencia() {
        return idCatalogoRefencia;
    }

    public void setIdCatalogoRefencia(CatalogoReferencia idCatalogoRefencia) {
        this.idCatalogoRefencia = idCatalogoRefencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleadoReferencia != null ? idEmpleadoReferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoReferencia)) {
            return false;
        }
        EmpleadoReferencia other = (EmpleadoReferencia) object;
        if ((this.idEmpleadoReferencia == null && other.idEmpleadoReferencia != null) || (this.idEmpleadoReferencia != null && !this.idEmpleadoReferencia.equals(other.idEmpleadoReferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.EmpleadoReferencia[ idEmpleadoReferencia=" + idEmpleadoReferencia + " ]";
    }
    
}
