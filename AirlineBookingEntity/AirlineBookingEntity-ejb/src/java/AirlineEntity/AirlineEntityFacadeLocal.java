/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlineEntity;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lab902
 */
@Local
public interface AirlineEntityFacadeLocal {

    void create(AirlineEntity airlineEntity);

    void edit(AirlineEntity airlineEntity);

    void remove(AirlineEntity airlineEntity);

    AirlineEntity find(Object id);

    List<AirlineEntity> findAll();

    List<AirlineEntity> findRange(int[] range);

    int count();
    
}
