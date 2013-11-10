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
 * @author carlos
 */
@Entity
@Table(name = "CATALOGO_DEXTRA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoDextra.findAll", query = "SELECT c FROM CatalogoDextra c"),
    @NamedQuery(name = "CatalogoDextra.findByIdCatalogoDextra", query = "SELECT c FROM CatalogoDextra c WHERE c.idCatalogoDextra = :idCatalogoDextra"),
    @NamedQuery(name = "CatalogoDextra.findByNombre", query = "SELECT c FROM CatalogoDextra c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoDextra.findByDescripcion", query = "SELECT c FROM CatalogoDextra c WHERE c.descripcion = :descripcion")})
public class CatalogoDextra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_CATALOGO_DEXTRA")
    private String idCatalogoDextra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoDextra")
    private List<MarcacionDextra> marcacionDextraList;

    public CatalogoDextra() {
    }

    public CatalogoDextra(String idCatalogoDextra) {
        this.idCatalogoDextra = idCatalogoDextra;
    }

    public CatalogoDextra(String idCatalogoDextra, String nombre) {
        this.idCatalogoDextra = idCatalogoDextra;
        this.nombre = nombre;
    }

    public String getIdCatalogoDextra() {
        return idCatalogoDextra;
    }

    public void setIdCatalogoDextra(String idCatalogoDextra) {
        this.idCatalogoDextra = idCatalogoDextra;
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
    public List<MarcacionDextra> getMarcacionDextraList() {
        return marcacionDextraList;
    }

    public void setMarcacionDextraList(List<MarcacionDextra> marcacionDextraList) {
        this.marcacionDextraList = marcacionDextraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoDextra != null ? idCatalogoDextra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoDextra)) {
            return false;
        }
        CatalogoDextra other = (CatalogoDextra) object;
        if ((this.idCatalogoDextra == null && other.idCatalogoDextra != null) || (this.idCatalogoDextra != null && !this.idCatalogoDextra.equals(other.idCatalogoDextra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoDextra[ idCatalogoDextra=" + idCatalogoDextra + " ]";
    }
    
}
