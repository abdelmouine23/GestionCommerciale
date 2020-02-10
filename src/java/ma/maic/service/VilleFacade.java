/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.maic.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ma.maic.bean.Ville;

/**
 *
 * @author hp
 */
@Stateless
public class VilleFacade extends AbstractFacade<Ville> {

    @PersistenceContext(unitName = "gestioncommerciale-v3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VilleFacade() {
        super(Ville.class);
    }
    
    public List<Ville> findByPaysLibelle(String libelle) {
        return em.createQuery("SELECT v FROM Ville v WHERE v.pays.libelle = '"+libelle+"'").getResultList();
    
    }
}
