package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoReferencia;
import com.isw2.nahuat.model.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-02T11:01:54")
@StaticMetamodel(EmpleadoReferencia.class)
public class EmpleadoReferencia_ { 

    public static volatile SingularAttribute<EmpleadoReferencia, Empleado> idEmpleado;
    public static volatile SingularAttribute<EmpleadoReferencia, String> telefono;
    public static volatile SingularAttribute<EmpleadoReferencia, CatalogoReferencia> idCatalogoRefencia;
    public static volatile SingularAttribute<EmpleadoReferencia, String> idEmpleadoReferencia;
    public static volatile SingularAttribute<EmpleadoReferencia, String> nombreReferencia;

}