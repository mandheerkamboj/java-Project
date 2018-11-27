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
      <div class="col-sm-offset-4 col-sm-4 " style="padding-top:5%;"> 
        <div>
            <center> <img src="Chitkara Logo.jpeg"  width="250" height="200" ></center>
    </div>
        
        <div style="padding:40px 50px;">
            <form action="password.jsp" method="post" autocomplete="off">
            <div class="form-group">
                <label for="usrname"><span class="glyphicon glyphicon-user"></span> Username</label>
              <input type="text" class="form-control" id="usrname" name ="id" pattern=".{10}" placeholder="Enter username">
          
            </div>
                <center> <button type="submit" class="btn btn-Success">Proceed</button></center>
          </form>
            
        </div>
    </div>
      


    </body>
</html>
