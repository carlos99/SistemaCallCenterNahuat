package com.isw2.nahuat.model;

import com.isw2.nahuat.model.DplanillaIngreso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-28T04:33:41")
@StaticMetamodel(CatalogoIngreso.class)
public class CatalogoIngreso_ { 

    public static volatile SingularAttribute<CatalogoIngreso, String> nombre;
    public static volatile ListAttribute<CatalogoIngreso, DplanillaIngreso> dplanillaIngresoList;
    public static volatile SingularAttribute<CatalogoIngreso, String> descripcion;
    public static volatile SingularAttribute<CatalogoIngreso, String> idCatalogoIngreso;

}