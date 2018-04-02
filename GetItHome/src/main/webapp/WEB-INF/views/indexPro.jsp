<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="container">
<div class="row">
  
    <c:forEach items="${productList}" var="product">
    <div class="col-sm-6 col-md-3">
      <a href="" class="thumbnail" >
      <img src="<c:url value="/resources/Images/${product.productId}.jpg"/>" alt="Products" style="width:100%">
      </a>
      <h4>${product.productName}</h4>
      <p>${product.price}</p>
    </div>  
    </c:forEach>
  
</div>
</div>
</body>
</html>
