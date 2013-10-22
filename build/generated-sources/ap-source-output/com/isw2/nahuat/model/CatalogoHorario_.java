package com.isw2.nahuat.model;

import com.isw2.nahuat.model.Contratacion;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-21T05:16:03")
@StaticMetamodel(CatalogoHorario.class)
public class CatalogoHorario_ { 

    public static volatile SingularAttribute<CatalogoHorario, String> nombre;
    public static volatile ListAttribute<CatalogoHorario, Contratacion> contratacionList;
    public static volatile SingularAttribute<CatalogoHorario, String> idCatalogoHorario;
    public static volatile SingularAttribute<CatalogoHorario, Date> horaInicio;
    public static volatile SingularAttribute<CatalogoHorario, String> diaInicio;
    public static volatile SingularAttribute<CatalogoHorario, String> diaFinal;
    public static volatile SingularAttribute<CatalogoHorario, Date> horaFin;
    public static volatile SingularAttribute<CatalogoHorario, BigInteger> totalHoras;

}