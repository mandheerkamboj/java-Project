<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .modal-header, h4, .close {
      background-color: white;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
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
    <div class="col-sm-offset-4 col-sm-4 " style="padding-top:5%;"> 
        <div>
            <center> <img  onload="myFunction()" src="Chitkara Logo.jpeg"  width="250" height="200" ></center>
    </div>
        <div style="padding:40px 50px;">
            <form method="post" action="Login" autocomplete="off">
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span> Username</label>
              <input type="text" class="form-control" id="usrname" name ="id" pattern=".{10}" placeholder="Enter enrollment number">
            </div>
            
                <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Password</label>
              <input type="password" class="form-control" id="myInput" name="pass" placeholder="Enter password"><input type="checkbox" onclick="myFnction()">Show Password
            </div>
             <div class="form-group">
                    <label for="usr"><span class="glyphicon glyphicon-user"></span> User</label>
             <select id="usr" name="usr">
             <option value="Student">Student</option>
             <option value="Teacher">Teacher</option>
             <option value="HOD">HOD</option>
             <option value="Admin">Admin</option>
                </select>
                </div>
              <center> <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-off"></span> Login</button></center>
          </form>
        </div>
        <div class="modal-footer">
          <p>Forgot <a href="forgotPassword.html">Password?</a></p>
        </div>
    </div>
    <script>
function myFunction() {
    alert("Sorry Username or Password Error!");
}
    function myFnction() {
    var x = document.getElementById("myInput");
    if (x.type === "password") {
        x.type = "text";
    } else {
        x.type = "password";
    }
}
</script>
</body>
</html>
