package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoIngreso;
import com.isw2.nahuat.model.DetallePlanilla;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-28T04:33:41")
@StaticMetamodel(DplanillaIngreso.class)
public class DplanillaIngreso_ { 

    public static volatile SingularAttribute<DplanillaIngreso, String> idDplanillaIngreso;
    public static volatile SingularAttribute<DplanillaIngreso, CatalogoIngreso> idCatalogoIngreso;
    public static volatile SingularAttribute<DplanillaIngreso, Short> monto;
    public static volatile SingularAttribute<DplanillaIngreso, DetallePlanilla> idDetallePlanilla;

}