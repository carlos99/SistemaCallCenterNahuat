package com.isw2.nahuat.backing;

import com.isw2.nahuat.bean.SbPlanillaFacade;
import com.isw2.nahuat.model.Planilla;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.faces.view.ViewScoped;
import org.primefaces.event.FlowEvent;

@Named(value = "MbPlanillaController")
@ViewScoped
public class MbPlanillaController extends AbstractController<Planilla> implements Serializable {

    private boolean skip;
    @Inject
    private SbPlanillaFacade ejbFacade;

    public MbPlanillaController() {
        super(Planilla.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public String onFlowProcess(FlowEvent event) {
        if (skip) {
            skip = false;   //reset in case user goes back  
            return "Confirmacion";
        } else {
            return event.getNewStep();
        }
    }
}
