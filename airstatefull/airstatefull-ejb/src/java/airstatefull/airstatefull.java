/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airstatefull;

import javax.ejb.Stateful;

/**
 *
 * @author kamallala
 */
@Stateful
public class airstatefull implements airstatefullLocal {
    AirlineClient ab[]=new AirlineClient[30];
	int i,j;
	int x=20;
	int z=-1;
	int flight[][]={{20,20},{20,20}};





	public void bookTicket(String a,String b,String c,String d,String e,int t) throws RemoteException
	{

		if(e=="Economy" || e=="economy")
		{
			if(b=="Emirates" || b=="emirates")
			{
				flight[0][0]-=t;
			}
			else
			{
				flight[1][0]-=t;
			}
		}
		if(e=="Business" || e=="business")
		{
			if(b=="Emirates" || b=="emirates")
			{
				flight[0][1]-=t;
			}
			else
			{
				flight[1][1]-=t;
			}
		}
		if(flight[0][0]<0 || flight[0][1]<0 || flight[1][0]<0 || flight[1][1]<0)
		{
			System.out.println("Tickets are not available");
		}
		else
		{
			System.out.println("Your tickets have been booked");
			z=z+1;
			ab[z]=new AirlineClient();
			ab[z].fillValues();
			System.out.println("The ticket details are as follows:");
			ab[z].showValues();

		}
	}

	public void cancelTicket(String a,String b,String c,String d,String e,int t) throws RemoteException
	{

		if(e=="Economy" || e=="economy")
		{
			if(b=="Emirates" || b=="emirates")
			{
				flight[0][0]+=t;
			}
			else
			{
				flight[1][0]+=t;
			}
		}
		if(e=="Business" || e=="business")
		{
			if(b=="Emirates" || b=="emirates")
			{
				flight[0][1]+=t;
			}
			else
			{
				flight[1][1]+=t;
			}
		}
		if(flight[0][0]<=20 || flight[0][1]<=20 || flight[1][0]<=20 || flight[1][1]<=20)
		{
			System.out.println("Tickets have been cancelled");
			z=z+1;
			ab[z]=new AirlineClient();
			ab[z].fillValues();
			System.out.println("The cancelled ticket details are as follows:");
			ab[z].showValues();
		}
		else
		{
			System.out.println("Your tickets cannot be cancelled");
		}
	}

	public void availableTicket()
	{
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				if(i==0 && j==0 )
				System.out.println("Tickets available for Economy class of Emirates flight is: "+flight[i][j]+"\n");
				if(i==0 && j==1 )
				System.out.println("Tickets available for Business class of Emirates flight is: "+flight[i][j]+"\n");
				if(i==1 && j==0 )
				System.out.println("Tickets available for Economy class of Etihad flight is: "+flight[i][j]+"\n");
				if(i==1 && j==1 )
				System.out.println("Tickets available for Business class of Etihad flight is: "+flight[i][j]+"\n");
			}
		}
	}

	public void customerHistory()
	{

		System.out.println("The history of all the customers is as follows:\n");
		for(i=0;i<=z;i++)
		{
			System.out.println(ab[i]);

		}
	}

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
