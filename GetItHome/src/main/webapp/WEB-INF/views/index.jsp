<!DOCTYPE html>
<html lang="en">
<head>
<title>Get_It_Home-${title}</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- custom js -->
<link href="${js}/myapp.js" rel="stylesheet">

<script>
	window.menu = '${title}';
</script>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
html {
	height: 100%;
}

body {
	background-image:
		url("https://previews.123rf.com/images/feelart/feelart1311/feelart131100011/23469046-technology-background-design-Stock-Photo.jpg");
	height: 100%;
}
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Add a gray background color and some padding to the footer */
footer {
	background-color: #696969;
	color: white;
	padding: 20px 20px;
	margin: 0;
}

.wrapper {
	min-height: 100%;
	position: relative;
}

.content {
	padding-bottom: 60px;
}

.footer {
	position: absolute;
	bottom: 15px;
	height: 60px;
}

.carousel-inner img {
	width: 100%; /* Set width to 100% */
	margin: auto;
	min-height: 200px;
}

/* Hide the carousel text when the screen is less than 600 pixels wide */
@media ( max-width : 600px) {
	.carousel-caption {
		display: none;
	}
	.modal-header, h4, .close {
		background-color: #5cb85c;
		color: white !important;
		text-align: center;
		font-size: 30px;
	}
	.modal-footer {
		background-color: #f9f9f9;
	}
}
</style>
</head>
<body>
	<div class="wrapper">
		<!-- Navigation bar -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->
		<div class="content">
			<c:if test="${userClickHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${userClickAbout == true}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${userClickContact == true}">
				<%@include file="contact.jsp"%>
			</c:if>

		</div>

		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- self coded java script -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>
</html>
