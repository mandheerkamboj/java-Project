package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <title>Chitkara University</title>\n");
      out.write("  <style>\n");
      out.write("      select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 7px 10px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("      </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"col-sm-offset-4 col-sm-4 \" style=\"padding-top:5%;\"> \n");
      out.write("        <div>\n");
      out.write("            <center> <img src=\"Chitkara Logo.jpeg\"  width=\"200\" height=\"150\" ></center>\n");
      out.write("    </div>\n");
      out.write("        <div style=\"padding:40px 50px;\">\n");
      out.write("            <form method=\"post\" action=\"Login\" autocomplete=\"off\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"usrname\"><span class=\"glyphicon glyphicon-user\"></span> Username</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"usrname\" name =\"id\" pattern=\".{10}\" placeholder=\"Enter username\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"psw\"><span class=\"glyphicon glyphicon-eye-open\"></span> Password</label>\n");
      out.write("              <input type=\"password\" class=\"form-control\" id=\"myInput\" name=\"pass\" placeholder=\"Enter password\"><input type=\"checkbox\" onclick=\"myFunction()\">Show Password\n");
      out.write("            </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"usr\"><span class=\"glyphicon glyphicon-user\"></span> User</label>\n");
      out.write("             <select id=\"usr\" name=\"usr\">\n");
      out.write("             <option value=\"Student\">Student</option>\n");
      out.write("             <option value=\"Teacher\">Teacher</option>\n");
      out.write("             <option value=\"HOD\">HOD</option>\n");
      out.write("             <option value=\"Admin\">Admin</option>\n");
      out.write("                </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              <center> <button type=\"submit\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-off\"></span> Login</button></center>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-footer\">\n");
      out.write("           \n");
      out.write("            <p>Forgot<a href=\"forgotPassword.jsp\" > Password?</li></a></p>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("    function myFunction() {\n");
      out.write("    var x = document.getElementById(\"myInput\");\n");
      out.write("    if (x.type === \"password\") {\n");
      out.write("        x.type = \"text\";\n");
      out.write("    } else {\n");
      out.write("        x.type = \"password\";\n");
      out.write("    }\n");
      out.write("}</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
