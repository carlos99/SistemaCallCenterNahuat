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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CATALOGO_MUNICIPIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoMunicipio.findAll", query = "SELECT c FROM CatalogoMunicipio c"),
    @NamedQuery(name = "CatalogoMunicipio.findByIdCatalogoMunicipio", query = "SELECT c FROM CatalogoMunicipio c WHERE c.idCatalogoMunicipio = :idCatalogoMunicipio"),
    @NamedQuery(name = "CatalogoMunicipio.findByNombre", query = "SELECT c FROM CatalogoMunicipio c WHERE c.nombre = :nombre")})
public class CatalogoMunicipio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_MUNICIPIO")
    private String idCatalogoMunicipio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoMunicipio")
    private List<Empleado> empleadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoMunicipio")
    private List<Empresa> empresaList;
    @JoinColumn(name = "ID_CATALOGO_DEPARTAMENTO", referencedColumnName = "ID_CATALOGO_DEPARTAMENTO")
    @ManyToOne(optional = false)
    private CatalogoDepartamento idCatalogoDepartamento;

    public CatalogoMunicipio() {
    }

    public CatalogoMunicipio(String idCatalogoMunicipio) {
        this.idCatalogoMunicipio = idCatalogoMunicipio;
    }

    public CatalogoMunicipio(String idCatalogoMunicipio, String nombre) {
        this.idCatalogoMunicipio = idCatalogoMunicipio;
        this.nombre = nombre;
    }

    public String getIdCatalogoMunicipio() {
        return idCatalogoMunicipio;
    }

    public void setIdCatalogoMunicipio(String idCatalogoMunicipio) {
        this.idCatalogoMunicipio = idCatalogoMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public CatalogoDepartamento getIdCatalogoDepartamento() {
        return idCatalogoDepartamento;
    }

    public void setIdCatalogoDepartamento(CatalogoDepartamento idCatalogoDepartamento) {
        this.idCatalogoDepartamento = idCatalogoDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoMunicipio != null ? idCatalogoMunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoMunicipio)) {
            return false;
        }
        CatalogoMunicipio other = (CatalogoMunicipio) object;
        if ((this.idCatalogoMunicipio == null && other.idCatalogoMunicipio != null) || (this.idCatalogoMunicipio != null && !this.idCatalogoMunicipio.equals(other.idCatalogoMunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoMunicipio[ idCatalogoMunicipio=" + idCatalogoMunicipio + " ]";
    }
    
}
