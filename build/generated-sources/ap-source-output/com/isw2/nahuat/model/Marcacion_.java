package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoPeriodo;
import com.isw2.nahuat.model.Empleado;
import com.isw2.nahuat.model.Empresa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-28T04:33:41")
@StaticMetamodel(Marcacion.class)
public class Marcacion_ { 

    public static volatile SingularAttribute<Marcacion, CatalogoPeriodo> idCatalogoPeriodo;
    public static volatile SingularAttribute<Marcacion, Date> fechaMarcacion;
    public static volatile SingularAttribute<Marcacion, Empresa> idEmpresa;
    public static volatile SingularAttribute<Marcacion, Date> horaMarcacion;
    public static volatile SingularAttribute<Marcacion, Empleado> idEmpleado;
    public static volatile SingularAttribute<Marcacion, String> idMarcacion;

}