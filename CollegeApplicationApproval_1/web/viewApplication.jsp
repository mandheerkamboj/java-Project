<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
     <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body {
  font-family: Arial;
  font-size: 14px;
  background-color: #f1f1f1;
 
}
        
* {
  box-sizing: border-box;
}

.row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  margin: 0px -16px;
}

.col-25 {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
}
.col-33 {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
}
.col-50 {
  -ms-flex: 50%; /* IE10 */
  flex: 50%;
}

.col-75 {
  -ms-flex: 75%; /* IE10 */
  flex: 75%;
}

.col-25,
.col-33,
.col-50 
 {
  padding: 0 8px;
}

.container {
  background-color: #f2f2f2;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
}
input[type=password] {
  width: 100%;
  margin-bottom: 20px;
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 3px;
}
input[type=date] {
  width: 100%;
  margin-bottom: 20px;
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 3px;
}
input[type=text] {
  width: 100%;
  margin-bottom: 20px;
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 3px;
}
input[type=submit] {
  width: 10%;
}
label {
  margin-bottom: 10px;
  display: block;
}



.btn {
  background-color: #4CAF50;
  color: white;
  padding: 12px;
  margin: 10px 0;
  border: none;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
}

.btn:hover {
  background-color: #45a049;
}

a {
  color: #2196F3;
}

hr {
  border: 1px solid lightgrey;
}

span.price {
  float: right;
  color: grey;
}
#reason,#decreason{
    width: 100%;
    height: 100px;
    padding: 5px 10px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    background-color: white;
    resize: none;
}
</style>
    </head>
    <body>
        <%  
        String id=(String)request.getParameter("name");
        Connection conn = null;
        Statement stmt = null;
       try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
        stmt = con.createStatement();
        String sql = "SELECT * from application where id='"+id+"'" ;
       ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
      
      
        %>   
<div class="col-75">
    <div class="container">
        <form id="gatepass" action="updateStat" method="post">
        <div class="row">
          <div class="col-33">
            <label for="fname"><i class="fa fa-user"></i> First Name</label>
            <input type="text" id="fname" name="firstname" value="<%=rs.getString("firstName")%>" placeholder="first name" required>
              <label for=from"> Date From</label>
            <input type="date" id="from" value="<%= rs.getString("frm")%>" name="from" required>
            <label for="reason">Reason for leave:</label>
            <textarea form="gatepass" name="reason" id="reason" required readonly><%=rs.getString("reason")%></textarea>
            <b> Action:</b>
            <label for="approved"> 
            <input type="radio" id="approved" value="Approved by teacher" name="action" required>:Approve</label>
            <label for="Decline"> 
            <input type="radio" id="Decline" value="Declined by teacher" name="action" required checked>:Decline</label>
            <label for="dereason" id="dereason">Reason for Declination:
            <textarea form="gatepass" name="dereason" id="decreason"  required></textarea></label>
          </div>
          <div class="col-33">
          <label for="lname"><i class="fa fa-user"></i>Last Name</label>
            <input type="text" id="lname" name="lastname" value="<%= rs.getString("lastName")%>" placeholder="last name" required>
          <label for=to"> Date To</label>
            <input type="date" id="to" value="<%= rs.getString("upto")%>" name="to" required>
           
          </div>
            <div class="col-33">
            <label for="id">Enrollment Number</label>
            <input type="text" id="id" name="id" value="<%=rs.getString("id")%>" placeholder="Enrollment Number" required>
            
            </div>
        </div>
            
          <center><input type="submit" value="Done" class="btn"></center>
      </form>
            
     </div>
  </div>
<%
    }
}
catch(Exception e)
{
    out.print(e);
}
%>
<script>
$(document).ready(function(){
    $("#approved").click(function(){
        $("#dereason").hide();
    });
    $("#Decline").click(function(){
        $("#dereason").show();
    });
});
</script>
    </body>
</html>
