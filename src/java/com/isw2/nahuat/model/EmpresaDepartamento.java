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
 * @author carlos
 */
@Entity
@Table(name = "EMPRESA_DEPARTAMENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpresaDepartamento.findAll", query = "SELECT e FROM EmpresaDepartamento e"),
    @NamedQuery(name = "EmpresaDepartamento.findByIdEmpresaDepartamento", query = "SELECT e FROM EmpresaDepartamento e WHERE e.idEmpresaDepartamento = :idEmpresaDepartamento"),
    @NamedQuery(name = "EmpresaDepartamento.findByIdCatalogoEdepartamento", query = "SELECT e FROM EmpresaDepartamento e WHERE e.idCatalogoEdepartamento = :idCatalogoEdepartamento")})
public class EmpresaDepartamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_EMPRESA_DEPARTAMENTO")
    private String idEmpresaDepartamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_CATALOGO_EDEPARTAMENTO")
    private String idCatalogoEdepartamento;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne(optional = false)
    private Empresa idEmpresa;

    public EmpresaDepartamento() {
    }

    public EmpresaDepartamento(String idEmpresaDepartamento) {
        this.idEmpresaDepartamento = idEmpresaDepartamento;
    }

    public EmpresaDepartamento(String idEmpresaDepartamento, String idCatalogoEdepartamento) {
        this.idEmpresaDepartamento = idEmpresaDepartamento;
        this.idCatalogoEdepartamento = idCatalogoEdepartamento;
    }

    public String getIdEmpresaDepartamento() {
        return idEmpresaDepartamento;
    }

    public void setIdEmpresaDepartamento(String idEmpresaDepartamento) {
        this.idEmpresaDepartamento = idEmpresaDepartamento;
    }

    public String getIdCatalogoEdepartamento() {
        return idCatalogoEdepartamento;
    }

    public void setIdCatalogoEdepartamento(String idCatalogoEdepartamento) {
        this.idCatalogoEdepartamento = idCatalogoEdepartamento;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresaDepartamento != null ? idEmpresaDepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresaDepartamento)) {
            return false;
        }
        EmpresaDepartamento other = (EmpresaDepartamento) object;
        if ((this.idEmpresaDepartamento == null && other.idEmpresaDepartamento != null) || (this.idEmpresaDepartamento != null && !this.idEmpresaDepartamento.equals(other.idEmpresaDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.EmpresaDepartamento[ idEmpresaDepartamento=" + idEmpresaDepartamento + " ]";
    }
    
}
