package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoPeriodo;
import com.isw2.nahuat.model.CatalogoPlanilla;
import com.isw2.nahuat.model.CatalogoUbicacion;
import com.isw2.nahuat.model.Empresa;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-10T09:04:43")
@StaticMetamodel(EmpresaConfiguracion.class)
public class EmpresaConfiguracion_ { 

    public static volatile SingularAttribute<EmpresaConfiguracion, CatalogoPeriodo> idCatalogoPeriodo;
    public static volatile SingularAttribute<EmpresaConfiguracion, String> idEmpresaConfiguracion;
    public static volatile SingularAttribute<EmpresaConfiguracion, CatalogoPlanilla> idCatalogoPlanilla;
    public static volatile SingularAttribute<EmpresaConfiguracion, Empresa> idEmpresa;
    public static volatile SingularAttribute<EmpresaConfiguracion, BigInteger> porcentajeLlegadaTarde;
    public static volatile SingularAttribute<EmpresaConfiguracion, BigInteger> porcentajeHoraExtra;
    public static volatile SingularAttribute<EmpresaConfiguracion, CatalogoUbicacion> idCatalogoUbicacion;

}