/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.session;

import com.isw2.nahuat.model.PrestacionDescuento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author carlos
 */
@Stateless
public class PrestacionDescuentoFacade extends AbstractFacade<PrestacionDescuento> {
    @PersistenceContext(unitName = "NahuatPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrestacionDescuentoFacade() {
        super(PrestacionDescuento.class);
    }
    
}
