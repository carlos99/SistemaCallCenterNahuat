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
 * @author carlos
 */
@Entity
@Table(name = "EMPRESA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
    @NamedQuery(name = "Empresa.findByIdEmpresa", query = "SELECT e FROM Empresa e WHERE e.idEmpresa = :idEmpresa"),
    @NamedQuery(name = "Empresa.findByNombre", query = "SELECT e FROM Empresa e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empresa.findByCorreo", query = "SELECT e FROM Empresa e WHERE e.correo = :correo"),
    @NamedQuery(name = "Empresa.findBySitioWeb", query = "SELECT e FROM Empresa e WHERE e.sitioWeb = :sitioWeb"),
    @NamedQuery(name = "Empresa.findByDireccion", query = "SELECT e FROM Empresa e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Empresa.findByTelefono", query = "SELECT e FROM Empresa e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Empresa.findByDescripcion", query = "SELECT e FROM Empresa e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Empresa.findByIdCatalogoMunicipio", query = "SELECT e FROM Empresa e WHERE e.idCatalogoMunicipio = :idCatalogoMunicipio")})
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_EMPRESA")
    private String idEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CORREO")
    private String correo;
    @Size(max = 50)
    @Column(name = "SITIO_WEB")
    private String sitioWeb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "TELEFONO")
    private String telefono;
    @Size(max = 50)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "ID_CATALOGO_MUNICIPIO")
    private String idCatalogoMunicipio;
    @JoinColumn(name = "ID_CATALOGO_RUBRO", referencedColumnName = "ID_CATALOGO_RUBRO")
    @ManyToOne(optional = false)
    private CatalogoRubro idCatalogoRubro;
    @JoinColumn(name = "ID_CATALOGO_ESTADO", referencedColumnName = "ID_CATALOGO_ESTADO")
    @ManyToOne(optional = false)
    private CatalogoEstado idCatalogoEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<EmpresaDepartamento> empresaDepartamentoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<EmpresaConfiguracion> empresaConfiguracionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<Planilla> planillaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<EmpresaContacto> empresaContactoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<MarcacionDextra> marcacionDextraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<Contratacion> contratacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<Marcacion> marcacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<AdelantoSalario> adelantoSalarioList;

    public Empresa() {
    }

    public Empresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Empresa(String idEmpresa, String nombre, String correo, String direccion, String telefono, String idCatalogoMunicipio) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.idCatalogoMunicipio = idCatalogoMunicipio;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdCatalogoMunicipio() {
        return idCatalogoMunicipio;
    }

    public void setIdCatalogoMunicipio(String idCatalogoMunicipio) {
        this.idCatalogoMunicipio = idCatalogoMunicipio;
    }

    public CatalogoRubro getIdCatalogoRubro() {
        return idCatalogoRubro;
    }

    public void setIdCatalogoRubro(CatalogoRubro idCatalogoRubro) {
        this.idCatalogoRubro = idCatalogoRubro;
    }

    public CatalogoEstado getIdCatalogoEstado() {
        return idCatalogoEstado;
    }

    public void setIdCatalogoEstado(CatalogoEstado idCatalogoEstado) {
        this.idCatalogoEstado = idCatalogoEstado;
    }

    @XmlTransient
    public List<EmpresaDepartamento> getEmpresaDepartamentoList() {
        return empresaDepartamentoList;
    }

    public void setEmpresaDepartamentoList(List<EmpresaDepartamento> empresaDepartamentoList) {
        this.empresaDepartamentoList = empresaDepartamentoList;
    }

    @XmlTransient
    public List<EmpresaConfiguracion> getEmpresaConfiguracionList() {
        return empresaConfiguracionList;
    }

    public void setEmpresaConfiguracionList(List<EmpresaConfiguracion> empresaConfiguracionList) {
        this.empresaConfiguracionList = empresaConfiguracionList;
    }

    @XmlTransient
    public List<Planilla> getPlanillaList() {
        return planillaList;
    }

    public void setPlanillaList(List<Planilla> planillaList) {
        this.planillaList = planillaList;
    }

    @XmlTransient
    public List<EmpresaContacto> getEmpresaContactoList() {
        return empresaContactoList;
    }

    public void setEmpresaContactoList(List<EmpresaContacto> empresaContactoList) {
        this.empresaContactoList = empresaContactoList;
    }

    @XmlTransient
    public List<MarcacionDextra> getMarcacionDextraList() {
        return marcacionDextraList;
    }

    public void setMarcacionDextraList(List<MarcacionDextra> marcacionDextraList) {
        this.marcacionDextraList = marcacionDextraList;
    }

    @XmlTransient
    public List<Contratacion> getContratacionList() {
        return contratacionList;
    }

    public void setContratacionList(List<Contratacion> contratacionList) {
        this.contratacionList = contratacionList;
    }

    @XmlTransient
    public List<Marcacion> getMarcacionList() {
        return marcacionList;
    }

    public void setMarcacionList(List<Marcacion> marcacionList) {
        this.marcacionList = marcacionList;
    }

    @XmlTransient
    public List<AdelantoSalario> getAdelantoSalarioList() {
        return adelantoSalarioList;
    }

    public void setAdelantoSalarioList(List<AdelantoSalario> adelantoSalarioList) {
        this.adelantoSalarioList = adelantoSalarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.Empresa[ idEmpresa=" + idEmpresa + " ]";
    }
    
}
