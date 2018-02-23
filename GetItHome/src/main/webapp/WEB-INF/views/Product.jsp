<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Product</title>
<style>

form {
padding-left: 100px;
}

table, td, th {    
    border: 1px solid #ddd;
    text-align: center;
}

table {
    border-collapse: collapse;
    width: 75%;
}

th, td {
    padding: 10px;
}

</style>
</head>
<body>

<!-- Navigation -->
<%@include file="Header.jsp" %>

<div class="container">
  <h2>Add Product</h2>
  <form:form modelAttribute="product" class="form-horizontal" action="InsertProduct" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Product Name:</label>
      <div class="col-sm-3">
        <form:input path="productName" type="text" class="form-control"  placeholder="Enter Product Name" />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Product Price:</label>
      <div class="col-sm-3">          
        <form:input path="price" type="number" class="form-control" placeholder="Enter Product Price" />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Stock:</label>
      <div class="col-sm-3">          
        <form:input path="stock" type="number" class="form-control" placeholder="Enter Stock" />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Category Id:</label>
      <div class="col-sm-3">          
        <form:input path="categoryId" type="number" class="form-control" placeholder="Enter Category Id"/>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Supplier Id:</label>
      <div class="col-sm-3">          
        <form:input path="supplierId" type="number" class="form-control" placeholder="Enter Supplier Id" />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Product Description:</label>
      <div class="col-sm-3">          
        <form:input path="productDesc" type="text" class="form-control" placeholder="Enter Product Description"/>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-info">Insert</button>
      </div>
    </div>
  </form:form>
</div>

<table align="center">
  <thead>	
	<tr>
		<th>Product ID</th>
		<th>Product Name</th>
		<th>Price</th>
		<th>Stock</th>
		<th>Category ID</th>
		<th>Supplier ID</th>
		<th>Product Description</th>
		<th>Operation</th>
	</tr>
  </thead>
<c:forEach items="${productList}" var="product">
	<tbody>
	<tr>
		<td>${product.productId}</td>
		<td>${product.productName}</td>
		<td>${product.price}</td>
		<td>${product.stock}</td>
		<td>${product.categoryId}</td>
		<td>${product.supplierId}</td>
		<td>${product.productDesc}</td>
		<td>
			<a href="<c:url value='EditProduct,${product.productId}'/>">Edit</a>/
			<a href="<c:url value='DeleteProduct,${product.productId}'/>">Delete</a>
		</td>
	</tr>
	</tbody>
</c:forEach>
</table>

<div>
<p></p>
</div>

<!-- Footer -->
<%@include file="Footer.jsp" %>

</body>
</html>