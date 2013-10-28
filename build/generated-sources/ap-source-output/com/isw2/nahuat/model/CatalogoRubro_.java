package com.isw2.nahuat.model;

import com.isw2.nahuat.model.Empresa;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-28T04:33:41")
@StaticMetamodel(CatalogoRubro.class)
public class CatalogoRubro_ { 

    public static volatile SingularAttribute<CatalogoRubro, String> nombre;
    public static volatile ListAttribute<CatalogoRubro, Empresa> empresaList;
    public static volatile SingularAttribute<CatalogoRubro, String> idCatalogoRubro;
    public static volatile SingularAttribute<CatalogoRubro, String> descripcion;

}