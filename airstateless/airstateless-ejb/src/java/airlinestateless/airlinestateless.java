/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinestateless;

import java.rmi.RemoteException;
import javax.ejb.Stateless;

/**
 *
 * @author kamallala
 */
@Stateless
public class airlinestateless implements airlinestatelessLocal {
        int avail=100;
    	String from[] = new String[100];
	String to[] = new String[100];
	String name[] = new String[100];
	int qty[] = new int[100];
	public String book(String from1,String to1,int qty1,String name1,int id, int j) throws RemoteException
	{
		from[id]=from1;
		to[id]=to1;
		qty[id]=qty1;
		name[id]=name1;
		String ret="Booking successfull with id "+id;
                avail=avail-qty1;
		return ret;
	}
		public String cancel(int id){
		if (qty[id]<=0)
			{
			String ret="Cannot cancel!";
				return ret;
			}
		else{
			from[id]=null;  
		to[id]=null;
		qty[id]=0;
		name[id]=null;
		}
		String msg="Booking successfully cancelled";
		return msg;
	}

	public String display(int id){
		String dis="Booked"+qty[id]+"tickets from"+from[id]+"to"+to[id]+"by "+name[id];
		return dis;
	}
        public int available(){
            return avail;
        }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public String book(String from, String to, int qty, String name, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
