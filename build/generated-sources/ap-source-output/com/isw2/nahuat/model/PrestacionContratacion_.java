package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoContratacion;
import com.isw2.nahuat.model.PrestacionDescuento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-10T09:04:43")
@StaticMetamodel(PrestacionContratacion.class)
public class PrestacionContratacion_ { 

    public static volatile SingularAttribute<PrestacionContratacion, String> nombre;
    public static volatile SingularAttribute<PrestacionContratacion, String> idPrestacionContratacion;
    public static volatile SingularAttribute<PrestacionContratacion, String> descripcion;
    public static volatile SingularAttribute<PrestacionContratacion, PrestacionDescuento> idPrestacionDescuento;
    public static volatile SingularAttribute<PrestacionContratacion, CatalogoContratacion> idCatalogoContratacion;

}