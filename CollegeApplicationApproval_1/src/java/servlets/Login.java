/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
        String user = request.getParameter("usr");
        RequestDispatcher rd = null;
        PrintWriter out=response.getWriter();
        request.setAttribute("name", name);
        try {
            LoginDAO l = new LoginDAO();
            String result = l.checkInfo(name, password,user);
            out.print(result);
           if (result.equals("Admin"))
            {
                rd=request.getRequestDispatcher("signup.jsp");  
                rd.forward(request,response);
            }
            else if(result.equals("Student"))
            {
                rd=request.getRequestDispatcher("Student.jsp");  
                rd.forward(request,response);  
            }
            else if(result.equals("teacher"))
            {
                rd=request.getRequestDispatcher("teacher.jsp");  
                rd.forward(request,response);  
            }
             else if(result.equals("HOD"))
            {
                rd=request.getRequestDispatcher("HOD.jsp");  
                rd.forward(request,response);  
            }
            else{
                rd=request.getRequestDispatcher("newhtml.jsp");  
                rd.forward(request,response);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
