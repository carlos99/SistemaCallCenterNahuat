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
@Table(name = "MARCACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marcacion.findAll", query = "SELECT m FROM Marcacion m"),
    @NamedQuery(name = "Marcacion.findByIdMarcacion", query = "SELECT m FROM Marcacion m WHERE m.idMarcacion = :idMarcacion"),
    @NamedQuery(name = "Marcacion.findByFechaMarcacion", query = "SELECT m FROM Marcacion m WHERE m.fechaMarcacion = :fechaMarcacion"),
    @NamedQuery(name = "Marcacion.findByHoraMarcacion", query = "SELECT m FROM Marcacion m WHERE m.horaMarcacion = :horaMarcacion")})
public class Marcacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_MARCACION")
    private String idMarcacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_MARCACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMarcacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HORA_MARCACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaMarcacion;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne(optional = false)
    private Empresa idEmpresa;
    @JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "ID_CATALOGO_PERIODO", referencedColumnName = "ID_CATALOGO_PERIODO")
    @ManyToOne(optional = false)
    private CatalogoPeriodo idCatalogoPeriodo;

    public Marcacion() {
    }

    public Marcacion(String idMarcacion) {
        this.idMarcacion = idMarcacion;
    }

    public Marcacion(String idMarcacion, Date fechaMarcacion, Date horaMarcacion) {
        this.idMarcacion = idMarcacion;
        this.fechaMarcacion = fechaMarcacion;
        this.horaMarcacion = horaMarcacion;
    }

    public String getIdMarcacion() {
        return idMarcacion;
    }

    public void setIdMarcacion(String idMarcacion) {
        this.idMarcacion = idMarcacion;
    }

    public Date getFechaMarcacion() {
        return fechaMarcacion;
    }

    public void setFechaMarcacion(Date fechaMarcacion) {
        this.fechaMarcacion = fechaMarcacion;
    }

    public Date getHoraMarcacion() {
        return horaMarcacion;
    }

    public void setHoraMarcacion(Date horaMarcacion) {
        this.horaMarcacion = horaMarcacion;
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

    public CatalogoPeriodo getIdCatalogoPeriodo() {
        return idCatalogoPeriodo;
    }

    public void setIdCatalogoPeriodo(CatalogoPeriodo idCatalogoPeriodo) {
        this.idCatalogoPeriodo = idCatalogoPeriodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMarcacion != null ? idMarcacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marcacion)) {
            return false;
        }
        Marcacion other = (Marcacion) object;
        if ((this.idMarcacion == null && other.idMarcacion != null) || (this.idMarcacion != null && !this.idMarcacion.equals(other.idMarcacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.Marcacion[ idMarcacion=" + idMarcacion + " ]";
    }
    
}
