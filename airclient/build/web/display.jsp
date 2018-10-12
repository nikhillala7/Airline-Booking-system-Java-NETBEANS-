<%-- 
    Document   : display
    Created on : Apr 22, 2017, 12:15:05 AM
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
        <form action="display">
            DISPLAY
            <input type="submit" value="disp" />
        </form>
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	air.Air_Service service = new air.Air_Service();
	air.Air port = service.getAirPort();
	 // TODO initialize WS operation arguments here
	int id = 0;
	// TODO process result here
	java.lang.String result = port.display(id);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
