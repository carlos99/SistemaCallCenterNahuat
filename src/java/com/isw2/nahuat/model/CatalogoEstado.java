/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
 * @author karlos
 */
@Entity
@Table(name = "CATALOGO_ESTADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoEstado.findAll", query = "SELECT c FROM CatalogoEstado c"),
    @NamedQuery(name = "CatalogoEstado.findByIdCatalogoEstado", query = "SELECT c FROM CatalogoEstado c WHERE c.idCatalogoEstado = :idCatalogoEstado"),
    @NamedQuery(name = "CatalogoEstado.findByNombre", query = "SELECT c FROM CatalogoEstado c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoEstado.findByDescripcion", query = "SELECT c FROM CatalogoEstado c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "CatalogoEstado.findByEntidad", query = "SELECT c FROM CatalogoEstado c WHERE c.entidad = :entidad")})
public class CatalogoEstado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_ESTADO")
    private String idCatalogoEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "ENTIDAD")
    private String entidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoEstado")
    private List<Empleado> empleadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoEstado")
    private List<Empresa> empresaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoEstado")
    private List<Planilla> planillaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoEstado")
    private List<CatalogoIsr> catalogoIsrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoEstado")
    private List<MarcacionDextra> marcacionDextraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoEstado")
    private List<CatalogoPeriodo> catalogoPeriodoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoEstado")
    private List<AdelantoSalario> adelantoSalarioList;

    public CatalogoEstado() {
    }

    public CatalogoEstado(String idCatalogoEstado) {
        this.idCatalogoEstado = idCatalogoEstado;
    }

    public CatalogoEstado(String idCatalogoEstado, String nombre, String entidad) {
        this.idCatalogoEstado = idCatalogoEstado;
        this.nombre = nombre;
        this.entidad = entidad;
    }

    public String getIdCatalogoEstado() {
        return idCatalogoEstado;
    }

    public void setIdCatalogoEstado(String idCatalogoEstado) {
        this.idCatalogoEstado = idCatalogoEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @XmlTransient
    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    @XmlTransient
    public List<Empresa> getEmpresaList() {
        return empresaList;
    }

    public void setEmpresaList(List<Empresa> empresaList) {
        this.empresaList = empresaList;
    }

    @XmlTransient
    public List<Planilla> getPlanillaList() {
        return planillaList;
    }

    public void setPlanillaList(List<Planilla> planillaList) {
        this.planillaList = planillaList;
    }

    @XmlTransient
    public List<CatalogoIsr> getCatalogoIsrList() {
        return catalogoIsrList;
    }

    public void setCatalogoIsrList(List<CatalogoIsr> catalogoIsrList) {
        this.catalogoIsrList = catalogoIsrList;
    }

    @XmlTransient
    public List<MarcacionDextra> getMarcacionDextraList() {
        return marcacionDextraList;
    }

    public void setMarcacionDextraList(List<MarcacionDextra> marcacionDextraList) {
        this.marcacionDextraList = marcacionDextraList;
    }

    @XmlTransient
    public List<CatalogoPeriodo> getCatalogoPeriodoList() {
        return catalogoPeriodoList;
    }

    public void setCatalogoPeriodoList(List<CatalogoPeriodo> catalogoPeriodoList) {
        this.catalogoPeriodoList = catalogoPeriodoList;
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
        hash += (idCatalogoEstado != null ? idCatalogoEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoEstado)) {
            return false;
        }
        CatalogoEstado other = (CatalogoEstado) object;
        if ((this.idCatalogoEstado == null && other.idCatalogoEstado != null) || (this.idCatalogoEstado != null && !this.idCatalogoEstado.equals(other.idCatalogoEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoEstado[ idCatalogoEstado=" + idCatalogoEstado + " ]";
    }
    
}
