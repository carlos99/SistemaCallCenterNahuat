package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoPeriodo;
import com.isw2.nahuat.bean.CatalogoPeriodoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoPeriodoController")
@ViewScoped
public class CatalogoPeriodoController extends AbstractController<CatalogoPeriodo> implements Serializable {

    @Inject
    private CatalogoPeriodoFacade ejbFacade;

    public CatalogoPeriodoController() {
        super(CatalogoPeriodo.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
