/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw2.nahuat.session;

import com.isw2.nahuat.model.CatalogoDocumento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author karlos
 */
@Stateless
public class CatalogoDocumentoFacade extends AbstractFacade<CatalogoDocumento> {
    @PersistenceContext(unitName = "NahuatPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogoDocumentoFacade() {
        super(CatalogoDocumento.class);
    }
    
}
