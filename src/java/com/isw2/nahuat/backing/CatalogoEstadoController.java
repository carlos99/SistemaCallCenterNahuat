package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoEstado;
import com.isw2.nahuat.bean.CatalogoEstadoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoEstadoController")
@ViewScoped
public class CatalogoEstadoController extends AbstractController<CatalogoEstado> implements Serializable {

    @Inject
    private CatalogoEstadoFacade ejbFacade;

    public CatalogoEstadoController() {
        super(CatalogoEstado.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
