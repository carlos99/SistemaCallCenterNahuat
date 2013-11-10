package com.isw2.nahuat.model;

import com.isw2.nahuat.model.AdelantoSalario;
import com.isw2.nahuat.model.CatalogoIsr;
import com.isw2.nahuat.model.CatalogoPeriodo;
import com.isw2.nahuat.model.Empleado;
import com.isw2.nahuat.model.Empresa;
import com.isw2.nahuat.model.MarcacionDextra;
import com.isw2.nahuat.model.Planilla;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-09T21:51:13")
@StaticMetamodel(CatalogoEstado.class)
public class CatalogoEstado_ { 

    public static volatile SingularAttribute<CatalogoEstado, String> nombre;
    public static volatile ListAttribute<CatalogoEstado, CatalogoPeriodo> catalogoPeriodoList;
    public static volatile ListAttribute<CatalogoEstado, AdelantoSalario> adelantoSalarioList;
    public static volatile ListAttribute<CatalogoEstado, Empleado> empleadoList;
    public static volatile ListAttribute<CatalogoEstado, Empresa> empresaList;
    public static volatile ListAttribute<CatalogoEstado, CatalogoIsr> catalogoIsrList;
    public static volatile ListAttribute<CatalogoEstado, Planilla> planillaList;
    public static volatile ListAttribute<CatalogoEstado, MarcacionDextra> marcacionDextraList;
    public static volatile SingularAttribute<CatalogoEstado, String> descripcion;
    public static volatile SingularAttribute<CatalogoEstado, String> entidad;
    public static volatile SingularAttribute<CatalogoEstado, String> idCatalogoEstado;

}