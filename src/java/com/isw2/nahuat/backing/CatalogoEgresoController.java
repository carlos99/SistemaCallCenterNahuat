package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoEgreso;
import com.isw2.nahuat.bean.CatalogoEgresoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoEgresoController")
@ViewScoped
public class CatalogoEgresoController extends AbstractController<CatalogoEgreso> implements Serializable {

    @Inject
    private CatalogoEgresoFacade ejbFacade;

    public CatalogoEgresoController() {
        super(CatalogoEgreso.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
