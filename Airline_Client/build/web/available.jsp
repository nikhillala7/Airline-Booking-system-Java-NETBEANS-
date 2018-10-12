<%-- 
    Document   : available.jsp
    Created on : Mar 16, 2017, 12:35:32 PM
    Author     : kamallala
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="available.jsp">
                 <fieldset>
               <legend>BOOK TICKET</legend>
                AVAIL
                         <input type="submit" name="state" value="AVAILABLE TICKETS"/> 
                 </fieldset>
            </form>        <a href="index.html">Home</a>

   
    <%-- start web service invocation --%><hr/>
    <%
    try {
	airline.Airline_Service service = new airline.Airline_Service();
	airline.Airline port = service.getAirlinePort();
	// TODO process result here
	java.lang.String result = port.availableTicket();
	out.println(result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
