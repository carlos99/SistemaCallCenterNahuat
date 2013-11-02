package com.isw2.nahuat.model;

import com.isw2.nahuat.model.AdelantoSalario;
import com.isw2.nahuat.model.CatalogoEstado;
import com.isw2.nahuat.model.CatalogoEstadoCivil;
import com.isw2.nahuat.model.CatalogoMunicipio;
import com.isw2.nahuat.model.Contratacion;
import com.isw2.nahuat.model.DetallePlanilla;
import com.isw2.nahuat.model.EmpleadoDocumento;
import com.isw2.nahuat.model.EmpleadoExperiencia;
import com.isw2.nahuat.model.EmpleadoIdioma;
import com.isw2.nahuat.model.EmpleadoReferencia;
import com.isw2.nahuat.model.EmpresaContacto;
import com.isw2.nahuat.model.Marcacion;
import com.isw2.nahuat.model.MarcacionDextra;
import com.isw2.nahuat.model.Usuario;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-01T16:35:04")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, String> direccion;
    public static volatile SingularAttribute<Empleado, Usuario> usuario;
    public static volatile ListAttribute<Empleado, EmpresaContacto> empresaContactoList;
    public static volatile ListAttribute<Empleado, EmpleadoExperiencia> empleadoExperienciaList;
    public static volatile ListAttribute<Empleado, EmpleadoReferencia> empleadoReferenciaList;
    public static volatile ListAttribute<Empleado, EmpleadoDocumento> empleadoDocumentoList;
    public static volatile SingularAttribute<Empleado, Date> fechaNacimiento;
    public static volatile SingularAttribute<Empleado, String> apellidoCasada;
    public static volatile SingularAttribute<Empleado, String> primerNombre;
    public static volatile SingularAttribute<Empleado, CatalogoMunicipio> idCatalogoMunicipio;
    public static volatile SingularAttribute<Empleado, String> primerApellido;
    public static volatile ListAttribute<Empleado, MarcacionDextra> marcacionDextraList;
    public static volatile ListAttribute<Empleado, DetallePlanilla> detallePlanillaList;
    public static volatile ListAttribute<Empleado, EmpleadoIdioma> empleadoIdiomaList;
    public static volatile ListAttribute<Empleado, Contratacion> contratacionList;
    public static volatile SingularAttribute<Empleado, CatalogoEstado> idCatalogoEstado;
    public static volatile SingularAttribute<Empleado, String> segundoApellido;
    public static volatile ListAttribute<Empleado, AdelantoSalario> adelantoSalarioList;
    public static volatile SingularAttribute<Empleado, String> correoElectronico;
    public static volatile SingularAttribute<Empleado, Character> genero;
    public static volatile SingularAttribute<Empleado, String> telefonoDomicilio;
    public static volatile ListAttribute<Empleado, Marcacion> marcacionList;
    public static volatile SingularAttribute<Empleado, String> idEmpleado;
    public static volatile SingularAttribute<Empleado, CatalogoEstadoCivil> idCatalogoEstadoCivil;
    public static volatile SingularAttribute<Empleado, String> segundoNombre;
    public static volatile SingularAttribute<Empleado, Serializable> foto;
    public static volatile SingularAttribute<Empleado, String> telefonoMovil;

}