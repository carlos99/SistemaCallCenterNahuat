package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoDocumento;
import com.isw2.nahuat.model.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-09T21:51:13")
@StaticMetamodel(EmpleadoDocumento.class)
public class EmpleadoDocumento_ { 

    public static volatile SingularAttribute<EmpleadoDocumento, String> idEmpleadoDocumento;
    public static volatile SingularAttribute<EmpleadoDocumento, String> institucion;
    public static volatile SingularAttribute<EmpleadoDocumento, CatalogoDocumento> idCatalogoDocumento;
    public static volatile SingularAttribute<EmpleadoDocumento, String> fechaVencimiento;
    public static volatile SingularAttribute<EmpleadoDocumento, Empleado> idEmpleado;
    public static volatile SingularAttribute<EmpleadoDocumento, String> lugarEmision;
    public static volatile SingularAttribute<EmpleadoDocumento, Date> fechaEmision;

}