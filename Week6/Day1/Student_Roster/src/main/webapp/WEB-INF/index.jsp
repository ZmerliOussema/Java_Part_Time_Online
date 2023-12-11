<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dorms</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body class="w-50 p-3 container">
	<h1 class="text-center">Dorms</h1>
	<a href="/dorms/new">Add a new dorm</a><br>
	<a href="/students/new">Add a new student</a>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Dorm</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${dorms }" var="dorm">
				<tr>
					<td><c:out value="${dorm.name }"></c:out></td>
					<td><a href="/dorms/${dorm.id }">See Students</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>

