package com.isw2.nahuat.model;

import com.isw2.nahuat.model.Empleado;
import com.isw2.nahuat.model.UsuarioNivel;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-28T04:33:41")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> idUsuario;
    public static volatile SingularAttribute<Usuario, Empleado> idEmpleado;
    public static volatile SingularAttribute<Usuario, String> claveUsuario;
    public static volatile SingularAttribute<Usuario, UsuarioNivel> idUsuarioNivel;
    public static volatile SingularAttribute<Usuario, String> nombreUsuario;

}