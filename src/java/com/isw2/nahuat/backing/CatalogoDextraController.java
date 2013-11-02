package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoDextra;
import com.isw2.nahuat.bean.CatalogoDextraFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoDextraController")
@ViewScoped
public class CatalogoDextraController extends AbstractController<CatalogoDextra> implements Serializable {

    @Inject
    private CatalogoDextraFacade ejbFacade;

    public CatalogoDextraController() {
        super(CatalogoDextra.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
