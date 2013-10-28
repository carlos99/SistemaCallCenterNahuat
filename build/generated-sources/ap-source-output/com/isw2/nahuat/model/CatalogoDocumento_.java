package com.isw2.nahuat.model;

import com.isw2.nahuat.model.EmpleadoDocumento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-28T04:33:41")
@StaticMetamodel(CatalogoDocumento.class)
public class CatalogoDocumento_ { 

    public static volatile SingularAttribute<CatalogoDocumento, String> nombre;
    public static volatile SingularAttribute<CatalogoDocumento, String> idCatalogoDocumento;
    public static volatile SingularAttribute<CatalogoDocumento, String> descripcion;
    public static volatile ListAttribute<CatalogoDocumento, EmpleadoDocumento> empleadoDocumentoList;

}