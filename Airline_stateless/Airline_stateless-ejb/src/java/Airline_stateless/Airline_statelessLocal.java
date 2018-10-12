/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline_stateless;

import javax.ejb.Local;

/**
 *
 * @author kamallala
 */
@Local
public interface Airline_statelessLocal {
    
    public String bookTicket(String a,int b,String c,String d,int e,int t) ;
public String cancelTicket(String a,int b,String c,String d,int e,int t);
public String availableTicket()   ;
public String customerHistory();
    
}
