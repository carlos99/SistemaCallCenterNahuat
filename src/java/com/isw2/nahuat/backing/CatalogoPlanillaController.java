package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoPlanilla;
import com.isw2.nahuat.session.CatalogoPlanillaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoPlanillaController")
@ViewScoped
public class CatalogoPlanillaController extends AbstractController<CatalogoPlanilla> implements Serializable {

    @Inject
    private CatalogoPlanillaFacade ejbFacade;

    public CatalogoPlanillaController() {
        super(CatalogoPlanilla.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
