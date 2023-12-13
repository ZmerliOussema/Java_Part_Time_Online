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
<title>Read Share</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body class="container p-3">
	<!-- Nav Bar -->
	<div class="d-flex justify-content-between align-items-sm-center">
		<div>
			<h1>
				Welcome,
				<c:out value="${user.userName }"></c:out>
			</h1>
			<h3>Books from everyone's shelves:</h3>
		</div>
		<div>
			<a href="/logout">logout</a> <br> <a href="/books/new">+ Add a book to my
				shelf!</a>
		</div>
	</div>
	<!--Books Table  -->
	<div class="mt-5">
		<table class="table container">
			<thead class="thead-dark">
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Title</th>
					<th scope="col">Author Name</th>
					<th scope="col">Posted By</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${books }" var="book">
					<tr>
						<td><c:out value="${book.id }"></c:out></td>
						<td><a href="/books/${book.id }"><c:out value="${book.title }"></c:out></a></td>
						<td><c:out value="${book.author }"></c:out></td>
						<td><c:out value="${book.user.userName }"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>

