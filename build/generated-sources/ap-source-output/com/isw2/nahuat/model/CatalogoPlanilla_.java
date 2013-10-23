package com.isw2.nahuat.model;

import com.isw2.nahuat.model.EmpresaConfiguracion;
import com.isw2.nahuat.model.Planilla;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-23T05:10:01")
@StaticMetamodel(CatalogoPlanilla.class)
public class CatalogoPlanilla_ { 

    public static volatile SingularAttribute<CatalogoPlanilla, String> nombre;
    public static volatile SingularAttribute<CatalogoPlanilla, String> idCatalogoPlanilla;
    public static volatile ListAttribute<CatalogoPlanilla, EmpresaConfiguracion> empresaConfiguracionList;
    public static volatile ListAttribute<CatalogoPlanilla, Planilla> planillaList;
    public static volatile SingularAttribute<CatalogoPlanilla, String> descripcion;

}