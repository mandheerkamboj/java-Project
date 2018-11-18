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
        String user = request.getParameter("usr");
        RequestDispatcher rd = null;
        PrintWriter out=response.getWriter();
        request.setAttribute("name", name);
        if (user.equals("Admin")){
        try {
            LoginDAO l = new LoginDAO();
            String result = l.checkInfo(name, password,user);
            out.print(result);
            if (result.equals("Login successfull"))
            {
                rd=request.getRequestDispatcher("signup.jsp");  
                rd.forward(request,response);
            }
            else if(result.equals("invalid login details"))
            {
                rd=request.getRequestDispatcher("newhtml.html");  
                rd.forward(request,response);  
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if (user.equals("Student")){
        try {
            LoginDAO l = new LoginDAO();
            String result = l.checkInfo(name, password,user);
            if (result.equals("Login successfull"))
            {
                rd=request.getRequestDispatcher("Student.html");  
                rd.forward(request,response);
            }
            else if (result.equals("invalid login details"))
            {
                /*RequestDispatcher rd=request.getRequestDispatcher("newhtml.html");  
                rd.forward(request,response);  */
               // out.print(result);
                response.sendRedirect("newhtml.html");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
}
