package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoReferencia;
import com.isw2.nahuat.bean.CatalogoReferenciaFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoReferenciaController")
@ViewScoped
public class CatalogoReferenciaController extends AbstractController<CatalogoReferencia> implements Serializable {

    @Inject
    private CatalogoReferenciaFacade ejbFacade;

    public CatalogoReferenciaController() {
        super(CatalogoReferencia.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
