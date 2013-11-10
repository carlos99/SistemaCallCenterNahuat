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
@Table(name = "CATALOGO_RUBRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoRubro.findAll", query = "SELECT c FROM CatalogoRubro c"),
    @NamedQuery(name = "CatalogoRubro.findByIdCatalogoRubro", query = "SELECT c FROM CatalogoRubro c WHERE c.idCatalogoRubro = :idCatalogoRubro"),
    @NamedQuery(name = "CatalogoRubro.findByNombre", query = "SELECT c FROM CatalogoRubro c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoRubro.findByDescripcion", query = "SELECT c FROM CatalogoRubro c WHERE c.descripcion = :descripcion")})
public class CatalogoRubro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_CATALOGO_RUBRO")
    private String idCatalogoRubro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoRubro")
    private List<Empresa> empresaList;

    public CatalogoRubro() {
    }

    public CatalogoRubro(String idCatalogoRubro) {
        this.idCatalogoRubro = idCatalogoRubro;
    }

    public CatalogoRubro(String idCatalogoRubro, String nombre) {
        this.idCatalogoRubro = idCatalogoRubro;
        this.nombre = nombre;
    }

    public String getIdCatalogoRubro() {
        return idCatalogoRubro;
    }

    public void setIdCatalogoRubro(String idCatalogoRubro) {
        this.idCatalogoRubro = idCatalogoRubro;
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
    public List<Empresa> getEmpresaList() {
        return empresaList;
    }

    public void setEmpresaList(List<Empresa> empresaList) {
        this.empresaList = empresaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoRubro != null ? idCatalogoRubro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoRubro)) {
            return false;
        }
        CatalogoRubro other = (CatalogoRubro) object;
        if ((this.idCatalogoRubro == null && other.idCatalogoRubro != null) || (this.idCatalogoRubro != null && !this.idCatalogoRubro.equals(other.idCatalogoRubro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoRubro[ idCatalogoRubro=" + idCatalogoRubro + " ]";
    }
    
}
