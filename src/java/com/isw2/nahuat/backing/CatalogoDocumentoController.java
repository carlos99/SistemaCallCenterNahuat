package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoDocumento;
import com.isw2.nahuat.session.CatalogoDocumentoFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoDocumentoController")
@ViewScoped
public class CatalogoDocumentoController extends AbstractController<CatalogoDocumento> implements Serializable {

    @Inject
    private CatalogoDocumentoFacade ejbFacade;

    public CatalogoDocumentoController() {
        super(CatalogoDocumento.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
