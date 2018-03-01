<!DOCTYPE html>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
<head>
  <title>Header</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
        
    li a {
    color:white;
    }
 
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    	<ul class="navbar-brand">
    	<li><a href="index">Techno-World</a></li>	
    	</ul>   	
    </div>
       
    <div class="collapse navbar-collapse" id="myNavbar">    	
      <ul class="nav navbar-nav navbar-right">
        <li class="active"><a href="home"><i class="fa fa-home" style="font-size:20px"></i></a></li>
        <li><a href="about" >About</a></li>
        <li><a href="product">Products</a></li>
        <li><a href="category">Category</a></li>
        <li><a href="supplier">Supplier</a></li>
        <li><a href="contact">Contact</a></li>
        <li><a href="contact">SignUp</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
		<li><a type="button" data-target="#myModal" data-toggle="modal"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      <!-- Modal -->
			  <div class="modal fade" id="myModal" role="dialog">
			    <div class="modal-dialog modal-md">
			      <div class="modal-content">
			        
			        <div class="modal-header" >
			          <button type="button" class="close" data-dismiss="modal">&times;</button>
			          <h4 class="modal-title" align="center">Login</h4>
			        </div>
			     
			     <div class="modal-body">
			       
			       <form class="form-horizontal" action="login" method="post">
				    <div class="form-group">
				      <label class="control-label col-sm-3" for="email">User Name:</label>
				      <div class="col-sm-8">
				        <input type="text" class="form-control" id="username" placeholder="Enter user name" name="username">
				      </div>
				    </div>
				    <div class="form-group">
				      <label class="control-label col-sm-3" for="pwd">Password:</label>
				      <div class="col-sm-8">          
				        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
				      </div>
				    </div>
				    <div class="form-group">        
				      <div class="col-sm-offset-2 col-sm-10">
				        <div class="checkbox">
				          <label><input type="checkbox" name="remember"> Remember me</label>
				        </div>
				      </div>
				    </div>
				    
			        <div class="modal-footer">
			          <button type="submit" class="btn btn-info">Login</button>
			          <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>          
			        </div>
			      </form>
			      
			      </div>
			    </div>
			  </div>
			</div>
			      	
		</ul>
    </div>
  </div>
</nav>

</body>
</html>
