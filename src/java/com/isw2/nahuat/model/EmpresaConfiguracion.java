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
 * @author karlos
 */
@Entity
@Table(name = "EMPRESA_CONFIGURACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpresaConfiguracion.findAll", query = "SELECT e FROM EmpresaConfiguracion e"),
    @NamedQuery(name = "EmpresaConfiguracion.findByIdEmpresaConfiguracion", query = "SELECT e FROM EmpresaConfiguracion e WHERE e.idEmpresaConfiguracion = :idEmpresaConfiguracion")})
public class EmpresaConfiguracion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_EMPRESA_CONFIGURACION")
    private String idEmpresaConfiguracion;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne(optional = false)
    private Empresa idEmpresa;
    @JoinColumn(name = "ID_CATALOGO_UBICACION", referencedColumnName = "ID_CATEGORIA_UBICACION")
    @ManyToOne(optional = false)
    private CatalogoUbicacion idCatalogoUbicacion;
    @JoinColumn(name = "ID_CATALOGO_PLANILLA", referencedColumnName = "ID_CATALOGO_PLANILLA")
    @ManyToOne(optional = false)
    private CatalogoPlanilla idCatalogoPlanilla;
    @JoinColumn(name = "ID_CATALOGO_PERIODO", referencedColumnName = "ID_CATALOGO_PERIODO")
    @ManyToOne(optional = false)
    private CatalogoPeriodo idCatalogoPeriodo;

    public EmpresaConfiguracion() {
    }

    public EmpresaConfiguracion(String idEmpresaConfiguracion) {
        this.idEmpresaConfiguracion = idEmpresaConfiguracion;
    }

    public String getIdEmpresaConfiguracion() {
        return idEmpresaConfiguracion;
    }

    public void setIdEmpresaConfiguracion(String idEmpresaConfiguracion) {
        this.idEmpresaConfiguracion = idEmpresaConfiguracion;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public CatalogoUbicacion getIdCatalogoUbicacion() {
        return idCatalogoUbicacion;
    }

    public void setIdCatalogoUbicacion(CatalogoUbicacion idCatalogoUbicacion) {
        this.idCatalogoUbicacion = idCatalogoUbicacion;
    }

    public CatalogoPlanilla getIdCatalogoPlanilla() {
        return idCatalogoPlanilla;
    }

    public void setIdCatalogoPlanilla(CatalogoPlanilla idCatalogoPlanilla) {
        this.idCatalogoPlanilla = idCatalogoPlanilla;
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
        hash += (idEmpresaConfiguracion != null ? idEmpresaConfiguracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaConfiguracion)) {
            return false;
        }
        EmpresaConfiguracion other = (EmpresaConfiguracion) object;
        if ((this.idEmpresaConfiguracion == null && other.idEmpresaConfiguracion != null) || (this.idEmpresaConfiguracion != null && !this.idEmpresaConfiguracion.equals(other.idEmpresaConfiguracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.EmpresaConfiguracion[ idEmpresaConfiguracion=" + idEmpresaConfiguracion + " ]";
    }
    
}
