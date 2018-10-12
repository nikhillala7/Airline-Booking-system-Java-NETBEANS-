<%-- 
    Document   : cancel
    Created on : 9 Mar, 2017, 10:49:27 PM
    Author     : Mahendra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="purchase_item" action="cancel.jsp">
           Enter Product Name <input type="text" name="product_name" value="">
            Enter Quantity<input type="text" name="quantity" value="0">
            <input type="submit" value="cancel" name="state" />
        </form>
        <form action='index.html'>
            <fieldset>
                <legend>Return to the home page</legend>
              <button type="submit">Home</button>
            </fieldset>
        </form>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	inventory.Inventory_Service service = new inventory.Inventory_Service();
	inventory.Inventory port = service.getInventoryPort();
	 // TODO initialize WS operation arguments here
	java.lang.String item = request.getParameter("product_name");
	java.lang.String qty1 = request.getParameter("quantity");
	// TODO process result here
        if((item.charAt(0)!='A')&&item.charAt(0)!='a'&&item.charAt(0)!='b'&&item.charAt(0)!='B'&&item.charAt(0)!='C'&&item.charAt(0)!='c'&&item.charAt(0)!='d'&&item.charAt(0)!='D'&&item.charAt(0)!='E'&&item.charAt(0)!='e')
        {
            out.println("Please enter a valid product");
        }else{
        
        int abc[]=new int[5];
        int result=-1;
        if(item.charAt(0)=='A'&&item.charAt(0)=='a')
        {
        abc[0]=port.display(item);
        if((20-abc[0]<Integer.parseInt(qty1)))
            out.println("You cant cancel "+qty1+" items since you have ordered "+(20-abc[0])+" items");
        else
            result= port.cancel(item, qty1);
        }
        
        
        if(item.charAt(0)=='B'&&item.charAt(0)=='b')
        {
        abc[1]=port.display(item);
        if((20-abc[1]<Integer.parseInt(qty1)))
            out.println("You cant cancel "+qty1+" items since you have ordered "+(20-abc[1])+" items");
        else
            result= port.cancel(item, qty1);
        }
        
        if(item.charAt(0)=='C'&&item.charAt(0)=='c')
        {
        abc[2]=port.display(item);
        if((20-abc[2]<Integer.parseInt(qty1)))
            out.println("You cant cancel "+qty1+" items since you have ordered "+(20-abc[2])+" items");
        else
            result= port.cancel(item, qty1);
        }
        
        if(item.charAt(0)=='D'&&item.charAt(0)=='d')
        {
        abc[3]=port.display(item);
        if((20-abc[3]<Integer.parseInt(qty1)))
            out.println("You cant cancel "+qty1+" items since you have ordered "+(20-abc[3])+" items");
        else
            result= port.cancel(item, qty1);
        }
        
        if(item.charAt(0)=='E'&&item.charAt(0)=='e')
        {
        abc[4]=port.display(item);
        if((20-abc[4]<Integer.parseInt(qty1)))
            out.println("You cant cancel "+qty1+" items since you have ordered "+(20-abc[4])+" items");
        else
            result= port.cancel(item, qty1);
        }
        
         
        
        
        
        if(result!=-1)
        out.println("Succesfully canclled "+qty1+" items of product "+item);
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
