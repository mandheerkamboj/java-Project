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
        <title>Gate Pass</title>
        <style>
 body {
  font-family: Arial;
  font-size: 14px;
  background-color: #f1f1f1;
  overflow:hidden;
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
input[type=date] {
  width: 45%;
  margin-bottom: 20px;
  padding: 5px 8px 9px 9px;
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
  padding: 5px 5px 5px 5px;
  
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

textarea {
    width: 60%;
    height: 150px;
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
          <sql:setDataSource var = "data" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost/user"
         user = "root"  password = ""/>
        <%String name=(String)request.getParameter("name");%>
        <c:set var = "Id" value = "${name}"/>
        <sql:query dataSource = "${data}" var = "result">
         SELECT * from students where id=?
          <sql:param value = "${Id}" />
      </sql:query>
     
            <%=(new java.util.Date()).toLocaleString()%>
             <c:forEach var = "row" items = "${result.rows}">
                
                      <div class="row">
  <div class="col-75">
    <div class="container">
          <form id="gatepass" action="check" >
        <div class="row">
          <div class="col-33">
            <label for="fname"><i class="fa fa-user"></i> First Name</label>
            <input type="text" id="fname" name="firstname" value="<c:out value = "${row.firstName}"/>" placeholder="first name" required>
              <label for="from"> Date From</label>
            <input type="date" id="from" name="from" required>
            <p><b>Time Slot</b></p>
            <label for="full">
             <input type="radio" id="full" name="timeslot" value="full" >Full Day<br></label>
              <label for="period">
             <input type="radio" id="period" name="timeslot" value="period"checked>Period Wise<br></label>
             <label for="lect" id="lect">Lectures: 
                 1:<input type="checkbox" name="lect1">
                 2:<input type="checkbox" name="lect2">
                 3:<input type="checkbox" name="lect3">
                 4:<input type="checkbox" name="lect4">
                 5:<input type="checkbox" name="lect5">
                 6:<input type="checkbox" name="lect6">
                 7:<input type="checkbox" name="lect7">
                 8:<input type="checkbox" name="lect8">
             </label>
            
          </div>
          <div class="col-33">
          <label for="lname"><i class="fa fa-user"></i>Last Name</label>
            <input type="text" id="lname" name="lastname" value="<c:out value = "${row.lastName}"/>" placeholder="last name" required>
          <label for=to"> Date To</label>
            <input type="date" id="to" name="to" required>
           
          </div>
            <div class="col-33">
            <label for="id">Enrollment Number</label>
            <input type="text" id="id" name="id" value="<c:out value = "${row.id}"/>" placeholder="Enrollment Number" required>
            
            </div>
        </div>
            
          <center><input type="submit" value="Done" class="btn"></center>
            </form>
             </c:forEach>
     </div>
  </div>
</div>
<script>
$(document).ready(function(){
    $("#full").click(function(){
        $("#lect").hide();
    });
    $("#period").click(function(){
        $("#lect").show();
    });
});
</script>
    </body>
</html>
