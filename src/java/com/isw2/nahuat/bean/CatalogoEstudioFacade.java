/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.bean;

import com.isw2.nahuat.model.CatalogoEstudio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author carlos
 */
@Stateless
public class CatalogoEstudioFacade extends AbstractFacade<CatalogoEstudio> {
    @PersistenceContext(unitName = "NahuatPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogoEstudioFacade() {
        super(CatalogoEstudio.class);
    }
    
}
