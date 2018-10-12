/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testentity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kamallala
 */
@Stateless
public class testentityFacade extends AbstractFacade<testentity> implements testentityFacadeLocal {
    @PersistenceContext(unitName = "testentity-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public testentityFacade() {
        super(testentity.class);
    }
    
}
