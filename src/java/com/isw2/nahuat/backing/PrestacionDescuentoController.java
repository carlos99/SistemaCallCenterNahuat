package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.PrestacionDescuento;
import com.isw2.nahuat.bean.PrestacionDescuentoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "prestacionDescuentoController")
@ViewScoped
public class PrestacionDescuentoController extends AbstractController<PrestacionDescuento> implements Serializable {

    @Inject
    private PrestacionDescuentoFacade ejbFacade;

    public PrestacionDescuentoController() {
        super(PrestacionDescuento.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
