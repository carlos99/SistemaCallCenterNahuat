package com.isw2.nahuat.model;

import com.isw2.nahuat.model.DplanillaEgreso;
import com.isw2.nahuat.model.DplanillaIngreso;
import com.isw2.nahuat.model.Empleado;
import com.isw2.nahuat.model.Planilla;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-10T09:04:43")
@StaticMetamodel(DetallePlanilla.class)
public class DetallePlanilla_ { 

    public static volatile SingularAttribute<DetallePlanilla, BigInteger> ingresoOtrosTotal;
    public static volatile SingularAttribute<DetallePlanilla, BigInteger> afp;
    public static volatile SingularAttribute<DetallePlanilla, BigInteger> adelantoSalario;
    public static volatile ListAttribute<DetallePlanilla, DplanillaIngreso> dplanillaIngresoList;
    public static volatile SingularAttribute<DetallePlanilla, BigInteger> salarioNeto;
    public static volatile SingularAttribute<DetallePlanilla, BigInteger> isss;
    public static volatile SingularAttribute<DetallePlanilla, BigInteger> renta;
    public static volatile SingularAttribute<DetallePlanilla, BigInteger> deduccionOtros;
    public static volatile SingularAttribute<DetallePlanilla, Empleado> idEmpleado;
    public static volatile SingularAttribute<DetallePlanilla, BigInteger> ipsfa;
    public static volatile ListAttribute<DetallePlanilla, DplanillaEgreso> dplanillaEgresoList;
    public static volatile SingularAttribute<DetallePlanilla, Planilla> idPlanilla;
    public static volatile SingularAttribute<DetallePlanilla, BigInteger> ingresoBase;
    public static volatile SingularAttribute<DetallePlanilla, String> idDetallePlanilla;

}