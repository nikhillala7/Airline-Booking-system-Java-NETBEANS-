<%-- 
    Document   : book
    Created on : Apr 22, 2017, 12:09:19 AM
    Author     : kamallala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form action="book.jsp">
            enter tha name<input type="name" name="name" value="" />
            enter tha source<input type="src" name="name" value="" />
            enter tha destination<input type="dst" name="name" value="" />
            enter tha id<input type="text" name="id" value="" />
            enter tha quantity<input type="text" name="qty" value="" />
            <input type="submit" value="submit" />
               
        </form>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	air.Air_Service service = new air.Air_Service();
	air.Air port = service.getAirPort();
	 // TODO initialize WS operation arguments here
	java.lang.String to1 = "";
	java.lang.String from1 = "";
	int id = 0;
	java.lang.String name1 = "";
	int qty1 = 0;
	// TODO process result here
	java.lang.String result = port.book(to1, from1, id, name1, qty1);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>

