package com.isw2.nahuat.model;

import com.isw2.nahuat.model.PrestacionContratacion;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-02T11:01:54")
@StaticMetamodel(PrestacionDescuento.class)
public class PrestacionDescuento_ { 

    public static volatile SingularAttribute<PrestacionDescuento, String> nombre;
    public static volatile SingularAttribute<PrestacionDescuento, BigInteger> porcentaje;
    public static volatile ListAttribute<PrestacionDescuento, PrestacionContratacion> prestacionContratacionList;
    public static volatile SingularAttribute<PrestacionDescuento, String> descripcion;
    public static volatile SingularAttribute<PrestacionDescuento, Character> idPrestacionDescuento;
    public static volatile SingularAttribute<PrestacionDescuento, BigInteger> cantidadMaxima;

}