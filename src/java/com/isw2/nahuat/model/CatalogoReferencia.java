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
@Table(name = "CATALOGO_REFERENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoReferencia.findAll", query = "SELECT c FROM CatalogoReferencia c"),
    @NamedQuery(name = "CatalogoReferencia.findByIdCatalogoReferencia", query = "SELECT c FROM CatalogoReferencia c WHERE c.idCatalogoReferencia = :idCatalogoReferencia"),
    @NamedQuery(name = "CatalogoReferencia.findByNombre", query = "SELECT c FROM CatalogoReferencia c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoReferencia.findByDescripcion", query = "SELECT c FROM CatalogoReferencia c WHERE c.descripcion = :descripcion")})
public class CatalogoReferencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_REFERENCIA")
    private String idCatalogoReferencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoRefencia")
    private List<EmpleadoReferencia> empleadoReferenciaList;

    public CatalogoReferencia() {
    }

    public CatalogoReferencia(String idCatalogoReferencia) {
        this.idCatalogoReferencia = idCatalogoReferencia;
    }

    public CatalogoReferencia(String idCatalogoReferencia, String nombre) {
        this.idCatalogoReferencia = idCatalogoReferencia;
        this.nombre = nombre;
    }

    public String getIdCatalogoReferencia() {
        return idCatalogoReferencia;
    }

    public void setIdCatalogoReferencia(String idCatalogoReferencia) {
        this.idCatalogoReferencia = idCatalogoReferencia;
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
    public List<EmpleadoReferencia> getEmpleadoReferenciaList() {
        return empleadoReferenciaList;
    }

    public void setEmpleadoReferenciaList(List<EmpleadoReferencia> empleadoReferenciaList) {
        this.empleadoReferenciaList = empleadoReferenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoReferencia != null ? idCatalogoReferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoReferencia)) {
            return false;
        }
        CatalogoReferencia other = (CatalogoReferencia) object;
        if ((this.idCatalogoReferencia == null && other.idCatalogoReferencia != null) || (this.idCatalogoReferencia != null && !this.idCatalogoReferencia.equals(other.idCatalogoReferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoReferencia[ idCatalogoReferencia=" + idCatalogoReferencia + " ]";
    }
    
}
