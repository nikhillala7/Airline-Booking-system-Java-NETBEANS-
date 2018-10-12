<%-- 
    Document   : book_ticket
    Created on : Mar 16, 2017, 10:21:17 AM
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
        <form action="book_ticket.jsp">
           <fieldset>
               <legend>BOOK TICKET</legend>
            Enter the name of the commuter <input type="text" name="cname"><br><br>
            Enter the name of the flight<input type="text" name="fname"><br><br>
            Enter the source of travel<input type="text" name="src"><br><br>
            Enter the destination of travel <input type="text" name="dest"><br><br>
            Choose your desired class <br><tr><input type="radio" name="class" value="Economy">ECONOMY
            <input type="radio" name="class" value="Business"> BUSINESS<br><br>
            Enter the number of tickets <input type="number" name="eno"><br>
            
            <input type="submit" name="state" value="bookTicket"/>
            <br>
            </fieldset>
            </form>
        <a href="index.html">Home</a>

    <%-- start web service invocation --%><hr/>
    <%
    try {
	airline.Airline_Service service = new airline.Airline_Service();
	airline.Airline port = service.getAirlinePort();
	 // TODO initialize WS operation arguments here
	String a=request.getParameter("cname");
            String b=request.getParameter("fname");
            String c=request.getParameter("src");
            String d=request.getParameter("dest");
            String s=request.getParameter("class");
            int j=0,k=0,i=0;
            if(s.equals("Economy"))
            {
                 i=0;
            }
            else
                i=1;
            if(b.equals("Emirates"))
                j=0;
            k=Integer.parseInt(request.getParameter("eno"));
            port.bookTicket(a, j, c, d, i, k);
            out.println(a +" have booked "+k+" tickets of fight "+b +" bearing "+s+" class");
	// TODO process result here
	
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
