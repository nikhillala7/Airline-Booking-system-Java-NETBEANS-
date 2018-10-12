/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlineEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lab902
 */
@Stateless
public class AirlineEntityFacade extends AbstractFacade<AirlineEntity> implements AirlineEntityFacadeLocal {

    @PersistenceContext(unitName = "AirlineBookingEntity-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AirlineEntityFacade() {
        super(AirlineEntity.class);
    }
    
}
