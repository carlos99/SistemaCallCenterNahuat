package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoHorario;
import com.isw2.nahuat.bean.CatalogoHorarioFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoHorarioController")
@ViewScoped
public class CatalogoHorarioController extends AbstractController<CatalogoHorario> implements Serializable {

    @Inject
    private CatalogoHorarioFacade ejbFacade;

    public CatalogoHorarioController() {
        super(CatalogoHorario.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
