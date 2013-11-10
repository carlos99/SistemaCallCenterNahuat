package com.isw2.nahuat.model;

import com.isw2.nahuat.model.EmpleadoIdioma;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-09T21:51:13")
@StaticMetamodel(CatalogoIdioma.class)
public class CatalogoIdioma_ { 

    public static volatile SingularAttribute<CatalogoIdioma, String> nombre;
    public static volatile SingularAttribute<CatalogoIdioma, String> idCatalogoIdioma;
    public static volatile ListAttribute<CatalogoIdioma, EmpleadoIdioma> empleadoIdiomaList;

}