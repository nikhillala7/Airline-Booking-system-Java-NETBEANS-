/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Inventory.InventoryFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lab902
 */
public class serv extends HttpServlet {

    @EJB
    private InventoryFacadeLocal ob;
    Inventory.Inventory ob1=new Inventory.Inventory();
   
    
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
            out.println("<title>Servlet serv</title>");            
            out.println("</head>");
            out.println("<body>");
            String s=request.getParameter("state");
            if(s.equals("add"))
            {
                String pname=request.getParameter("product_name");
            Integer qty=Integer.parseInt(request.getParameter("quantity"));
            Integer prize=Integer.parseInt(request.getParameter("prize"));
            Integer id=Integer.parseInt(request.getParameter("id"));
            
            ob1.setId(id);
            ob1.setProduct_name(pname);
            ob1.setPrize(prize);
            ob1.setQuantity(qty);
            ob.create(ob1);
            out.println("Succesfully added");
            }
            if(s.equals("remove"))
            {
                Integer id=Integer.parseInt(request.getParameter("id"));
                ob1.setId(id);
                ob.remove(ob1);
                out.println("Removed");
            }
            
            if(s.equals("edit"))
            {
                String pname=request.getParameter("product_name");
            Integer qty=Integer.parseInt(request.getParameter("quantity"));
            Integer prize=Integer.parseInt(request.getParameter("prize"));
            Integer id=Integer.parseInt(request.getParameter("id"));
            ob1.setId(id);
            ob1.setProduct_name(pname);
            ob1.setPrize(prize);
            ob1.setQuantity(qty);
            ob.edit(ob1);
            out.println("Updated");
            }
            
            out.println("<h1>Servlet serv at " + request.getContextPath() + "</h1>");
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

}
