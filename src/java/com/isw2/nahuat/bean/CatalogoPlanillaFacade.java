/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.bean;

import com.isw2.nahuat.model.CatalogoPlanilla;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author carlos
 */
@Stateless
public class CatalogoPlanillaFacade extends AbstractFacade<CatalogoPlanilla> {
    @PersistenceContext(unitName = "NahuatPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogoPlanillaFacade() {
        super(CatalogoPlanilla.class);
    }
    
}
