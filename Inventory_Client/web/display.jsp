<%-- 
    Document   : display
    Created on : 9 Mar, 2017, 10:53:14 PM
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
         <form name="purchase_item" action="display.jsp">
           Enter Product Name <input type="text" name="product_name" value="">
            
           <input type="submit" value="Display" name="state" /></form>
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
	// TODO process result here
        if((item.charAt(0)!='A')&&item.charAt(0)!='a'&&item.charAt(0)!='b'&&item.charAt(0)!='B'&&item.charAt(0)!='C'&&item.charAt(0)!='c'&&item.charAt(0)!='d'&&item.charAt(0)!='D'&&item.charAt(0)!='E'&&item.charAt(0)!='e')
        {
            out.println("Please enter a valid product");
        }else{
        
	int result = port.display(item);
	out.println("Result = "+result);
    }} catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
