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
@Table(name = "CATALOGO_UBICACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoUbicacion.findAll", query = "SELECT c FROM CatalogoUbicacion c"),
    @NamedQuery(name = "CatalogoUbicacion.findByIdCategoriaUbicacion", query = "SELECT c FROM CatalogoUbicacion c WHERE c.idCategoriaUbicacion = :idCategoriaUbicacion"),
    @NamedQuery(name = "CatalogoUbicacion.findByNivelEdificio", query = "SELECT c FROM CatalogoUbicacion c WHERE c.nivelEdificio = :nivelEdificio")})
public class CatalogoUbicacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATEGORIA_UBICACION")
    private String idCategoriaUbicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NIVEL_EDIFICIO")
    private String nivelEdificio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoUbicacion")
    private List<EmpresaConfiguracion> empresaConfiguracionList;

    public CatalogoUbicacion() {
    }

    public CatalogoUbicacion(String idCategoriaUbicacion) {
        this.idCategoriaUbicacion = idCategoriaUbicacion;
    }

    public CatalogoUbicacion(String idCategoriaUbicacion, String nivelEdificio) {
        this.idCategoriaUbicacion = idCategoriaUbicacion;
        this.nivelEdificio = nivelEdificio;
    }

    public String getIdCategoriaUbicacion() {
        return idCategoriaUbicacion;
    }

    public void setIdCategoriaUbicacion(String idCategoriaUbicacion) {
        this.idCategoriaUbicacion = idCategoriaUbicacion;
    }

    public String getNivelEdificio() {
        return nivelEdificio;
    }

    public void setNivelEdificio(String nivelEdificio) {
        this.nivelEdificio = nivelEdificio;
    }

    @XmlTransient
    public List<EmpresaConfiguracion> getEmpresaConfiguracionList() {
        return empresaConfiguracionList;
    }

    public void setEmpresaConfiguracionList(List<EmpresaConfiguracion> empresaConfiguracionList) {
        this.empresaConfiguracionList = empresaConfiguracionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoriaUbicacion != null ? idCategoriaUbicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoUbicacion)) {
            return false;
        }
        CatalogoUbicacion other = (CatalogoUbicacion) object;
        if ((this.idCategoriaUbicacion == null && other.idCategoriaUbicacion != null) || (this.idCategoriaUbicacion != null && !this.idCategoriaUbicacion.equals(other.idCategoriaUbicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoUbicacion[ idCategoriaUbicacion=" + idCategoriaUbicacion + " ]";
    }
    
}
