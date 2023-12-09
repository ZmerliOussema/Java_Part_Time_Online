<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruit Store</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body class="container">
	<h1 class="text-danger">Fruit Store</h1>
	<table class="table">
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${fruits }" var="item">
			<tr>
				<td>${item.name }</td>
				<td>${item.price }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>