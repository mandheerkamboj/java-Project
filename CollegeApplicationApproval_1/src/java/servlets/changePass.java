/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class changePass extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out=response.getWriter();
            String id=request.getParameter("id");
            String sque=request.getParameter("sque");
            String ans = request.getParameter("ans");
            request.setAttribute("id", id);
            
             RequestDispatcher rd = null;
         
             RecordCheck rs = new RecordCheck();
                 String ad;
            try {
           
             ad=rs.forpass(id,sque,ans);
             if (ad.equals("done")){
              rd=request.getRequestDispatcher("almostthere.jsp");  
             rd.forward(request,response);
            }
             else{
             out.print("Wrong answer!");    
             }
            }
             catch (ClassNotFoundException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

}
