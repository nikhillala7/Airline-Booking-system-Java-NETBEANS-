/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Akash
 */
@Stateless
public class BankEntityFacade extends AbstractFacade<BankEntity> implements BankEntityFacadeLocal {

    @PersistenceContext(unitName = "BankEntity-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BankEntityFacade() {
        super(BankEntity.class);
    }
    
}
