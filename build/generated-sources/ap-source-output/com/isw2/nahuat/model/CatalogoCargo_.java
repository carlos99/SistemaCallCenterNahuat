package com.isw2.nahuat.model;

import com.isw2.nahuat.model.Contratacion;
import com.isw2.nahuat.model.EmpleadoExperiencia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-10T09:04:43")
@StaticMetamodel(CatalogoCargo.class)
public class CatalogoCargo_ { 

    public static volatile SingularAttribute<CatalogoCargo, String> nombre;
    public static volatile ListAttribute<CatalogoCargo, Contratacion> contratacionList;
    public static volatile ListAttribute<CatalogoCargo, EmpleadoExperiencia> empleadoExperienciaList;
    public static volatile SingularAttribute<CatalogoCargo, String> descripcion;
    public static volatile SingularAttribute<CatalogoCargo, String> idCatalogoCargo;

}