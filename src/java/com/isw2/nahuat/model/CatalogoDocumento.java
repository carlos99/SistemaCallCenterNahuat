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
@Table(name = "CATALOGO_DOCUMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoDocumento.findAll", query = "SELECT c FROM CatalogoDocumento c"),
    @NamedQuery(name = "CatalogoDocumento.findByIdCatalogoDocumento", query = "SELECT c FROM CatalogoDocumento c WHERE c.idCatalogoDocumento = :idCatalogoDocumento"),
    @NamedQuery(name = "CatalogoDocumento.findByNombre", query = "SELECT c FROM CatalogoDocumento c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoDocumento.findByDescripcion", query = "SELECT c FROM CatalogoDocumento c WHERE c.descripcion = :descripcion")})
public class CatalogoDocumento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_DOCUMENTO")
    private String idCatalogoDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoDocumento")
    private List<EmpleadoDocumento> empleadoDocumentoList;

    public CatalogoDocumento() {
    }

    public CatalogoDocumento(String idCatalogoDocumento) {
        this.idCatalogoDocumento = idCatalogoDocumento;
    }

    public CatalogoDocumento(String idCatalogoDocumento, String nombre) {
        this.idCatalogoDocumento = idCatalogoDocumento;
        this.nombre = nombre;
    }

    public String getIdCatalogoDocumento() {
        return idCatalogoDocumento;
    }

    public void setIdCatalogoDocumento(String idCatalogoDocumento) {
        this.idCatalogoDocumento = idCatalogoDocumento;
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
    public List<EmpleadoDocumento> getEmpleadoDocumentoList() {
        return empleadoDocumentoList;
    }

    public void setEmpleadoDocumentoList(List<EmpleadoDocumento> empleadoDocumentoList) {
        this.empleadoDocumentoList = empleadoDocumentoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoDocumento != null ? idCatalogoDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoDocumento)) {
            return false;
        }
        CatalogoDocumento other = (CatalogoDocumento) object;
        if ((this.idCatalogoDocumento == null && other.idCatalogoDocumento != null) || (this.idCatalogoDocumento != null && !this.idCatalogoDocumento.equals(other.idCatalogoDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoDocumento[ idCatalogoDocumento=" + idCatalogoDocumento + " ]";
    }
    
}
