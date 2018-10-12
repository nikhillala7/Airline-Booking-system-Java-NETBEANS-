/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kamallala
 */
@WebService(serviceName = "air")
public class air {
    
    int avail[]= new int [20];
	String from[] = new String[100];
	String to[] = new String[100];
	String name[] = new String[100];
	int qty[] = new int[100];
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "book")
    public String book(@WebParam(name = "to1") String to1, @WebParam(name = "from1") String from1, @WebParam(name = "id") int id, @WebParam(name = "name1") String name1, @WebParam(name = "qty1") int qty1) {
       from[id]=from1;
		to[id]=to1;
		qty[id]=qty1;
		name[id]=name1;
		String ret="Booking successfull with id "+id;
		return ret;
 //TODO write your implementation code here:
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cancel")
    public String cancel(@WebParam(name = "id") int id) {
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
  ////TODO write your implementation code here:
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "display")
    public String display(@WebParam(name = "id") int id) {
     
        String dis="Booked"+qty[id]+"tickets from"+from[id]+"to"+to[id]+"by "+name[id];
		return dis;
//TODO write your implementation code here:
    }

    /**
     * Web service operation
     */
    
    /**
     * Web service operation
     */
    
    /**
     * Web service operation
     */
  	}
		