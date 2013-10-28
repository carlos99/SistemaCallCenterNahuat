package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoCargo;
import com.isw2.nahuat.model.CatalogoContratacion;
import com.isw2.nahuat.model.CatalogoHorario;
import com.isw2.nahuat.model.Empleado;
import com.isw2.nahuat.model.Empresa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-28T04:33:41")
@StaticMetamodel(Contratacion.class)
public class Contratacion_ { 

    public static volatile SingularAttribute<Contratacion, Empresa> idEmpresa;
    public static volatile SingularAttribute<Contratacion, CatalogoHorario> idCatalogoHorario;
    public static volatile SingularAttribute<Contratacion, Empleado> idEmpleado;
    public static volatile SingularAttribute<Contratacion, Date> fechaFin;
    public static volatile SingularAttribute<Contratacion, String> salarioActual;
    public static volatile SingularAttribute<Contratacion, CatalogoContratacion> idCatalogoContratacion;
    public static volatile SingularAttribute<Contratacion, CatalogoCargo> idCatalogoCargo;
    public static volatile SingularAttribute<Contratacion, Date> fechaInicio;
    public static volatile SingularAttribute<Contratacion, String> idContratacion;

}