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
    <style>
              select {
    width: 100%;
    padding: 7px 10px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-sizing: border-box;
}
    </style>
    </head>
    <body>
            <%  String id=(String)request.getParameter("id");
            
            session.setAttribute("id", id);
        Connection conn = null;
        Statement stmt = null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
        stmt = con.createStatement();
        String sql = "SELECT * from students where id='"+id+"' " ;
        ResultSet rs = stmt.executeQuery(sql);
        
          while(rs.next()){
        %>    
      
      <div class="col-sm-offset-4 col-sm-4 " style="padding-top:5%;"> 
        <div>
            <center> <img src="Chitkara Logo.jpeg"  width="250" height="200" ></center>
    </div>
        <div style="padding:40px 50px;">
            <form method="post"action="changePass" autocomplete="off">
                  <div class="form-group">
             <label for="usrname"><span class="glyphicon glyphicon-user"></span> Username</label>
             <input type="text" class="form-control" id="usrname" name ="id" pattern=".{10}" value="<%=rs.getString("id")%>" placeholder="Enter username" readonly>
            </div>
            <div class="form-group">
              <label for="ques"><span class="glyphicon glyphicon-user"></span>Security question</label>
              <select name="sque">
        
         <option value="sque1"><%=rs.getString("sque1")%></option>
         <option value="sque2"><%=rs.getString("sque2")%></option>
         <option value="sque3"><%=rs.getString("sque3")%></option>
         <%
             }%>    
              </select>
              <label for="ans">Answer</label>
              <input type="text" class="form-control" id="ans" name ="ans" >
            </div>
                <center> <button type="submit" class="btn btn-Success">Done</button></center>
          </form>
        </div>
    </div>
      

<%
}
catch(Exception e)
{
    out.print(e);
}
%>
    </body>
</html>
