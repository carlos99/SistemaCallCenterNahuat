/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.bean;

import com.isw2.nahuat.model.CatalogoUbicacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author carlos
 */
@Stateless
public class CatalogoUbicacionFacade extends AbstractFacade<CatalogoUbicacion> {
    @PersistenceContext(unitName = "NahuatPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogoUbicacionFacade() {
        super(CatalogoUbicacion.class);
    }
    
}
