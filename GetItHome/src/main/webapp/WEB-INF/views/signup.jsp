<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get_It_Home/signup</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  body {
  background-image: url("https://previews.123rf.com/images/feelart/feelart1311/feelart131100011/23469046-technology-background-design-Stock-Photo.jpg");
  }
  
  .modal-header, h4, .close {
      background-color: #3F729B;
      color:white !important;
      text-align: center;
      font-size: 30px;
  }
  .modal-footer {
      background-color: #f9f9f9;
  }
  </style>
</head>
<body>
<div class="container">
  <div style="padding:7cm 5cm;">
  <!-- Trigger the modal with a button -->
  <div class="text-center" >
  <button type="button" class="btn btn-default btn-lg" id="myBtn">Login</button>
  </div>
  <div class="text-center" style="padding:10px;">
  <button type="button" class="btn btn-default btn-lg" id="Btn">SignUp</button>
  </div>
  </div>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:15px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> Login</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form">
            <div class="form-group">
              <label for="usrname"><span class="glyphicon glyphicon-user"></span> Username</label>
              <input type="text" class="form-control" id="usrname" placeholder="Enter email">
            </div>
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Password</label>
              <input type="text" class="form-control" id="psw" placeholder="Enter password">
            </div>
            <div class="checkbox">
              <label><input type="checkbox" value="" checked>Remember me</label>
            </div>
              <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> Login</button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
          <p>Not a member? <a href="#">Sign Up</a></p>
          <p>Forgot <a href="#">Password?</a></p>
        </div>
      </div>
      
    </div>
  </div> 
</div>
 
<script>
$(document).ready(function(){
    $("#myBtn").click(function(){
        $("#myModal").modal();
    });
});
</script>

<!-- Modal -->
  <div class="modal fade" id="Modal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="padding:15px 50px;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4><span class="glyphicon glyphicon-lock"></span> SignUp</h4>
        </div>
        <div class="modal-body" style="padding:40px 50px;">
          <form role="form">
            <div class="form-group">
              <label for="firstname"><span class="glyphicon glyphicon-user"></span> FirstName</label>
              <input type="text" class="form-control" id="firstname" placeholder="Enter firstname">
            </div>
            <div class="form-group">
              <label for="lastname"><span class="glyphicon glyphicon-user"></span> LastName</label>
              <input type="text" class="form-control" id="lastname" placeholder="Enter lastname">
            </div>
            <div class="form-group">
              <label for="email"><span class="glyphicon glyphicon-envelope"></span> Email Id</label>
              <input type="text" class="form-control" id="email" placeholder="Enter Email Id">
            </div>
            <div class="form-group">
              <label for="phonenumber"><span class="glyphicon glyphicon-phone"></span> Phone</label>
              <input type="text" class="form-control" id="phonenumber" placeholder="Enter Phone Number">
            </div>
            <div class="form-group">
              <label for="address"><span class="glyphicon glyphicon-home"></span> Address</label>
              <input type="text" class="form-control" id="address" placeholder="Enter Address">
            </div>
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> Password</label>
              <input type="text" class="form-control" id="psw" placeholder="Enter password">
            </div>
            <div class="form-group">
              <label for="psw"><span class="glyphicon glyphicon-eye-close"></span> Repeat Password</label>
              <input type="text" class="form-control" id="reptpsw" placeholder="Enter password">
            </div>
            <div class="checkbox">
              <label><input type="checkbox" value="" checked>Remember me</label>
            </div>
              <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> SignUp</button>
          </form>
        </div>
        <div class="modal-footer">
          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
          <p>Not a member? <a href="#">Sign Up</a></p>
          <p>Forgot <a href="#">Password?</a></p>
        </div>
      </div>
      
    </div>
  </div> 
</div>
 
<script>
$(document).ready(function(){
    $("#Btn").click(function(){
        $("#Modal").modal();
    });
});
</script>

</body>
</html>