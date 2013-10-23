package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoDepartamento;
import com.isw2.nahuat.model.Empleado;
import com.isw2.nahuat.model.Empresa;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-10-23T05:10:01")
@StaticMetamodel(CatalogoMunicipio.class)
public class CatalogoMunicipio_ { 

    public static volatile SingularAttribute<CatalogoMunicipio, String> nombre;
    public static volatile ListAttribute<CatalogoMunicipio, Empleado> empleadoList;
    public static volatile ListAttribute<CatalogoMunicipio, Empresa> empresaList;
    public static volatile SingularAttribute<CatalogoMunicipio, String> idCatalogoMunicipio;
    public static volatile SingularAttribute<CatalogoMunicipio, CatalogoDepartamento> idCatalogoDepartamento;

}