package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoEstudio;
import com.isw2.nahuat.bean.CatalogoEstudioFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoEstudioController")
@ViewScoped
public class CatalogoEstudioController extends AbstractController<CatalogoEstudio> implements Serializable {

    @Inject
    private CatalogoEstudioFacade ejbFacade;

    public CatalogoEstudioController() {
        super(CatalogoEstudio.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
