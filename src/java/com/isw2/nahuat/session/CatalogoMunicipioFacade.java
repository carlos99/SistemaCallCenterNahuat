/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.session;

import com.isw2.nahuat.model.CatalogoMunicipio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author karlos
 */
@Stateless
public class CatalogoMunicipioFacade extends AbstractFacade<CatalogoMunicipio> {
    @PersistenceContext(unitName = "NahuatPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogoMunicipioFacade() {
        super(CatalogoMunicipio.class);
    }
    
}
