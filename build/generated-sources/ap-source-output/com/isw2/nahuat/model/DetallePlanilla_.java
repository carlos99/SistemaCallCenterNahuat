package com.isw2.nahuat.model;

import com.isw2.nahuat.model.DplanillaEgreso;
import com.isw2.nahuat.model.DplanillaIngreso;
import com.isw2.nahuat.model.Empleado;
import com.isw2.nahuat.model.Planilla;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-03T00:34:02")
@StaticMetamodel(DetallePlanilla.class)
public class DetallePlanilla_ { 

    public static volatile SingularAttribute<DetallePlanilla, Short> ingresoOtrosTotal;
    public static volatile SingularAttribute<DetallePlanilla, Short> afp;
    public static volatile SingularAttribute<DetallePlanilla, Short> adelantoSalario;
    public static volatile ListAttribute<DetallePlanilla, DplanillaIngreso> dplanillaIngresoList;
    public static volatile SingularAttribute<DetallePlanilla, Short> salarioNeto;
    public static volatile SingularAttribute<DetallePlanilla, Short> isss;
    public static volatile SingularAttribute<DetallePlanilla, Short> renta;
    public static volatile SingularAttribute<DetallePlanilla, Short> deduccionOtros;
    public static volatile SingularAttribute<DetallePlanilla, Empleado> idEmpleado;
    public static volatile SingularAttribute<DetallePlanilla, Short> ipsfa;
    public static volatile ListAttribute<DetallePlanilla, DplanillaEgreso> dplanillaEgresoList;
    public static volatile SingularAttribute<DetallePlanilla, Planilla> idPlanilla;
    public static volatile SingularAttribute<DetallePlanilla, Short> ingresoBase;
    public static volatile SingularAttribute<DetallePlanilla, String> idDetallePlanilla;

}