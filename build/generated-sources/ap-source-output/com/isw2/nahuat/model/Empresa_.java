package com.isw2.nahuat.model;

import com.isw2.nahuat.model.AdelantoSalario;
import com.isw2.nahuat.model.CatalogoEstado;
import com.isw2.nahuat.model.CatalogoMunicipio;
import com.isw2.nahuat.model.CatalogoRubro;
import com.isw2.nahuat.model.Contratacion;
import com.isw2.nahuat.model.EmpresaConfiguracion;
import com.isw2.nahuat.model.EmpresaContacto;
import com.isw2.nahuat.model.EmpresaDepartamento;
import com.isw2.nahuat.model.Marcacion;
import com.isw2.nahuat.model.MarcacionDextra;
import com.isw2.nahuat.model.Planilla;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-03T00:34:02")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile SingularAttribute<Empresa, String> sitioWeb;
    public static volatile SingularAttribute<Empresa, String> direccion;
    public static volatile ListAttribute<Empresa, Contratacion> contratacionList;
    public static volatile ListAttribute<Empresa, EmpresaConfiguracion> empresaConfiguracionList;
    public static volatile ListAttribute<Empresa, EmpresaContacto> empresaContactoList;
    public static volatile ListAttribute<Empresa, Planilla> planillaList;
    public static volatile SingularAttribute<Empresa, String> telefono;
    public static volatile SingularAttribute<Empresa, String> descripcion;
    public static volatile SingularAttribute<Empresa, CatalogoRubro> idCatalogoRubro;
    public static volatile SingularAttribute<Empresa, CatalogoEstado> idCatalogoEstado;
    public static volatile ListAttribute<Empresa, AdelantoSalario> adelantoSalarioList;
    public static volatile SingularAttribute<Empresa, String> nombre;
    public static volatile ListAttribute<Empresa, EmpresaDepartamento> empresaDepartamentoList;
    public static volatile SingularAttribute<Empresa, CatalogoMunicipio> idCatalogoMunicipio;
    public static volatile SingularAttribute<Empresa, String> idEmpresa;
    public static volatile ListAttribute<Empresa, Marcacion> marcacionList;
    public static volatile ListAttribute<Empresa, MarcacionDextra> marcacionDextraList;
    public static volatile SingularAttribute<Empresa, String> correo;

}