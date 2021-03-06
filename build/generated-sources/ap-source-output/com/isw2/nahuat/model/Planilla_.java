package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoEstado;
import com.isw2.nahuat.model.CatalogoIsr;
import com.isw2.nahuat.model.CatalogoPeriodo;
import com.isw2.nahuat.model.CatalogoPlanilla;
import com.isw2.nahuat.model.DetallePlanilla;
import com.isw2.nahuat.model.Empresa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-23T05:10:01")
@StaticMetamodel(Planilla.class)
public class Planilla_ { 

    public static volatile SingularAttribute<Planilla, CatalogoPeriodo> idCatalogoPeriodo;
    public static volatile SingularAttribute<Planilla, CatalogoPlanilla> idCatalogoPlanilla;
    public static volatile SingularAttribute<Planilla, Short> totalPagar;
    public static volatile SingularAttribute<Planilla, Empresa> idEmpresa;
    public static volatile ListAttribute<Planilla, CatalogoIsr> catalogoIsrList;
    public static volatile SingularAttribute<Planilla, String> idPlanilla;
    public static volatile ListAttribute<Planilla, DetallePlanilla> detallePlanillaList;
    public static volatile SingularAttribute<Planilla, Date> fechaCreacion;
    public static volatile SingularAttribute<Planilla, Date> fechaPago;
    public static volatile SingularAttribute<Planilla, CatalogoEstado> idCatalogoEstado;

}