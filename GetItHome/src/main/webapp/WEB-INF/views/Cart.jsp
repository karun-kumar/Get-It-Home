<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Techno-World/Cart Page</title>
<style type="text/css">
table {
    border-collapse: collapse;
    border-spacing: 0;
    width: 100%;
    border: 1px solid #ddd;
}

th, td {
    text-align: left;
    padding: 8px;
}
input {
	text-align: center;
}

tr:nth-child(even){background-color: #f2f2f2}

</style>
</head>
<body>
<%@include file="Header.jsp" %>
<div class="container">
<h1>Shopping Cart</h1>
<div class="row my-4">
<div class="col-lg-4">

</div>
<div class="col-lg-8">
<div style="overflow-x:auto;">
  <table>
    <tr>
      <th>Product Name</th>
      <th>Price</th>
      <th>Quantity</th>
      <th>Total Price</th>
      <th>Operation</th>
    </tr>
    <c:forEach items="${listItems}" var="cartItems">
    <tr>
    <form class="form-horizontal" action="updateItem,${cartItems.cartId}" method="get">
      <td>${cartItems.productName}</td>
      <td>${cartItems.price}/-</td>
      <td><input type="text" value="${cartItems.quantity}" name="quantity"/></td>
      <td>${cartItems.price*cartItems.quantity}/-</td>
      <td>
      	<button type="submit" value="update" class="btn btn-block">Update</button> 
		<a href="<c:url value='deleteItem,${cartItems.cartId}'/>" class="btn btn-block">Delete</a>
	  </td>
	</form>  
    </tr>
    </c:forEach>
    <tr>
    	<td colspan="3">Total Payment</td>
    	<td colspan="2">${totalPayment}/-</td>
    </tr>
    <tr>
    	<td colspan="3"><a href="<c:url value='index'/>" class="btn btn-block">Continue Shopping</a></td>
    	<td colspan="2"><a href="<c:url value='checkOut'/>" class="btn btn-block">Check Out</a></td>
    </tr>
  </table>
  <br>
</div>
</div>
</div>
</div>
<%@include file="Footer.jsp" %>
</body>
</html>