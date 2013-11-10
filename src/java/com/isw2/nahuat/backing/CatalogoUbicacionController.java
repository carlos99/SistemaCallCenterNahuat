package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoUbicacion;
import com.isw2.nahuat.session.CatalogoUbicacionFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoUbicacionController")
@ViewScoped
public class CatalogoUbicacionController extends AbstractController<CatalogoUbicacion> implements Serializable {

    @Inject
    private CatalogoUbicacionFacade ejbFacade;

    public CatalogoUbicacionController() {
        super(CatalogoUbicacion.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
