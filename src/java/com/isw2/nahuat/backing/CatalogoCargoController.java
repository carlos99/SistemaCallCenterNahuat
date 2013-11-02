package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoCargo;
import com.isw2.nahuat.bean.CatalogoCargoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoCargoController")
@ViewScoped
public class CatalogoCargoController extends AbstractController<CatalogoCargo> implements Serializable {

    @Inject
    private CatalogoCargoFacade ejbFacade;

    public CatalogoCargoController() {
        super(CatalogoCargo.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
