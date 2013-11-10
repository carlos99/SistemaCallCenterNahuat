package com.isw2.nahuat.model;

import com.isw2.nahuat.model.Contratacion;
import com.isw2.nahuat.model.PrestacionContratacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-09T21:51:13")
@StaticMetamodel(CatalogoContratacion.class)
public class CatalogoContratacion_ { 

    public static volatile SingularAttribute<CatalogoContratacion, String> nombre;
    public static volatile ListAttribute<CatalogoContratacion, Contratacion> contratacionList;
    public static volatile ListAttribute<CatalogoContratacion, PrestacionContratacion> prestacionContratacionList;
    public static volatile SingularAttribute<CatalogoContratacion, String> descripcion;
    public static volatile SingularAttribute<CatalogoContratacion, String> idCatalogoContratacion;

}