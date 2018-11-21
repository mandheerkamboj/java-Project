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
public class application extends HttpServlet {
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
         res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String id = req.getParameter("id");
        String fname=req.getParameter("firstname");
        String lname=req.getParameter("lastname");
        String from = req.getParameter("from");
        String to = req.getParameter("to");
        String reason = req.getParameter("reason");
        RecordCheck rs = new RecordCheck();
        int ad;
        try {
             ad=rs.insertapp(id, fname, lname, from,to,reason);
             RequestDispatcher rd=req.getRequestDispatcher("Gatepass.jsp");  
             rd.forward(req,res);          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
