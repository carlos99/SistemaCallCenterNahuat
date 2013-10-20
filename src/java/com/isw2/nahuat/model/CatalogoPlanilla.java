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
@Table(name = "CATALOGO_PLANILLA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoPlanilla.findAll", query = "SELECT c FROM CatalogoPlanilla c"),
    @NamedQuery(name = "CatalogoPlanilla.findByIdCatalogoPlanilla", query = "SELECT c FROM CatalogoPlanilla c WHERE c.idCatalogoPlanilla = :idCatalogoPlanilla"),
    @NamedQuery(name = "CatalogoPlanilla.findByNombre", query = "SELECT c FROM CatalogoPlanilla c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoPlanilla.findByDescripcion", query = "SELECT c FROM CatalogoPlanilla c WHERE c.descripcion = :descripcion")})
public class CatalogoPlanilla implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_PLANILLA")
    private String idCatalogoPlanilla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoPlanilla")
    private List<EmpresaConfiguracion> empresaConfiguracionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoPlanilla")
    private List<Planilla> planillaList;

    public CatalogoPlanilla() {
    }

    public CatalogoPlanilla(String idCatalogoPlanilla) {
        this.idCatalogoPlanilla = idCatalogoPlanilla;
    }

    public CatalogoPlanilla(String idCatalogoPlanilla, String nombre) {
        this.idCatalogoPlanilla = idCatalogoPlanilla;
        this.nombre = nombre;
    }

    public String getIdCatalogoPlanilla() {
        return idCatalogoPlanilla;
    }

    public void setIdCatalogoPlanilla(String idCatalogoPlanilla) {
        this.idCatalogoPlanilla = idCatalogoPlanilla;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoPlanilla != null ? idCatalogoPlanilla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoPlanilla)) {
            return false;
        }
        CatalogoPlanilla other = (CatalogoPlanilla) object;
        if ((this.idCatalogoPlanilla == null && other.idCatalogoPlanilla != null) || (this.idCatalogoPlanilla != null && !this.idCatalogoPlanilla.equals(other.idCatalogoPlanilla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoPlanilla[ idCatalogoPlanilla=" + idCatalogoPlanilla + " ]";
    }
    
}
