/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinestateless;

import java.rmi.RemoteException;
import javax.ejb.Local;

/**
 *
 * @author kamallala
 */
@Local
public interface airlinestatelessLocal {
    
    public String book(String from,String to,int qty,String name,int id);
	public String cancel(int id);
	public String display(int id);
        public int available();
    
}
