package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoEstado;
import com.isw2.nahuat.model.CatalogoPeriodo;
import com.isw2.nahuat.model.Empleado;
import com.isw2.nahuat.model.Empresa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-21T05:16:03")
@StaticMetamodel(AdelantoSalario.class)
public class AdelantoSalario_ { 

    public static volatile SingularAttribute<AdelantoSalario, CatalogoPeriodo> idCatalogoPeriodo;
    public static volatile SingularAttribute<AdelantoSalario, Empresa> idEmpresa;
    public static volatile SingularAttribute<AdelantoSalario, Empleado> idEmpleado;
    public static volatile SingularAttribute<AdelantoSalario, String> idAdelantoSalario;
    public static volatile SingularAttribute<AdelantoSalario, Date> fechaSolicitudCreada;
    public static volatile SingularAttribute<AdelantoSalario, CatalogoEstado> idCatalogoEstado;
    public static volatile SingularAttribute<AdelantoSalario, Date> fechaSolicitudResolucion;
    public static volatile SingularAttribute<AdelantoSalario, Short> monto;

}