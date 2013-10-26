package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoContratacion;
import com.isw2.nahuat.session.CatalogoContratacionFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoContratacionController")
@ViewScoped
public class CatalogoContratacionController extends AbstractController<CatalogoContratacion> implements Serializable {

    @Inject
    private CatalogoContratacionFacade ejbFacade;

    public CatalogoContratacionController() {
        super(CatalogoContratacion.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
