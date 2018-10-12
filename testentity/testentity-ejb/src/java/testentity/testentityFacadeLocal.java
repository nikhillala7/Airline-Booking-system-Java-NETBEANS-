/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testentity;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kamallala
 */
@Local
public interface testentityFacadeLocal {

    void create(testentity testentity);

    void edit(testentity testentity);

    void remove(testentity testentity);

    testentity find(Object id);

    List<testentity> findAll();

    List<testentity> findRange(int[] range);

    int count();
    
}
