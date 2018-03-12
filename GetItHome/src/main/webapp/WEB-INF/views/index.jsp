
<!DOCTYPE html>
<html lang="en">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
	
    <title>Get-It-Home</title>

    <style>
.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}

    </style>
  </head>

  <body>

    <!-- Navigation -->
    <%@include file ="Header.jsp" %>
    
    <!-- Page Content -->
    <div class="container">

      <!-- Heading Row -->
      <div class="row my-4">
        <div class="col-lg-8">
          <div id="myCarousel" class="carousel slide" data-ride="carousel">

			<ol class="carousel-indicators">

				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>

			</ol>
			<div class="carousel-inner">

				<div class="item active">
					<img class="img-responsive center block"
						src="<spring:url value="/resources/Images/slide-1.jpg/"/>" alt="first slide">
					<div class="carousel-caption">
					</div>
				</div>
				<div class="item">
					<img class="img-responsive center block"
						src="<spring:url value="/resources/Images/slide-2.jpg/"/>" alt="Second slide">
					<div class="carousel-caption">
					</div>
				</div>
				<div class="item">
					<img class="img-responsive center block"
						src="<spring:url value="/resources/Images/slide-3.jpg/"/>" alt="Third slide">
					<div class="carousel-caption">						
					</div>
				</div>

			</div>
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>

        </div>
        <!-- /.col-lg-8 -->
        <div class="col-lg-4">
          <h1>Techno-World</h1>
          <p>B2C Business to Consumer. Where you can go with the latest techologies like Laptops, SmartPhones and SmartTv's. Choose your best product as per your requirement, We Value our customer to satisfy in delivering the products safe and secure payments. </p>
          
          <div class = "dropdown">
	          <a class="btn btn-primary btn-lg dropbtn" href="#">Shop Now!</a>
		          <div class="dropdown-content">   
				    
				    <c:forEach items="${categories}" var = "category">
				    	<a href="#">${category.categoryName}</a>
				    </c:forEach>
				  
				  </div>
          </div>	
        
        </div>
        
        <!-- /.col-md-4 -->
      </div>
      <!-- /.row -->

      <!-- Call to Action Well -->
      <div class="card text-white bg-secondary my-4 text-center">
        <div class="card-body">
          <p class="text-white m-0">Just a step away from home. Makes you feel like shopping</p>
        </div>
      </div>

      <!-- Content Row -->
      <div class="row">
        <div class="col-md-4 mb-4">
          <div class="card h-100">
            <div class="card-body">
              <h2 class="card-title">Card One</h2>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, maxime minus quam molestias corporis quod, ea minima accusamus.</p>
            </div>
            <div class="card-footer">
              <a href="#" class="btn btn-primary">More Info</a>
            </div>
          </div>
        </div>
        <!-- /.col-md-4 -->
        <div class="col-md-4 mb-4">
          <div class="card h-100">
            <div class="card-body">
              <h2 class="card-title">Card Two</h2>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod tenetur ex natus at dolorem enim! Nesciunt pariatur voluptatem sunt quam eaque, vel, non in id dolore voluptates quos eligendi labore.</p>
            </div>
            <div class="card-footer">
              <a href="#" class="btn btn-primary">More Info</a>
            </div>
          </div>
        </div>
        <!-- /.col-md-4 -->
        <div class="col-md-4 mb-4">
          <div class="card h-100">
            <div class="card-body">
              <h2 class="card-title">Card Three</h2>
              <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, maxime minus quam molestias corporis quod, ea minima accusamus.</p>
            </div>
            <div class="card-footer">
              <a href="#" class="btn btn-primary">More Info</a>
            </div>
          </div>
        </div>
        <!-- /.col-md-4 -->

      </div>
      <!-- /.row -->

    </div>
    <!-- /.container -->

    <!-- Footer -->
    <%@include file = "Footer.jsp" %>   

  </body>

</html>
