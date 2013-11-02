package com.isw2.nahuat.model;

import com.isw2.nahuat.model.AdelantoSalario;
import com.isw2.nahuat.model.CatalogoEstado;
import com.isw2.nahuat.model.EmpresaConfiguracion;
import com.isw2.nahuat.model.Marcacion;
import com.isw2.nahuat.model.MarcacionDextra;
import com.isw2.nahuat.model.Planilla;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-02T11:01:54")
@StaticMetamodel(CatalogoPeriodo.class)
public class CatalogoPeriodo_ { 

    public static volatile SingularAttribute<CatalogoPeriodo, String> nombre;
    public static volatile ListAttribute<CatalogoPeriodo, AdelantoSalario> adelantoSalarioList;
    public static volatile SingularAttribute<CatalogoPeriodo, String> idCatalogoPeriodo;
    public static volatile ListAttribute<CatalogoPeriodo, EmpresaConfiguracion> empresaConfiguracionList;
    public static volatile ListAttribute<CatalogoPeriodo, Marcacion> marcacionList;
    public static volatile ListAttribute<CatalogoPeriodo, Planilla> planillaList;
    public static volatile ListAttribute<CatalogoPeriodo, MarcacionDextra> marcacionDextraList;
    public static volatile SingularAttribute<CatalogoPeriodo, Date> fechaFin;
    public static volatile SingularAttribute<CatalogoPeriodo, BigInteger> totalDias;
    public static volatile SingularAttribute<CatalogoPeriodo, CatalogoEstado> idCatalogoEstado;
    public static volatile SingularAttribute<CatalogoPeriodo, Date> fechaInicio;

}