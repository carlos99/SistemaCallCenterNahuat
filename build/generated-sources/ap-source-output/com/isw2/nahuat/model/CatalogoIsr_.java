package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoEstado;
import com.isw2.nahuat.model.Planilla;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-23T05:10:01")
@StaticMetamodel(CatalogoIsr.class)
public class CatalogoIsr_ { 

    public static volatile SingularAttribute<CatalogoIsr, Planilla> idPlanilla;
    public static volatile SingularAttribute<CatalogoIsr, String> idCatalogoIsr;
    public static volatile SingularAttribute<CatalogoIsr, Short> montoExceso;
    public static volatile SingularAttribute<CatalogoIsr, Date> hasta;
    public static volatile SingularAttribute<CatalogoIsr, Short> cuotaFija;
    public static volatile SingularAttribute<CatalogoIsr, CatalogoEstado> idCatalogoEstado;
    public static volatile SingularAttribute<CatalogoIsr, Date> desde;
    public static volatile SingularAttribute<CatalogoIsr, Short> porcentajeAplicar;

}