package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoMunicipio;
import com.isw2.nahuat.session.CatalogoMunicipioFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoMunicipioController")
@ViewScoped
public class CatalogoMunicipioController extends AbstractController<CatalogoMunicipio> implements Serializable {

    @Inject
    private CatalogoMunicipioFacade ejbFacade;

    public CatalogoMunicipioController() {
        super(CatalogoMunicipio.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
