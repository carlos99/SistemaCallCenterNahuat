package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoEgreso;
import com.isw2.nahuat.model.DetallePlanilla;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-21T05:16:03")
@StaticMetamodel(DplanillaEgreso.class)
public class DplanillaEgreso_ { 

    public static volatile SingularAttribute<DplanillaEgreso, String> idDplanillaEgreso;
    public static volatile SingularAttribute<DplanillaEgreso, CatalogoEgreso> idCatalogoEgreso;
    public static volatile SingularAttribute<DplanillaEgreso, Short> monto;
    public static volatile SingularAttribute<DplanillaEgreso, DetallePlanilla> idDetallePlanilla;

}