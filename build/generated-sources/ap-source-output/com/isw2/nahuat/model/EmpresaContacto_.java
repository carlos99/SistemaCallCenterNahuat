package com.isw2.nahuat.model;

import com.isw2.nahuat.model.Empleado;
import com.isw2.nahuat.model.Empresa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-05T01:47:55")
@StaticMetamodel(EmpresaContacto.class)
public class EmpresaContacto_ { 

    public static volatile SingularAttribute<EmpresaContacto, Empresa> idEmpresa;
    public static volatile SingularAttribute<EmpresaContacto, Empleado> idEmpleado;
    public static volatile SingularAttribute<EmpresaContacto, String> idEmpresaContacto;
    public static volatile SingularAttribute<EmpresaContacto, Date> fechaCreacion;

}