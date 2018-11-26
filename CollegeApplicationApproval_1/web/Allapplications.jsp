<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Chitkara University</title>
    </head>
    <body>
            <%  
        Connection conn = null;
        Statement stmt = null;
       try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
        stmt = con.createStatement();
        String sql = "SELECT * from application" ;
       ResultSet rs = stmt.executeQuery(sql);
       %>

      <table border = "1" width = "100%">
         <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Status</th>
            <th>Action</th>
           
         </tr>
         <%
          while(rs.next()){
        %> 
            <tr> 
               <td><%=rs.getString("id")%></td>
               <td><%=rs.getString("firstName")%></td>
               <td><%=rs.getString("lastName")%></td>
               <td><%=rs.getString("status")%></td>
              
               <td><a href="viewApplication.jsp?name=<%=rs.getString("id")%>">View Application</a></td>
              
            </tr>
              <%
    }%>
      </table>
<%
}
catch(Exception e)
{
    out.print(e);
}
%>
    </body>
</html>
