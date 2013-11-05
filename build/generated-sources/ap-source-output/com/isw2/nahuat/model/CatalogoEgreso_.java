package com.isw2.nahuat.model;

import com.isw2.nahuat.model.DplanillaEgreso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-05T01:47:55")
@StaticMetamodel(CatalogoEgreso.class)
public class CatalogoEgreso_ { 

    public static volatile SingularAttribute<CatalogoEgreso, String> nombre;
    public static volatile SingularAttribute<CatalogoEgreso, String> idCatalogoEgreso;
    public static volatile ListAttribute<CatalogoEgreso, DplanillaEgreso> dplanillaEgresoList;
    public static volatile SingularAttribute<CatalogoEgreso, String> descripcion;

}