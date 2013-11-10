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
@Table(name = "EMPLEADO_ESTUDIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpleadoEstudio.findAll", query = "SELECT e FROM EmpleadoEstudio e"),
    @NamedQuery(name = "EmpleadoEstudio.findByIdEmpleadoEstudio", query = "SELECT e FROM EmpleadoEstudio e WHERE e.idEmpleadoEstudio = :idEmpleadoEstudio"),
    @NamedQuery(name = "EmpleadoEstudio.findByInstitucion", query = "SELECT e FROM EmpleadoEstudio e WHERE e.institucion = :institucion"),
    @NamedQuery(name = "EmpleadoEstudio.findByFechaFinalizacion", query = "SELECT e FROM EmpleadoEstudio e WHERE e.fechaFinalizacion = :fechaFinalizacion"),
    @NamedQuery(name = "EmpleadoEstudio.findByIdEmpleado", query = "SELECT e FROM EmpleadoEstudio e WHERE e.idEmpleado = :idEmpleado"),
    @NamedQuery(name = "EmpleadoEstudio.findByIdCatalogoEstudio", query = "SELECT e FROM EmpleadoEstudio e WHERE e.idCatalogoEstudio = :idCatalogoEstudio")})
public class EmpleadoEstudio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_EMPLEADO_ESTUDIO")
    private String idEmpleadoEstudio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "INSTITUCION")
    private String institucion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FECHA_FINALIZACION")
    private String fechaFinalizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_EMPLEADO")
    private String idEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_CATALOGO_ESTUDIO")
    private String idCatalogoEstudio;

    public EmpleadoEstudio() {
    }

    public EmpleadoEstudio(String idEmpleadoEstudio) {
        this.idEmpleadoEstudio = idEmpleadoEstudio;
    }

    public EmpleadoEstudio(String idEmpleadoEstudio, String institucion, String fechaFinalizacion, String idEmpleado, String idCatalogoEstudio) {
        this.idEmpleadoEstudio = idEmpleadoEstudio;
        this.institucion = institucion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.idEmpleado = idEmpleado;
        this.idCatalogoEstudio = idCatalogoEstudio;
    }

    public String getIdEmpleadoEstudio() {
        return idEmpleadoEstudio;
    }

    public void setIdEmpleadoEstudio(String idEmpleadoEstudio) {
        this.idEmpleadoEstudio = idEmpleadoEstudio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getIdCatalogoEstudio() {
        return idCatalogoEstudio;
    }

    public void setIdCatalogoEstudio(String idCatalogoEstudio) {
        this.idCatalogoEstudio = idCatalogoEstudio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleadoEstudio != null ? idEmpleadoEstudio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoEstudio)) {
            return false;
        }
        EmpleadoEstudio other = (EmpleadoEstudio) object;
        if ((this.idEmpleadoEstudio == null && other.idEmpleadoEstudio != null) || (this.idEmpleadoEstudio != null && !this.idEmpleadoEstudio.equals(other.idEmpleadoEstudio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.EmpleadoEstudio[ idEmpleadoEstudio=" + idEmpleadoEstudio + " ]";
    }
    
}
