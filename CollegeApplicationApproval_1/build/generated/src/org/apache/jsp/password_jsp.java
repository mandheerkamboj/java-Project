package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class password_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <title>Chitkara University</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            ");
   String id=request.getParameter("id");
            out.print(id);
        Connection conn = null;
        Statement stmt = null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
        stmt = con.createStatement();
        String sql = "SELECT * from students where id='"+id+"' " ;
        ResultSet rs = stmt.executeQuery(sql);
        request.setAttribute("id", id);
       
      out.write("\n");
      out.write("      <div class=\"col-sm-offset-4 col-sm-4 \" style=\"padding-top:5%;\"> \n");
      out.write("        <div>\n");
      out.write("            <center> <img src=\"Chitkara Logo.jpeg\"  width=\"250\" height=\"200\" ></center>\n");
      out.write("    </div>\n");
      out.write("        <div style=\"padding:40px 50px;\">\n");
      out.write("            <form method=\"post\"action=\"changePass\" autocomplete=\"off\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label for=\"ques\"><span class=\"glyphicon glyphicon-user\"></span>Security question</label>\n");
      out.write("              <select name=\"sque\">\n");
      out.write("        ");

          while(rs.next()){
        
      out.write("    \n");
      out.write("         <option value=\"sque1\">");
      out.print(rs.getString("sque1"));
      out.write("</option>\n");
      out.write("         <option value=\"sque2\">");
      out.print(rs.getString("sque2"));
      out.write("</option>\n");
      out.write("         <option value=\"sque3\">");
      out.print(rs.getString("sque3"));
      out.write("</option>\n");
      out.write("         ");

             }
      out.write("    \n");
      out.write("              </select>\n");
      out.write("              <label for=\"ans\">Answer</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"ans\" name =\"ans\" >\n");
      out.write("            </div>\n");
      out.write("                <center> <button type=\"submit\" class=\"btn btn-Success\">Done</button></center>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("\n");

}
catch(Exception e)
{
    out.print(e);
}

      out.write("\n");
      out.write("    </body>\n");
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
