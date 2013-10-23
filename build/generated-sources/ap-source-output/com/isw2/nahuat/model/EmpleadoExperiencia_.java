package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoCargo;
import com.isw2.nahuat.model.Empleado;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-23T05:10:01")
@StaticMetamodel(EmpleadoExperiencia.class)
public class EmpleadoExperiencia_ { 

    public static volatile SingularAttribute<EmpleadoExperiencia, BigInteger> salario;
    public static volatile SingularAttribute<EmpleadoExperiencia, Empleado> idEmpleado;
    public static volatile SingularAttribute<EmpleadoExperiencia, String> empresa;
    public static volatile SingularAttribute<EmpleadoExperiencia, Date> fechaFin;
    public static volatile SingularAttribute<EmpleadoExperiencia, String> descripcionExperiencia;
    public static volatile SingularAttribute<EmpleadoExperiencia, CatalogoCargo> idCatalogoCargo;
    public static volatile SingularAttribute<EmpleadoExperiencia, String> idEmpeladoExperiencia;
    public static volatile SingularAttribute<EmpleadoExperiencia, Date> fechaInicio;

}