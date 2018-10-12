/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Akash
 */
@Local
public interface BankEntityFacadeLocal {

    void create(BankEntity bankEntity);

    void edit(BankEntity bankEntity);

    void remove(BankEntity bankEntity);

    BankEntity find(Object id);

    List<BankEntity> findAll();

    List<BankEntity> findRange(int[] range);

    int count();
    
}
