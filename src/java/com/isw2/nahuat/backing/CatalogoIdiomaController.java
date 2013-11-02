package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoIdioma;
import com.isw2.nahuat.bean.CatalogoIdiomaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoIdiomaController")
@ViewScoped
public class CatalogoIdiomaController extends AbstractController<CatalogoIdioma> implements Serializable {

    @Inject
    private CatalogoIdiomaFacade ejbFacade;

    public CatalogoIdiomaController() {
        super(CatalogoIdioma.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
