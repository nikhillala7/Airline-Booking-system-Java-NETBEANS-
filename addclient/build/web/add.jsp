<%-- 
    Document   : add
    Created on : Apr 21, 2017, 6:43:27 PM
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
        <form action="add.jsp">
            Enter a<input type="text" name="a" value="" />
            b<input type="text" name="b" value="" />
            <input type="submit" value="" />
        </form>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	addserv.Addserv_Service service = new addserv.Addserv_Service();
	addserv.Addserv port = service.getAddservPort();
	 // TODO initialize WS operation arguments here
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));
	// TODO process result here
	java.lang.String result = port.add(a, b);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
