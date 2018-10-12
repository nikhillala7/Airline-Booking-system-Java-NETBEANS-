/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akash
 */
public class BankServlet extends HttpServlet {

    @EJB
    private BankEntityFacadeLocal be;

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
        
            BankEntity bb = new BankEntity();
            List<BankEntity> p = be.findAll(); 
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BankServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String s = request.getParameter("state");
           
            int i;
            if(s.equals("AddDel")){
                if((request.getParameter("ad")).equals("add")){
                    int acc = Integer.parseInt(request.getParameter("acca"));
                    int amt = Integer.parseInt(request.getParameter("amta"));
                    bb.setAcc(acc);
                    bb.setDep(0);
                    bb.setWit(0);
                    bb.setBal(amt);
                    be.create(bb);
                    out.println("Account Successfully Added!!!");
                }
                else{
                    int acc = Integer.parseInt(request.getParameter("acca"));
                    for(i=0;i<p.size();i++){
                        if(acc==p.get(i).getAcc()){
                           be.remove(p.get(i)); 
                        }
                    }
                    
                    out.println("Account Successfully Deleted!!!");
                }
                out.println("<br><br><button onClick=\"window.location.href='index.html'\">Main Menu</button>");
           }
           if(s.equals("Change")){
                int oacc = Integer.parseInt(request.getParameter("oacc"));
                int nacc = Integer.parseInt(request.getParameter("nacc"));
                for(i=0;i<p.size();i++){
                    if(oacc==(p.get(i).getAcc())){
                        bb.setAcc(nacc);
                        bb.setDep(p.get(i).getDep());
                        bb.setWit(p.get(i).getWit());
                        bb.setBal(p.get(i).getBal());
                        be.edit(bb);
                        be.remove(p.get(i));
                    }
                }
                out.println("Acc No. Successfully Changed!");
                out.println("<br><br><button onClick=\"window.location.href='index.html'\">Main Menu</button>");
           }
           if(s.equals("DepWith")){
               if((request.getParameter("dw")).equals("d")){
                int acc = Integer.parseInt(request.getParameter("accd"));
                int amt = Integer.parseInt(request.getParameter("amtd"));
                
                for(i=0;i<p.size();i++){
                    if(acc==p.get(i).getAcc()){
                       bb.setBal((p.get(i).getBal())+amt); 
                    }
                }
                bb.setAcc(acc);
                bb.setDep(amt);
                bb.setWit(0);
                be.create(bb);
                out.println("Successfully Deposited Rs. "+amt+" in Acc No.:"+acc);
               }
                else
               {
                    int acc = Integer.parseInt(request.getParameter("accd"));
                    int amt = Integer.parseInt(request.getParameter("amtd"));
            
                        for(i=0;i<p.size();i++){
                            if(acc==p.get(i).getAcc()){
                               bb.setBal((p.get(i).getBal())-amt);
                            }
                        }
                        bb.setAcc(acc);
                        bb.setDep(0);
                        bb.setWit(amt);
                        be.create(bb);
                        out.println("Successfully Withdrawn Rs. "+amt+" from Acc No.:"+acc);
               }
               out.println("<br><br><button onClick=\"window.location.href='index.html'\">Main Menu</button>");
           }
           if(s.equals("View Balance")){
              int amt=0;
              int acc = Integer.parseInt(request.getParameter("accvb"));
              for(i=p.size()-1;i>=0;i--){
                  if(acc==p.get(i).getAcc()){
                      amt = p.get(i).getBal();
                      break;
                  }
              }
              out.println("Balance in Rs. Acc No.:"+acc+" : "+amt);
              out.println("<br><br><button onClick=\"window.location.href='index.html'\">Main Menu</button>");
           }
           if(s.equals("View History")){
                int acc = Integer.parseInt(request.getParameter("acct"));
                out.println("<br><button onClick=\"window.location.href='index.html'\">Main Menu</button><br><br>");
                out.println("<table border=1><tr><th>Acc. No.</th><th>Deposit</th><th>Withdraw</th><th>Balanace</th></tr>");
                for(i=0;i<p.size();i++){
                    out.println("<tr>");
                    if(acc==p.get(i).getAcc()){
                        int d = p.get(i).getDep();
                        int w = p.get(i).getWit();
                        int b = p.get(i).getBal();
                        out.println("<td>"+acc+"</td><td>"+d+"</td><td>"+w+"</td><td>"+b+"</td>");
                    }
                    out.println("</tr>");
                }
                    
 
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

    private Object sum(int acc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
