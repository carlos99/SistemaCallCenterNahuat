package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoDextra;
import com.isw2.nahuat.model.CatalogoEstado;
import com.isw2.nahuat.model.CatalogoPeriodo;
import com.isw2.nahuat.model.Empleado;
import com.isw2.nahuat.model.Empresa;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-02T11:01:54")
@StaticMetamodel(MarcacionDextra.class)
public class MarcacionDextra_ { 

    public static volatile SingularAttribute<MarcacionDextra, Date> horaFinExtra;
    public static volatile SingularAttribute<MarcacionDextra, CatalogoPeriodo> idCatalogoPeriodo;
    public static volatile SingularAttribute<MarcacionDextra, Date> fechaFinExtra;
    public static volatile SingularAttribute<MarcacionDextra, Empresa> idEmpresa;
    public static volatile SingularAttribute<MarcacionDextra, Empleado> idEmpleado;
    public static volatile SingularAttribute<MarcacionDextra, Date> fechaInicioExtra;
    public static volatile SingularAttribute<MarcacionDextra, BigInteger> minutosExtraTotal;
    public static volatile SingularAttribute<MarcacionDextra, Date> horaInicioExtra;
    public static volatile SingularAttribute<MarcacionDextra, CatalogoDextra> idCatalogoDextra;
    public static volatile SingularAttribute<MarcacionDextra, Date> fechaCreacion;
    public static volatile SingularAttribute<MarcacionDextra, String> idMarcacionDextra;
    public static volatile SingularAttribute<MarcacionDextra, CatalogoEstado> idCatalogoEstado;

}