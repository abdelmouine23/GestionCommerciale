/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.maic.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ma.maic.bean.PaiementDemande;

/**
 *
 * @author hp
 */
@Stateless
public class PaiementDemandeFacade extends AbstractFacade<PaiementDemande> {

    @PersistenceContext(unitName = "gestioncommerciale-v3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaiementDemandeFacade() {
        super(PaiementDemande.class);
    }
    
}
