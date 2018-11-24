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
              <sql:setDataSource var = "data" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost/user"
         user = "root"  password = ""/>
 
      <sql:query dataSource = "${data}" var = "result">
         SELECT * from application;
      </sql:query>

      <table border = "1" width = "100%">
         <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Status</th>
            <th>Action</th>
           
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
                 <c:set var = "Id" value = "${row.id}"/>
               <td><c:out value = "${Id}"/></td>
               <td><c:out value = "${row.firstName}"/></td>
               <td><c:out value = "${row.lastName}"/></td>
               <td><c:out value = "${row.status}"/></td>
              
               <td><a href="viewApplication.jsp?name=${Id}">View Application</a></td>
              
            </tr>
         </c:forEach>
      </table>
    </body>
</html>
