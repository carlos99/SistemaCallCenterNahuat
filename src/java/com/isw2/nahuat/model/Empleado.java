/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author karlos
 */
@Entity
@Table(name = "EMPLEADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByIdEmpleado", query = "SELECT e FROM Empleado e WHERE e.idEmpleado = :idEmpleado"),
    @NamedQuery(name = "Empleado.findByPrimerNombre", query = "SELECT e FROM Empleado e WHERE e.primerNombre = :primerNombre"),
    @NamedQuery(name = "Empleado.findBySegundoNombre", query = "SELECT e FROM Empleado e WHERE e.segundoNombre = :segundoNombre"),
    @NamedQuery(name = "Empleado.findByPrimerApellido", query = "SELECT e FROM Empleado e WHERE e.primerApellido = :primerApellido"),
    @NamedQuery(name = "Empleado.findBySegundoApellido", query = "SELECT e FROM Empleado e WHERE e.segundoApellido = :segundoApellido"),
    @NamedQuery(name = "Empleado.findByApellidoCasada", query = "SELECT e FROM Empleado e WHERE e.apellidoCasada = :apellidoCasada"),
    @NamedQuery(name = "Empleado.findByFechaNacimiento", query = "SELECT e FROM Empleado e WHERE e.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Empleado.findByGenero", query = "SELECT e FROM Empleado e WHERE e.genero = :genero"),
    @NamedQuery(name = "Empleado.findByDireccion", query = "SELECT e FROM Empleado e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Empleado.findByTelefonoDomicilio", query = "SELECT e FROM Empleado e WHERE e.telefonoDomicilio = :telefonoDomicilio"),
    @NamedQuery(name = "Empleado.findByTelefonoMovil", query = "SELECT e FROM Empleado e WHERE e.telefonoMovil = :telefonoMovil"),
    @NamedQuery(name = "Empleado.findByCorreoElectronico", query = "SELECT e FROM Empleado e WHERE e.correoElectronico = :correoElectronico")})
public class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ID_EMPLEADO")
    private String idEmpleado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Size(max = 25)
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    @Size(max = 30)
    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;
    @Size(max = 30)
    @Column(name = "APELLIDO_CASADA")
    private String apellidoCasada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GENERO")
    private char genero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 8)
    @Column(name = "TELEFONO_DOMICILIO")
    private String telefonoDomicilio;
    @Size(max = 8)
    @Column(name = "TELEFONO_MOVIL")
    private String telefonoMovil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "FOTO")
    private Serializable foto;
    @JoinColumn(name = "ID_CATALOGO_MUNICIPIO", referencedColumnName = "ID_CATALOGO_MUNICIPIO")
    @ManyToOne(optional = false)
    private CatalogoMunicipio idCatalogoMunicipio;
    @JoinColumn(name = "ID_CATALOGO_ESTADO_CIVIL", referencedColumnName = "ID_CATALOGO_ESTADO_CIVIL")
    @ManyToOne(optional = false)
    private CatalogoEstadoCivil idCatalogoEstadoCivil;
    @JoinColumn(name = "ID_CATALOGO_ESTADO", referencedColumnName = "ID_CATALOGO_ESTADO")
    @ManyToOne(optional = false)
    private CatalogoEstado idCatalogoEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<EmpresaContacto> empresaContactoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<EmpleadoReferencia> empleadoReferenciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<MarcacionDextra> marcacionDextraList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<DetallePlanilla> detallePlanillaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<Contratacion> contratacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<Marcacion> marcacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<EmpleadoIdioma> empleadoIdiomaList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<AdelantoSalario> adelantoSalarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<EmpleadoDocumento> empleadoDocumentoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private List<EmpleadoExperiencia> empleadoExperienciaList;

    public Empleado() {
    }

    public Empleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empleado(String idEmpleado, String primerNombre, String primerApellido, Date fechaNacimiento, char genero, String direccion, String correoElectronico, Serializable foto) {
        this.idEmpleado = idEmpleado;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.foto = foto;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getApellidoCasada() {
        return apellidoCasada;
    }

    public void setApellidoCasada(String apellidoCasada) {
        this.apellidoCasada = apellidoCasada;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoDomicilio() {
        return telefonoDomicilio;
    }

    public void setTelefonoDomicilio(String telefonoDomicilio) {
        this.telefonoDomicilio = telefonoDomicilio;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Serializable getFoto() {
        return foto;
    }

    public void setFoto(Serializable foto) {
        this.foto = foto;
    }

    public CatalogoMunicipio getIdCatalogoMunicipio() {
        return idCatalogoMunicipio;
    }

    public void setIdCatalogoMunicipio(CatalogoMunicipio idCatalogoMunicipio) {
        this.idCatalogoMunicipio = idCatalogoMunicipio;
    }

    public CatalogoEstadoCivil getIdCatalogoEstadoCivil() {
        return idCatalogoEstadoCivil;
    }

    public void setIdCatalogoEstadoCivil(CatalogoEstadoCivil idCatalogoEstadoCivil) {
        this.idCatalogoEstadoCivil = idCatalogoEstadoCivil;
    }

    public CatalogoEstado getIdCatalogoEstado() {
        return idCatalogoEstado;
    }

    public void setIdCatalogoEstado(CatalogoEstado idCatalogoEstado) {
        this.idCatalogoEstado = idCatalogoEstado;
    }

    @XmlTransient
    public List<EmpresaContacto> getEmpresaContactoList() {
        return empresaContactoList;
    }

    public void setEmpresaContactoList(List<EmpresaContacto> empresaContactoList) {
        this.empresaContactoList = empresaContactoList;
    }

    @XmlTransient
    public List<EmpleadoReferencia> getEmpleadoReferenciaList() {
        return empleadoReferenciaList;
    }

    public void setEmpleadoReferenciaList(List<EmpleadoReferencia> empleadoReferenciaList) {
        this.empleadoReferenciaList = empleadoReferenciaList;
    }

    @XmlTransient
    public List<MarcacionDextra> getMarcacionDextraList() {
        return marcacionDextraList;
    }

    public void setMarcacionDextraList(List<MarcacionDextra> marcacionDextraList) {
        this.marcacionDextraList = marcacionDextraList;
    }

    @XmlTransient
    public List<DetallePlanilla> getDetallePlanillaList() {
        return detallePlanillaList;
    }

    public void setDetallePlanillaList(List<DetallePlanilla> detallePlanillaList) {
        this.detallePlanillaList = detallePlanillaList;
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
    public List<EmpleadoIdioma> getEmpleadoIdiomaList() {
        return empleadoIdiomaList;
    }

    public void setEmpleadoIdiomaList(List<EmpleadoIdioma> empleadoIdiomaList) {
        this.empleadoIdiomaList = empleadoIdiomaList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @XmlTransient
    public List<AdelantoSalario> getAdelantoSalarioList() {
        return adelantoSalarioList;
    }

    public void setAdelantoSalarioList(List<AdelantoSalario> adelantoSalarioList) {
        this.adelantoSalarioList = adelantoSalarioList;
    }

    @XmlTransient
    public List<EmpleadoDocumento> getEmpleadoDocumentoList() {
        return empleadoDocumentoList;
    }

    public void setEmpleadoDocumentoList(List<EmpleadoDocumento> empleadoDocumentoList) {
        this.empleadoDocumentoList = empleadoDocumentoList;
    }

    @XmlTransient
    public List<EmpleadoExperiencia> getEmpleadoExperienciaList() {
        return empleadoExperienciaList;
    }

    public void setEmpleadoExperienciaList(List<EmpleadoExperiencia> empleadoExperienciaList) {
        this.empleadoExperienciaList = empleadoExperienciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.isw2.nahuat.model.Empleado[ idEmpleado=" + idEmpleado + " ]";
    }
    
}
