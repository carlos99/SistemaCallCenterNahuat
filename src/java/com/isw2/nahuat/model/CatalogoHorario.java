/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author carlos
 */
@Entity
@Table(name = "CATALOGO_HORARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatalogoHorario.findAll", query = "SELECT c FROM CatalogoHorario c"),
    @NamedQuery(name = "CatalogoHorario.findByIdCatalogoHorario", query = "SELECT c FROM CatalogoHorario c WHERE c.idCatalogoHorario = :idCatalogoHorario"),
    @NamedQuery(name = "CatalogoHorario.findByNombre", query = "SELECT c FROM CatalogoHorario c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "CatalogoHorario.findByHoraInicio", query = "SELECT c FROM CatalogoHorario c WHERE c.horaInicio = :horaInicio"),
    @NamedQuery(name = "CatalogoHorario.findByHoraFin", query = "SELECT c FROM CatalogoHorario c WHERE c.horaFin = :horaFin"),
    @NamedQuery(name = "CatalogoHorario.findByDiaInicio", query = "SELECT c FROM CatalogoHorario c WHERE c.diaInicio = :diaInicio"),
    @NamedQuery(name = "CatalogoHorario.findByDiaFinal", query = "SELECT c FROM CatalogoHorario c WHERE c.diaFinal = :diaFinal"),
    @NamedQuery(name = "CatalogoHorario.findByTotalHoras", query = "SELECT c FROM CatalogoHorario c WHERE c.totalHoras = :totalHoras")})
public class CatalogoHorario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_CATALOGO_HORARIO")
    private String idCatalogoHorario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HORA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HORA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "DIA_INICIO")
    private String diaInicio;
    @Size(max = 15)
    @Column(name = "DIA_FINAL")
    private String diaFinal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL_HORAS")
    private BigInteger totalHoras;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCatalogoHorario")
    private List<Contratacion> contratacionList;

    public CatalogoHorario() {
    }

    public CatalogoHorario(String idCatalogoHorario) {
        this.idCatalogoHorario = idCatalogoHorario;
    }

    public CatalogoHorario(String idCatalogoHorario, String nombre, Date horaInicio, Date horaFin, String diaInicio, BigInteger totalHoras) {
        this.idCatalogoHorario = idCatalogoHorario;
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.diaInicio = diaInicio;
        this.totalHoras = totalHoras;
    }

    public String getIdCatalogoHorario() {
        return idCatalogoHorario;
    }

    public void setIdCatalogoHorario(String idCatalogoHorario) {
        this.idCatalogoHorario = idCatalogoHorario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getDiaInicio() {
        return diaInicio;
    }

    public void setDiaInicio(String diaInicio) {
        this.diaInicio = diaInicio;
    }

    public String getDiaFinal() {
        return diaFinal;
    }

    public void setDiaFinal(String diaFinal) {
        this.diaFinal = diaFinal;
    }

    public BigInteger getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(BigInteger totalHoras) {
        this.totalHoras = totalHoras;
    }

    @XmlTransient
    public List<Contratacion> getContratacionList() {
        return contratacionList;
    }

    public void setContratacionList(List<Contratacion> contratacionList) {
        this.contratacionList = contratacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogoHorario != null ? idCatalogoHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalogoHorario)) {
            return false;
        }
        CatalogoHorario other = (CatalogoHorario) object;
        if ((this.idCatalogoHorario == null && other.idCatalogoHorario != null) || (this.idCatalogoHorario != null && !this.idCatalogoHorario.equals(other.idCatalogoHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.CatalogoHorario[ idCatalogoHorario=" + idCatalogoHorario + " ]";
    }
    
}
