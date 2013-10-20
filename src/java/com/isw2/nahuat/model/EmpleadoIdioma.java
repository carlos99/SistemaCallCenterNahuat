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
@Table(name = "EMPLEADO_IDIOMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpleadoIdioma.findAll", query = "SELECT e FROM EmpleadoIdioma e"),
    @NamedQuery(name = "EmpleadoIdioma.findByIdEmpleadoIdioma", query = "SELECT e FROM EmpleadoIdioma e WHERE e.idEmpleadoIdioma = :idEmpleadoIdioma"),
    @NamedQuery(name = "EmpleadoIdioma.findByLeer", query = "SELECT e FROM EmpleadoIdioma e WHERE e.leer = :leer"),
    @NamedQuery(name = "EmpleadoIdioma.findByEscribir", query = "SELECT e FROM EmpleadoIdioma e WHERE e.escribir = :escribir"),
    @NamedQuery(name = "EmpleadoIdioma.findByHablar", query = "SELECT e FROM EmpleadoIdioma e WHERE e.hablar = :hablar")})
public class EmpleadoIdioma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_EMPLEADO_IDIOMA")
    private String idEmpleadoIdioma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LEER")
    private short leer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESCRIBIR")
    private short escribir;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HABLAR")
    private short hablar;
    @JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO")
    @ManyToOne(optional = false)
    private Empleado idEmpleado;
    @JoinColumn(name = "ID_CATALOGO_IDIOMA", referencedColumnName = "ID_CATALOGO_IDIOMA")
    @ManyToOne(optional = false)
    private CatalogoIdioma idCatalogoIdioma;

    public EmpleadoIdioma() {
    }

    public EmpleadoIdioma(String idEmpleadoIdioma) {
        this.idEmpleadoIdioma = idEmpleadoIdioma;
    }

    public EmpleadoIdioma(String idEmpleadoIdioma, short leer, short escribir, short hablar) {
        this.idEmpleadoIdioma = idEmpleadoIdioma;
        this.leer = leer;
        this.escribir = escribir;
        this.hablar = hablar;
    }

    public String getIdEmpleadoIdioma() {
        return idEmpleadoIdioma;
    }

    public void setIdEmpleadoIdioma(String idEmpleadoIdioma) {
        this.idEmpleadoIdioma = idEmpleadoIdioma;
    }

    public short getLeer() {
        return leer;
    }

    public void setLeer(short leer) {
        this.leer = leer;
    }

    public short getEscribir() {
        return escribir;
    }

    public void setEscribir(short escribir) {
        this.escribir = escribir;
    }

    public short getHablar() {
        return hablar;
    }

    public void setHablar(short hablar) {
        this.hablar = hablar;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public CatalogoIdioma getIdCatalogoIdioma() {
        return idCatalogoIdioma;
    }

    public void setIdCatalogoIdioma(CatalogoIdioma idCatalogoIdioma) {
        this.idCatalogoIdioma = idCatalogoIdioma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleadoIdioma != null ? idEmpleadoIdioma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpleadoIdioma)) {
            return false;
        }
        EmpleadoIdioma other = (EmpleadoIdioma) object;
        if ((this.idEmpleadoIdioma == null && other.idEmpleadoIdioma != null) || (this.idEmpleadoIdioma != null && !this.idEmpleadoIdioma.equals(other.idEmpleadoIdioma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.EmpleadoIdioma[ idEmpleadoIdioma=" + idEmpleadoIdioma + " ]";
    }
    
}
