/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author karlos
 */
@Entity
@Table(name = "CATALOGO_PERIODO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoPeriodo.findAll", query = "SELECT c FROM CatalogoPeriodo c"),
    @NamedQuery(name = "CatalogoPeriodo.findByIdCatalogoPeriodo", query = "SELECT c FROM CatalogoPeriodo c WHERE c.idCatalogoPeriodo = :idCatalogoPeriodo"),
    @NamedQuery(name = "CatalogoPeriodo.findByNombre", query = "SELECT c FROM CatalogoPeriodo c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoPeriodo.findByFechaInicio", query = "SELECT c FROM CatalogoPeriodo c WHERE c.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "CatalogoPeriodo.findByFechaFin", query = "SELECT c FROM CatalogoPeriodo c WHERE c.fechaFin = :fechaFin"),
    @NamedQuery(name = "CatalogoPeriodo.findByTotalDias", query = "SELECT c FROM CatalogoPeriodo c WHERE c.totalDias = :totalDias")})
public class CatalogoPeriodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_PERIODO")
    private String idCatalogoPeriodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_DIAS")
    private BigInteger totalDias;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoPeriodo")
    private List<EmpresaConfiguracion> empresaConfiguracionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoPeriodo")
    private List<Planilla> planillaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoPeriodo")
    private List<MarcacionDextra> marcacionDextraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoPeriodo")
    private List<Marcacion> marcacionList;
    @JoinColumn(name = "ID_CATALOGO_ESTADO", referencedColumnName = "ID_CATALOGO_ESTADO")
    @ManyToOne(optional = false)
    private CatalogoEstado idCatalogoEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoPeriodo")
    private List<AdelantoSalario> adelantoSalarioList;

    public CatalogoPeriodo() {
    }

    public CatalogoPeriodo(String idCatalogoPeriodo) {
        this.idCatalogoPeriodo = idCatalogoPeriodo;
    }

    public CatalogoPeriodo(String idCatalogoPeriodo, String nombre, Date fechaInicio, Date fechaFin, BigInteger totalDias) {
        this.idCatalogoPeriodo = idCatalogoPeriodo;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.totalDias = totalDias;
    }

    public String getIdCatalogoPeriodo() {
        return idCatalogoPeriodo;
    }

    public void setIdCatalogoPeriodo(String idCatalogoPeriodo) {
        this.idCatalogoPeriodo = idCatalogoPeriodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public BigInteger getTotalDias() {
        return totalDias;
    }

    public void setTotalDias(BigInteger totalDias) {
        this.totalDias = totalDias;
    }

    @XmlTransient
    public List<EmpresaConfiguracion> getEmpresaConfiguracionList() {
        return empresaConfiguracionList;
    }

    public void setEmpresaConfiguracionList(List<EmpresaConfiguracion> empresaConfiguracionList) {
        this.empresaConfiguracionList = empresaConfiguracionList;
    }

    @XmlTransient
    public List<Planilla> getPlanillaList() {
        return planillaList;
    }

    public void setPlanillaList(List<Planilla> planillaList) {
        this.planillaList = planillaList;
    }

    @XmlTransient
    public List<MarcacionDextra> getMarcacionDextraList() {
        return marcacionDextraList;
    }

    public void setMarcacionDextraList(List<MarcacionDextra> marcacionDextraList) {
        this.marcacionDextraList = marcacionDextraList;
    }

    @XmlTransient
    public List<Marcacion> getMarcacionList() {
        return marcacionList;
    }

    public void setMarcacionList(List<Marcacion> marcacionList) {
        this.marcacionList = marcacionList;
    }

    public CatalogoEstado getIdCatalogoEstado() {
        return idCatalogoEstado;
    }

    public void setIdCatalogoEstado(CatalogoEstado idCatalogoEstado) {
        this.idCatalogoEstado = idCatalogoEstado;
    }

    @XmlTransient
    public List<AdelantoSalario> getAdelantoSalarioList() {
        return adelantoSalarioList;
    }

    public void setAdelantoSalarioList(List<AdelantoSalario> adelantoSalarioList) {
        this.adelantoSalarioList = adelantoSalarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoPeriodo != null ? idCatalogoPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoPeriodo)) {
            return false;
        }
        CatalogoPeriodo other = (CatalogoPeriodo) object;
        if ((this.idCatalogoPeriodo == null && other.idCatalogoPeriodo != null) || (this.idCatalogoPeriodo != null && !this.idCatalogoPeriodo.equals(other.idCatalogoPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoPeriodo[ idCatalogoPeriodo=" + idCatalogoPeriodo + " ]";
    }
    
}
