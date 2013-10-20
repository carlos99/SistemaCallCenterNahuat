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
@Table(name = "CATALOGO_DEPARTAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoDepartamento.findAll", query = "SELECT c FROM CatalogoDepartamento c"),
    @NamedQuery(name = "CatalogoDepartamento.findByIdCatalogoDepartamento", query = "SELECT c FROM CatalogoDepartamento c WHERE c.idCatalogoDepartamento = :idCatalogoDepartamento"),
    @NamedQuery(name = "CatalogoDepartamento.findByNombre", query = "SELECT c FROM CatalogoDepartamento c WHERE c.nombre = :nombre")})
public class CatalogoDepartamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_DEPARTAMENTO")
    private String idCatalogoDepartamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoDepartamento")
    private List<CatalogoMunicipio> catalogoMunicipioList;

    public CatalogoDepartamento() {
    }

    public CatalogoDepartamento(String idCatalogoDepartamento) {
        this.idCatalogoDepartamento = idCatalogoDepartamento;
    }

    public CatalogoDepartamento(String idCatalogoDepartamento, String nombre) {
        this.idCatalogoDepartamento = idCatalogoDepartamento;
        this.nombre = nombre;
    }

    public String getIdCatalogoDepartamento() {
        return idCatalogoDepartamento;
    }

    public void setIdCatalogoDepartamento(String idCatalogoDepartamento) {
        this.idCatalogoDepartamento = idCatalogoDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<CatalogoMunicipio> getCatalogoMunicipioList() {
        return catalogoMunicipioList;
    }

    public void setCatalogoMunicipioList(List<CatalogoMunicipio> catalogoMunicipioList) {
        this.catalogoMunicipioList = catalogoMunicipioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoDepartamento != null ? idCatalogoDepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoDepartamento)) {
            return false;
        }
        CatalogoDepartamento other = (CatalogoDepartamento) object;
        if ((this.idCatalogoDepartamento == null && other.idCatalogoDepartamento != null) || (this.idCatalogoDepartamento != null && !this.idCatalogoDepartamento.equals(other.idCatalogoDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoDepartamento[ idCatalogoDepartamento=" + idCatalogoDepartamento + " ]";
    }
    
}
