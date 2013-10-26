package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoIngreso;
import com.isw2.nahuat.session.CatalogoIngresoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoIngresoController")
@ViewScoped
public class CatalogoIngresoController extends AbstractController<CatalogoIngreso> implements Serializable {

    @Inject
    private CatalogoIngresoFacade ejbFacade;

    public CatalogoIngresoController() {
        super(CatalogoIngreso.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
