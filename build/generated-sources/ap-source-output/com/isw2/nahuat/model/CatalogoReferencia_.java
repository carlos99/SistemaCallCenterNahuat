package com.isw2.nahuat.model;

import com.isw2.nahuat.model.EmpleadoReferencia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-21T05:16:03")
@StaticMetamodel(CatalogoReferencia.class)
public class CatalogoReferencia_ { 

    public static volatile SingularAttribute<CatalogoReferencia, String> nombre;
    public static volatile SingularAttribute<CatalogoReferencia, String> descripcion;
    public static volatile ListAttribute<CatalogoReferencia, EmpleadoReferencia> empleadoReferenciaList;
    public static volatile SingularAttribute<CatalogoReferencia, String> idCatalogoReferencia;

}