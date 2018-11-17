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

/**
 *
 * @author dell
 */
public class delete extends HttpServlet {
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
         res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String id = req.getParameter("id");
        String fname=req.getParameter("firstname");
        String user=req.getParameter("user");
        RecordCheck rs = new RecordCheck();
        String ad;
        try {
            
             ad=rs.delete(id,fname,user);
             RequestDispatcher rd=req.getRequestDispatcher("Delete.html");  
             rd.forward(req,res);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
