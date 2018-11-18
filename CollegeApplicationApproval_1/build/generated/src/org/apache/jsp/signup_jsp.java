package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  font-family: Arial;\n");
      out.write("  font-size: 14px;\n");
      out.write("   background-color: #f1f1f1;\n");
      out.write("  overflow:hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row {\n");
      out.write("  display: -ms-flexbox; /* IE10 */\n");
      out.write("  display: flex;\n");
      out.write("  -ms-flex-wrap: wrap; /* IE10 */\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("  margin: 0px -16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25 {\n");
      out.write("  -ms-flex: 25%; /* IE10 */\n");
      out.write("  flex: 25%;\n");
      out.write("}\n");
      out.write(".col-33 {\n");
      out.write("  -ms-flex: 25%; /* IE10 */\n");
      out.write("  flex: 25%;\n");
      out.write("}\n");
      out.write(".col-50 {\n");
      out.write("  -ms-flex: 50%; /* IE10 */\n");
      out.write("  flex: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("  -ms-flex: 75%; /* IE10 */\n");
      out.write("  flex: 75%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25,\n");
      out.write(".col-33,\n");
      out.write(".col-50 \n");
      out.write(" {\n");
      out.write("  padding: 0 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 5px 20px 15px 20px;\n");
      out.write("  border: 1px solid lightgrey;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("input[type=password] {\n");
      out.write("  width: 100%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 8px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text] {\n");
      out.write("  width: 100%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 8px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("input[type=submit] {\n");
      out.write("  width: 10%;\n");
      out.write("}\n");
      out.write("label {\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 12px;\n");
      out.write("  margin: 10px 0;\n");
      out.write("  border: none;\n");
      out.write("  width: 100%;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("  background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  color: #2196F3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("hr {\n");
      out.write("  border: 1px solid lightgrey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.price {\n");
      out.write("  float: right;\n");
      out.write("  color: grey;\n");
      out.write("}\n");
      out.write(".header {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    border: 1px solid #e7e7e7;\n");
      out.write("    background-color:  #ec2e2e;\n");
      out.write("    font-size:40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".info {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    width: 16%;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("    position: fixed;\n");
      out.write("    height: 100%;\n");
      out.write("    overflow: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: #000;\n");
      out.write("    padding: 8px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a.active {\n");
      out.write("    background-color: #555;\n");
      out.write("    color: white;\n");
      out.write("    text-decoration: none;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("    background-color: #555;\n");
      out.write("    color: white;\n");
      out.write("    text-decoration: none;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("  .vl {\n");
      out.write("    border-left: 1px solid black;\n");
      out.write("    height: 100%;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("}\n");
      out.write("@media (max-width: 800px) {\n");
      out.write("  .row {\n");
      out.write("    flex-direction: column-reverse;\n");
      out.write("  }\n");
      out.write("  .col-25 {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("iframe{\n");
      out.write("    border:none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"row \">\n");
      out.write("<nav class=\"navbar navbar-fixed-top\">\n");
      out.write("<ul class=\"info\">\n");
      out.write("     <li><a class=\"active\" href=\"#home\"><img src=\"cu_logo.png\" style=\"width:175px;\"></a></li>\n");
      out.write(" <li><a href=\"signup.html\">ADD USER</a>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <li><a href=\"delete.html\" target=\"iframe\">DELETE USER</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <li><a href=\"changepassword.html\"  target=\"iframe\">CHANGE PASSWORD</a></li>\n");
      out.write("  <li><a href=\"#\"  target=\"iframe\"> <span class=\"glyphicon glyphicon-log-out\"></span> Log Out</a></li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("            <div class=\"col-sm-offset-3 col-sm-8\" style=\"padding:0; float:right; background-color: #f1f1f1;\">\n");
      out.write("                <iframe src=\"register.html\" width=\"100%\" height=\"700\" name=\"iframe\"></iframe>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("      <script>\n");
      out.write("          function myFunction()\n");
      out.write("          {\n");
      out.write("              var x=document.getElementById(pass).value;\n");
      out.write("               var y=document.getElementById(re-pass).value;\n");
      out.write("               if(x!=y)\n");
      out.write("               {\n");
      out.write("                   alert(\"PASSWORDS DONOT MATCH\");\n");
      out.write("               }\n");
      out.write("          }\n");
      out.write("          </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
