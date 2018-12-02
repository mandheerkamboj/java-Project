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
input[type=password] {
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
  .vl {
    border-left: 1px solid black;
    height: 100%;
    position: absolute;
    top: 0;
}
@media (max-width: 800px) {
  .row {
    flex-direction: column-reverse;
  }
  .col-25 {
    margin-bottom: 20px;
  }
}
iframe{
    border:none;
}
#hello{
    color:red;
}
</style>
</head>
<body>
    <div class="row ">
<nav class="navbar navbar-fixed-top">
<ul class="info">
     <li><a class="active" href="#home"><img src="cu_logo.png" style="width:175px;"></a></li>
 <li><a href="signup.html">ADD USER</a>

    
    <li><a href="delete.html" target="iframe">DELETE USER</a>


    <li><a href="changepassword.html"  target="iframe">CHANGE PASSWORD</a></li>
  <li><a href="index.jsp"  target="iframe"> <span class="glyphicon glyphicon-log-out"></span> Log Out</a></li>

</ul>

    </nav>
            <div class="col-sm-offset-3 col-sm-8" style="padding:0; float:right; background-color: #f1f1f1;">

                <iframe src="register.html" width="100%" height="700" name="iframe"></iframe>
        </div>
    </div>
     
      <script>
          function myFunction()
          {
              var x=document.getElementById(pass).value;
               var y=document.getElementById(re-pass).value;
               if(x!=y)
               {
                   alert("PASSWORDS DONOT MATCH");
               }
          }
          
          </script>



</body>
</html>
