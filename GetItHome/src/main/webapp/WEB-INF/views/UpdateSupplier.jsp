<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UpdateSupplier</title>
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
    width: 50%;
}

th, td {
    padding: 10px;
}

  </style>
</head>
<body>
<!-- Navigation -->
<%@include file = "Header.jsp" %>

<div class="container">
  <h2>Supplier</h2>
  <p>To update the Supplier</p>
  <form class="form-horizontal" action="UpdateSupplier" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Supplier ID:</label>
      <div class="col-sm-3">
        <input type="text" class="form-control" readonly id="supid" value="${supplierInfo.supplierId}" name="supid">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Supplier Name:</label>
      <div class="col-sm-3">
        <input type="text" class="form-control" id="supname" value="${supplierInfo.supplierName}" name="supname">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Supplier Address:</label>
      <div class="col-sm-3">
        <input type="text" class="form-control" id="supadd" value="${supplierInfo.supplierAddress}" name="supadd">
      </div>
    </div>
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-info">Update</button>
      </div>
    </div>
  </form>
</div>

<table align="center">
  <thead>	
	<tr>
		<th>Supplier ID</th>
		<th>Supplier Name</th>
		<th>Supplier Address</th>
		<th>Operation</th>
	</tr>
  </thead>
<c:forEach items="${supplierList}" var="supplier">
	<tbody>
	<tr>
		<td>${supplier.supplierId}</td>
		<td>${supplier.supplierName}</td>
		<td>${supplier.supplierAddress}</td>
		<td>
			<a href="<c:url value='EditSupplier,${supplier.supplierId}'/>">Edit</a>/
			<a href="<c:url value='DeleteSupplier,${supplier.supplierId}'/>">Delete</a>
		</td>
	</tr>
	</tbody>
</c:forEach>
</table>

<div>
<p></p>
</div>

<!-- Footer -->
<%@include file = "Footer.jsp" %>
</body>
</html>