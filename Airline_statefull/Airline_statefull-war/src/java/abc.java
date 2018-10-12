/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Airline_statefull.Airline_statefullLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kamallala
 */
@WebServlet(urlPatterns = {"/abc"})
public class abc extends HttpServlet {
    Airline_statefullLocal airline_statefull = lookupAirline_statefullLocal();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet abc</title>");            
            out.println("</head>");
            out.println("<body>");
           // out.println("<h1>Servlet abc at " + request.getContextPath() + "</h1>");
            String sq=request.getParameter("state");
            if(sq.equals("bookTicket"))
            {
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
            airline_statefull.bookTicket(a, j, c, d, i, k);
            out.println(a +" have booked "+k+" tickets of fight "+b +" bearing "+s+" class");
            }
            
            if(sq.equals("cancelTicket"))
            {
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
                j=1;
            k=Integer.parseInt(request.getParameter("eno"));
            airline_statefull.cancelTicket(a, j, c, d, i, k);
            out.println("Tickets under the name"+a +"with "+k+" tickets of fight "+b +" bearing "+s+" class have been sucessfully  cancelled");
            
            }
            
            if(sq.equals("CUSTOMER HISTORY"))
            {
                out.println("Your booking history is "+airline_statefull.customerHistory());
            }
            if(sq.equals("AVAILABLE TICKETS"))
            {
                out.println(""+airline_statefull.availableTicket()); 
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private Airline_statefullLocal lookupAirline_statefullLocal() {
        try {
            Context c = new InitialContext();
            return (Airline_statefullLocal) c.lookup("java:global/Airline_statefull/Airline_statefull-ejb/Airline_statefull!Airline_statefull.Airline_statefullLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
