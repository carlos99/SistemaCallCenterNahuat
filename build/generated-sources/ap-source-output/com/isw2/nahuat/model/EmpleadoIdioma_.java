package com.isw2.nahuat.model;

import com.isw2.nahuat.model.Empleado;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-10T09:04:43")
@StaticMetamodel(EmpleadoIdioma.class)
public class EmpleadoIdioma_ { 

    public static volatile SingularAttribute<EmpleadoIdioma, BigInteger> hablar;
    public static volatile SingularAttribute<EmpleadoIdioma, Empleado> idEmpleado;
    public static volatile SingularAttribute<EmpleadoIdioma, BigInteger> leer;
    public static volatile SingularAttribute<EmpleadoIdioma, BigInteger> escribir;
    public static volatile SingularAttribute<EmpleadoIdioma, String> idCatalogoIdioma;
    public static volatile SingularAttribute<EmpleadoIdioma, String> idEmpleadoIdioma;

}