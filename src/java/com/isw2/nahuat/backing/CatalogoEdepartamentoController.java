package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoEdepartamento;
import com.isw2.nahuat.session.CatalogoEdepartamentoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoEdepartamentoController")
@ViewScoped
public class CatalogoEdepartamentoController extends AbstractController<CatalogoEdepartamento> implements Serializable {

    @Inject
    private CatalogoEdepartamentoFacade ejbFacade;

    public CatalogoEdepartamentoController() {
        super(CatalogoEdepartamento.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
