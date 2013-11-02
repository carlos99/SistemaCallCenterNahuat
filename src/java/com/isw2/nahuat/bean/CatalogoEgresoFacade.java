/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.bean;

import com.isw2.nahuat.model.CatalogoEgreso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author carlos
 */
@Stateless
public class CatalogoEgresoFacade extends AbstractFacade<CatalogoEgreso> {
    @PersistenceContext(unitName = "NahuatPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogoEgresoFacade() {
        super(CatalogoEgreso.class);
    }
    
}
