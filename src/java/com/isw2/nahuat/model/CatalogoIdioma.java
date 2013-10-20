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
@Table(name = "CATALOGO_IDIOMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoIdioma.findAll", query = "SELECT c FROM CatalogoIdioma c"),
    @NamedQuery(name = "CatalogoIdioma.findByIdCatalogoIdioma", query = "SELECT c FROM CatalogoIdioma c WHERE c.idCatalogoIdioma = :idCatalogoIdioma"),
    @NamedQuery(name = "CatalogoIdioma.findByNombre", query = "SELECT c FROM CatalogoIdioma c WHERE c.nombre = :nombre")})
public class CatalogoIdioma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_CATALOGO_IDIOMA")
    private String idCatalogoIdioma;
    @Size(max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoIdioma")
    private List<EmpleadoIdioma> empleadoIdiomaList;

    public CatalogoIdioma() {
    }

    public CatalogoIdioma(String idCatalogoIdioma) {
        this.idCatalogoIdioma = idCatalogoIdioma;
    }

    public String getIdCatalogoIdioma() {
        return idCatalogoIdioma;
    }

    public void setIdCatalogoIdioma(String idCatalogoIdioma) {
        this.idCatalogoIdioma = idCatalogoIdioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<EmpleadoIdioma> getEmpleadoIdiomaList() {
        return empleadoIdiomaList;
    }

    public void setEmpleadoIdiomaList(List<EmpleadoIdioma> empleadoIdiomaList) {
        this.empleadoIdiomaList = empleadoIdiomaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoIdioma != null ? idCatalogoIdioma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoIdioma)) {
            return false;
        }
        CatalogoIdioma other = (CatalogoIdioma) object;
        if ((this.idCatalogoIdioma == null && other.idCatalogoIdioma != null) || (this.idCatalogoIdioma != null && !this.idCatalogoIdioma.equals(other.idCatalogoIdioma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoIdioma[ idCatalogoIdioma=" + idCatalogoIdioma + " ]";
    }
    
}
