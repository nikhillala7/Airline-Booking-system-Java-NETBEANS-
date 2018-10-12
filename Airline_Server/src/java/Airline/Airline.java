/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airline;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kamallala
 */
@WebService(serviceName = "Airline")
public class Airline {
String name[]=new String[40];
	int flight[]=new int[40];
	String source[]=new String[40];
	String destination[]=new String[40];
	int classes[]=new int[40];
	int ticket[]=new int[40];
	int ec0[]=new int[30];
	int ec1[]=new int[30];
	int bus0[]=new int[30];
	int bus1[]=new int[30];
	int n=-1;
	int f=-1;
	int cl=-1;
	int s=-1;
	int de=-1;
	int ti=-1;
	int i,av1,av2,av3,av4,ko=0,lo=0,mo=0,go=0;
	int p=0,q=0,r=0,u=0,k=0,l=0,m=0,g=0,ka=0,la=0,ma=0,ga=0;
	String av="";
	String bo="";
	String ca="";
	String ch="";
        
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
    @WebMethod(operationName = "book_ticket")
    public String book_ticket(@WebParam(name = "a") String a, @WebParam(name = "b") int b, @WebParam(name = "c") String c, @WebParam(name = "d") String d, @WebParam(name = "e") int e, @WebParam(name = "t") int t) {
        //TODO write your implementation code here:
        bo="";
		if((ko+t)<=20 && b==0&&e==0)
		{
			//bo+="Tickets are not available";
			n+=1;
			//System.out.println(n);
			name[n]=a.toString();
			//System.out.println(name[n]);
			s+=1;
			//System.out.println(s);
			source[s]=c.toString();
			//System.out.println(source[s]);
			de+=1;
			//System.out.println(de);
			destination[de]=d.toString();
			//System.out.println(destination[de]);
			ti+=1;
			//System.out.println(ti);
			ticket[ti]=(int)t;
			//System.out.println(ticket[ti]);
		
			//if(b==0&&e==0)
			//{	
				f=f+1;
				cl=cl+1;
				//System.out.println(f);
				//System.out.println(cl);
				flight[f]=(int)b;
				classes[cl]=(int)e;
				for(i=k;i<(k+t);i++)
				{
					ec0[i]=1;
					ko+=1;
				}
				k+=t;
				//System.out.println(ko);
			//}
			bo+="Your tickets have been booked";
			bo+="The ticket details are as follows: ";
			//if(b==0&&e==0)
				bo+="Name="+a+"\t"+"Flight=Emirates"+"\t"+"Source="+c+"\t"+"Destination="+d+"\t"+"Class=economy"+"\t"+"No. of tickets="+(int)t;
		}
		else if((lo+t)<=20 && b==0&&e==1)
		{
			//bo+="Tickets are not available";
			n+=1;
			//System.out.println(n);
			name[n]=a.toString();
			//System.out.println(name[n]);
			s+=1;
			//System.out.println(s);
			source[s]=c.toString();
			//System.out.println(source[s]);
			de+=1;
			//System.out.println(de);
			destination[de]=d.toString();
			//System.out.println(destination[de]);
			ti+=1;
			//System.out.println(ti);
			ticket[ti]=(int)t;
			//System.out.println(ticket[ti]);
			
			//if(b==0&&e==1)
			//{	
				f=f+1;
				cl=cl+1;
				//System.out.println(f);
				//System.out.println(cl);
				flight[f]=(int)b;
				classes[cl]=(int)e;
				for(i=l;i<(l+t);i++)
				{
					bus0[i]=1;
					lo+=1;
				}
				l+=t;
				//System.out.println(lo);
			//}
			bo+="Your tickets have been booked";
			bo+="The ticket details are as follows: ";
			//if(b==0&&e==1)
				bo+="Name="+a+"\t"+"Flight=Emirates"+"\t"+"Source="+c+"\t"+"Destination="+d+"\t"+"Class=business"+"\t"+"No. of tickets="+(int)t;
		}
		else if((mo+t)<=20 && b==1&&e==0)
		{
			//bo+="Tickets are not available";
			n+=1;
			//System.out.println(n);
			name[n]=a.toString();
			//System.out.println(name[n]);
			s+=1;
			//System.out.println(s);
			source[s]=c.toString();
			//System.out.println(source[s]);
			de+=1;
			//System.out.println(de);
			destination[de]=d.toString();
			//System.out.println(destination[de]);
			ti+=1;
			//System.out.println(ti);
			ticket[ti]=(int)t;
			//System.out.println(ticket[ti]);
			//if(b==1&&e==0)
			//{	
				
				f=f+1;
				cl=cl+1;
				//System.out.println(f);
				//System.out.println(cl);
				flight[f]=(int)b;
				classes[cl]=(int)e;
				for(i=m;i<(m+t);i++)
				{
					ec1[i]=1;
					mo+=1;
				}
				m+=t;
				//System.out.println(mo);
			//}
			bo+="Your tickets have been booked";
			bo+="The ticket details are as follows: ";
			//if(b==1&&e==0)
				bo+="Name="+a+"\t"+"Flight=Etihad"+"\t"+"Source="+c+"\t"+"Destination="+d+"\t"+"Class=economy"+"\t"+"No. of tickets="+(int)t;
		}
		else if((go+t)<=20 && b==1&&e==1)
		{
			//bo+="Tickets are not available";
			n+=1;
			//System.out.println(n);
			name[n]=a.toString();
			//System.out.println(name[n]);
			s+=1;
			//System.out.println(s);
			source[s]=c.toString();
			//System.out.println(source[s]);
			de+=1;
			//System.out.println(de);
			destination[de]=d.toString();
			//System.out.println(destination[de]);
			ti+=1;
			//System.out.println(ti);
			ticket[ti]=(int)t;
			//System.out.println(ticket[ti]);
			//if(b==1&&e==1)
			//{	
				
				f=f+1;
				cl=cl+1;
				//System.out.println(f);
				//System.out.println(cl);
				flight[f]=(int)b;
				classes[cl]=(int)e;
				for(i=g;i<(g+t);i++)
				{
					bus1[i]=1;
					go+=1;
				}
				g+=t;
				//System.out.println(go);
			//}
			bo+="Your tickets have been booked";
			bo+="The ticket details are as follows: ";
			//if(b==1&&e==1)
				bo+="Name="+a+"\t"+"Flight=Etihad"+"\t"+"Source="+c+"\t"+"Destination="+d+"\t"+"Class=business"+"\t"+"No. of tickets="+(int)t;
		}
		else
		{
			bo+="Tickets are not available";
		}
		
		return bo;
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cancel_ticket")
    public String cancel_ticket(@WebParam(name = "a") String a, @WebParam(name = "b") int b, @WebParam(name = "c") String c, @WebParam(name = "d") String d, @WebParam(name = "e") int e, @WebParam(name = "t") int t) {
        //TODO write your implementation code here:
        ca="";
		/*if(ko==20||lo==20||mo==20||go==20)
		{
			ca+="Tickets cannot be cancelled";
		}
		else
		{*/
		if(b==0&&e==0)
		{	
			if(/*(ko+t)<=20 && */ko!=0 && t<=ko)
			{
				n+=1;
				//System.out.println(n);
				name[n]=a.toString();
				//System.out.println(name[n]);
				s+=1;
				//System.out.println(s);
				source[s]=c.toString();
				//System.out.println(source[s]);
				de+=1;
				//System.out.println(de);
				destination[de]=d.toString();
				//System.out.println(destination[de]);
				ti+=1;
				//System.out.println(ti);
				ticket[ti]=(int)t;
				//System.out.println(ticket[ti]);
			
				//if(b==0&&e==0)
				//{	
					f=f+1;
					cl=cl+1;
					//System.out.println(f);
					//System.out.println(cl);
					flight[f]=(int)b;
					classes[cl]=(int)e;
					for(i=ka;i<(ka+t);i++)
					{
						ec0[i]=0;
						ko-=1;
					}
					ka+=t;
					//System.out.println(ko);
				//}
				ca+="Your tickets have been cancelled";
				ca+="The ticket details are as follows: ";
				//if(b==0&&e==0)
					ca+="Name="+a+"\t"+"Flight=Emirates"+"\t"+"Source="+c+"\t"+"Destination="+d+"\t"+"Class=economy"+"\t"+"No. of tickets="+(int)t;
			}
			else
			{
				ca+="your tickets cannot be cancelled";
			}
		}
		if(b==0&&e==1)
		{
			if(/*(lo+t)<=20 && */lo!=0 && t<=lo)
			{
				n+=1;
				//System.out.println(n);
				name[n]=a.toString();
				//System.out.println(name[n]);
				s+=1;
				//System.out.println(s);
				source[s]=c.toString();
				//System.out.println(source[s]);
				de+=1;
				//System.out.println(de);
				destination[de]=d.toString();
				//System.out.println(destination[de]);
				ti+=1;
				//System.out.println(ti);
				ticket[ti]=(int)t;
				//System.out.println(ticket[ti]);
				
				//if(b==0&&e==1)
				//{	
					f=f+1;
					cl=cl+1;
					//System.out.println(f);
					//System.out.println(cl);
					flight[f]=(int)b;
					classes[cl]=(int)e;
					for(i=la;i<(la+t);i++)
					{
						bus0[i]=0;
						lo-=1;
					}
					la+=t;
					//System.out.println(lo);
				//}
				ca+="Your tickets have been cancelled";
				ca+="The ticket details are as follows: ";
				//if(b==0&&e==1)
					ca+="Name="+a+"\t"+"Flight=Emirates"+"\t"+"Source="+c+"\t"+"Destination="+d+"\t"+"Class=business"+"\t"+"No. of tickets="+(int)t;
			}
			else
			{
				ca+="your tickets cannot be cancelled";
			}
		}
		if(b==1&&e==0)
		{
			if(/*(mo+t)<=20 && */mo!=0 && t<=mo)
			{
				n+=1;
				//System.out.println(n);
				name[n]=a.toString();
				//System.out.println(name[n]);
				s+=1;
				//System.out.println(s);
				source[s]=c.toString();
				//System.out.println(source[s]);
				de+=1;
				//System.out.println(de);
				destination[de]=d.toString();
				//System.out.println(destination[de]);
				ti+=1;
				//System.out.println(ti);
				ticket[ti]=(int)t;
				//System.out.println(ticket[ti]);
				//if(b==1&&e==0)
				//{	
					
					f=f+1;
					cl=cl+1;
					//System.out.println(f);
					//System.out.println(cl);
					flight[f]=(int)b;
					classes[cl]=(int)e;
					for(i=ma;i<(ma+t);i++)
					{
						ec1[i]=0;
						mo-=1;
					}
					ma+=t;
					//System.out.println(mo);
				//}
				ca+="Your tickets have been cancelled";
				ca+="The ticket details are as follows: ";
				//if(b==1&&e==0)
					ca+="Name="+a+"\t"+"Flight=Etihad"+"\t"+"Source="+c+"\t"+"Destination="+d+"\t"+"Class=economy"+"\t"+"No. of tickets="+(int)t;
			}
			else
			{
				ca+="your tickets cannot be cancelled";
			}
		}
		if(b==1&&e==1)
		{
			if(/*(go+t)<=20 && */go!=0 && t<=go)
			{
				n+=1;
				//System.out.println(n);
				name[n]=a.toString();
				//System.out.println(name[n]);
				s+=1;
				//System.out.println(s);
				source[s]=c.toString();
				//System.out.println(source[s]);
				de+=1;
				//System.out.println(de);
				destination[de]=d.toString();
				//System.out.println(destination[de]);
				ti+=1;
				//System.out.println(ti);
				ticket[ti]=(int)t;
				//System.out.println(ticket[ti]);
				//if(b==1&&e==1)
				//{	
					
					f=f+1;
					cl=cl+1;
					//System.out.println(f);
					//System.out.println(cl);
					flight[f]=(int)b;
					classes[cl]=(int)e;
					for(i=ga;i<(ga+t);i++)
					{
						bus1[i]=0;
						go-=1;
					}
					ga+=t;
					//System.out.println(go);
				//}
				ca+="Your tickets have been cancelled";
				ca+="The ticket details are as follows: ";
				//if(b==1&&e==1)
					ca+="Name="+a+"\t"+"Flight=Etihad"+"\t"+"Source="+c+"\t"+"Destination="+d+"\t"+"Class=business"+"\t"+"No. of tickets="+(int)t;
			}
			else
			{
				ca+="your tickets cannot be cancelled";
			}
		}
		return ca;
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "available_ticket")
    public String available_ticket() {
        //TODO write your implementation code here:
        av="";
		for(i=0,p=0;i<ec0.length;i++)
		{
			if(ec0[i]==1)
			{
				p+=1;
			}
		}
		System.out.println(p);
		av1=20-p;
		av+="Tickets available for Economy class of Emirates flight is: "+av1+"\n";
		for(i=0,q=0;i<bus0.length;i++)
		{
			if(bus0[i]==1)
			{
				q+=1;
			}
		}
		System.out.println(q);
		av2=20-q;
		av+="Tickets available for Business class of Emirates flight is: "+av2+"\n";
		for(i=0,r=0;i<ec1.length;i++)
		{
			if(ec1[i]==1)
			{
				r+=1;
			}
		}
		System.out.println(r);
		av3=20-r;
		av+="Tickets available for Economy class of Etihad flight is: "+av3+"\n";
		for(i=0,u=0;i<bus1.length;i++)
		{
			if(bus1[i]==1)
			{
				u+=1;
			}
		}
		System.out.println(u);
		av4=20-u;
		av+="Tickets available for Business class of Etihad flight is: "+av4+"\n";
		return av;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "customer_history")
    public String customer_history() {
        //TODO write your implementation code here:
        ch="";
		for(int i=0;i<=n;i++)
		{
			if(flight[i]==0&&classes[i]==0)
			/*al.add(*/ch+="name= "+name[i]+" flight=Emirates"+" source="+source[i]+" destination="+destination[i]+" class=Economy"+" no. of tickets="+ticket[i]+"\n";// ALL ARE IN ONE CELL OF ARRAY LIST
			if(flight[i]==0&&classes[i]==1)
			/*al.add(*/ch+="name= "+name[i]+" flight=Emirates"+" source="+source[i]+" destination="+destination[i]+" class=Business"+" no. of tickets="+ticket[i]+"\n";// ALL ARE IN ONE CELL OF ARRAY LIST
			if(flight[i]==1&&classes[i]==0)
			/*al.add(*/ch+="name= "+name[i]+" flight=Etihad"+" source="+source[i]+" destination="+destination[i]+" class=Economy"+" no. of tickets="+ticket[i]+"\n";// ALL ARE IN ONE CELL OF ARRAY LIST
			if(flight[i]==1&&classes[i]==1)
			/*al.add(*/ch+="name= "+name[i]+" flight=Etihad"+" source="+source[i]+" destination="+destination[i]+" class=Business"+" no. of tickets="+ticket[i]+"\n";// ALL ARE IN ONE CELL OF ARRAY LIST
		}
		return ch;
    }
    
    
    
}
