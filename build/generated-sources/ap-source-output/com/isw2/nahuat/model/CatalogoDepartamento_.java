package com.isw2.nahuat.model;

import com.isw2.nahuat.model.CatalogoMunicipio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-02T11:01:54")
@StaticMetamodel(CatalogoDepartamento.class)
public class CatalogoDepartamento_ { 

    public static volatile SingularAttribute<CatalogoDepartamento, String> nombre;
    public static volatile SingularAttribute<CatalogoDepartamento, String> idCatalogoDepartamento;
    public static volatile ListAttribute<CatalogoDepartamento, CatalogoMunicipio> catalogoMunicipioList;

}