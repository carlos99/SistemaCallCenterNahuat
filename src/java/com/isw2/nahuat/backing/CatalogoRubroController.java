package com.isw2.nahuat.backing;

import com.isw2.nahuat.model.CatalogoRubro;
import com.isw2.nahuat.bean.CatalogoRubroFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;

@Named(value = "catalogoRubroController")
@ViewScoped
public class CatalogoRubroController extends AbstractController<CatalogoRubro> implements Serializable {

    @Inject
    private CatalogoRubroFacade ejbFacade;

    public CatalogoRubroController() {
        super(CatalogoRubro.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
}
