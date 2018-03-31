<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER AUTHORITY</title>
</head>
<body>
<h1>This is a User Home page.</h1>
	<h3>Message: ${message}</h3>
	<h3>Username: ${username}</h3>
	
	<a href="<c:url value="/logout"/> ">Logout</a>
</body>
</html>