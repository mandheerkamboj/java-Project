<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
     <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Chitkara University</title>
<style>
body {
    margin: 0;
    background-color: #f1f1f1;
}
.header {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    border: 1px solid #e7e7e7;
    background-color:  #ec2e2e;
    font-size:40px;
}

.info {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 16%;
    background-color: #f1f1f1;
    position: fixed;
    height: 100%;
    overflow: auto;
}

li a {
    display: block;
    color: #000;
    padding: 8px 16px;
    text-decoration: none;
}

li a.active {
    background-color: #555;
    color: white;
    text-decoration: none;

}

li a:hover:not(.active) {
    background-color: #555;
    color: white;
    text-decoration: none;
    
}
iframe{
    border:none;
}
</style>
</head>
<body>
    <div class="col-sm-2" style="padding-left:0;">
<nav class="navbar">
<ul class="info">
     <ul class="header">
    <li><a class="active" href="#home"><img src="cu_logo.png" width="175px"></a></li>
</ul>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">My Info. <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Complete Info</a></li>
          <li><a href="#">Parents Info</a></li>
          <li><a href="#">Teachers comments</a></li>
          <li><a href="#">Course Handouts</a></li>
        </ul>
  <li><a href="#timetable">Time Table</a></li>
 <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Fee Details <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Reg. Fee Info</a></li>
          <li><a href="#">Fee Receipt</a></li>
          <li><a href="#">Pay Fee Online
  </a></li>
        </ul>
   <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Academic Info. <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">My Attendence</a></li>
          <li><a href="#">Subject Regtd.</a></li>
          <li><a href="#">Subject Faculty</a></li>
        </ul>
  <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Exam Info. <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">My Seating Plan</a></li>
          <li><a href="#">Exam Marks</a></li>
          <li><a href="#">View CGPA/SGPA</a></li>
        </ul>
  <li class="dropdown"><a class="active dropdown-toggle" data-toggle="dropdown" href="#">Application Forms<span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li><a href="Gatepass.jsp?name=${name}" target="iframe">Gate pass</a></li>
          <li><a href="duty.jsp?name=${name}" target="iframe">Duty Leave</a></li>
          <li><a href="#">Medical Leave</a></li>
          <li><a href="#">Re-registration Form</a></li>
          <li><a href="#">Re-appear Form</a></li>
          <li><a href="appStat.jsp?name=${name}"target="iframe">view Application Status</a></li>
        </ul>
  <li><a href="#Disco">Disciplinary Actions</a></li>
  <li><a href="#password">Change Password</a></li>
  <li><a href="index.jsp"> <span class="glyphicon glyphicon-log-out"></span> 
          <%String id=(String)request.getAttribute("name");
            out.print("Logout "+id);
          session.setAttribute("name", id);%>
      </a></li>
</ul>
    </nav>
    </div>
    
    <div class="col-sm-10" style="padding: 0; float:right;">
        <iframe src="" width="100%" height="700" name="iframe" id="myIframe"></iframe>
    </div>
    <script>
        var ifrm = document.getElementById('myIframe');
ifrm = ifrm.contentWindow || ifrm.contentDocument.document || ifrm.contentDocument;
ifrm.document.open();
ifrm.document.write('<center><h4>Student Application Portal</h4></center>');
ifrm.document.write('<center>Select Application form!</center>');
ifrm.document.close()
        </script>

</body>
</html>
