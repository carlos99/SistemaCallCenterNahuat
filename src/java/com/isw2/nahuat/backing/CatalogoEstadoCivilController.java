package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoEstadoCivil;
import com.isw2.nahuat.session.CatalogoEstadoCivilFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoEstadoCivilController")
@ViewScoped
public class CatalogoEstadoCivilController extends AbstractController<CatalogoEstadoCivil> implements Serializable {

    @Inject
    private CatalogoEstadoCivilFacade ejbFacade;

    public CatalogoEstadoCivilController() {
        super(CatalogoEstadoCivil.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
