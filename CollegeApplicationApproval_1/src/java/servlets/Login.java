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
public class Login extends HttpServlet {


   public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
    {
        String name=request.getParameter("id");
        String password = request.getParameter("pass");
        PrintWriter out=response.getWriter();

        try {
            LoginDAO l = new LoginDAO();
            String result = l.checkInfo(name, password);
            if (result.equals("Login successfull"))
            {
                RequestDispatcher rd=request.getRequestDispatcher("inside.html");  
                rd.forward(request,response);
            }
            else
            {
                RequestDispatcher rd=request.getRequestDispatcher("newhtml.html");  
                rd.include(request,response);  
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
