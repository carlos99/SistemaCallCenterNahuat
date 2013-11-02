package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoDepartamento;
import com.isw2.nahuat.bean.CatalogoDepartamentoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoDepartamentoController")
@ViewScoped
public class CatalogoDepartamentoController extends AbstractController<CatalogoDepartamento> implements Serializable {

    @Inject
    private CatalogoDepartamentoFacade ejbFacade;

    public CatalogoDepartamentoController() {
        super(CatalogoDepartamento.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
