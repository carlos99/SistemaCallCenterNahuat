/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.bean;

import com.isw2.nahuat.model.Planilla;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import org.primefaces.event.FlowEvent;

    
/**
 *
 * @author karlos
 */
@ManagedBean(name="planillaBean")
@ViewScoped
public class PlanillaBean {
    
    private Planilla planilla = new Planilla();  
      
    private boolean skip;  
      
    private static Logger logger = Logger.getLogger(Planilla.class.getName());  

    public Planilla getUser() {
        return planilla;
    }

    public void setUser(Planilla planilla) {
        this.planilla = planilla;
    }
  
 
      
    public void save(ActionEvent actionEvent) {  
        //Persist user  
          
        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + planilla.getIdPlanilla());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
      
    public boolean isSkip() {  
        return skip;  
    }  
  
    public void setSkip(boolean skip) {  
        this.skip = skip;  
    }  
      
    public String onFlowProcess(FlowEvent event) {  
        logger.info("Current wizard step:" + event.getOldStep());  
        logger.info("Next step:" + event.getNewStep());  
          
        if(skip) {  
            skip = false;   //reset in case user goes back  
            return "confirm";  
        }  
        else {  
            return event.getNewStep();  
        }  
    }  
}  
//    public PlanillaBean() {
//    }

