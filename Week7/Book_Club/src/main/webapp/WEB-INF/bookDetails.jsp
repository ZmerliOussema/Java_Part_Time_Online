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
<title>Read share</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body class="container">
	<div class="d-flex justify-content-between align-items-center">
		<h1 class="mb-5">
			<c:out value="${book.title }"></c:out>
		</h1>
		<a href="/books">back to the shelves</a>
	</div>
	<div>
		<p>
			<span class="text-danger"><c:out
					value="${book.user.userName }"></c:out></span> read <span
				class="text-info"><c:out value="${book.title }"></c:out></span> by <span
				class="text-success"><c:out value="${book.author }"></c:out></span>
			.
		</p>
		<p>
			Here are
			<c:out value="${book.user.userName }"></c:out>
			's thoughts
		</p>
		<hr>
		<p>
			<c:out value="${book.thoughts }"></c:out>
		</p>
		<hr>
		<div class="d-flex justify-content-center">
			<form action="/books/${book.id}" method="post" class="me-5">
				<input type="hidden" name="_method" value="delete"> <input
					type="submit" value="Delete" class="btn btn-danger">
			</form>
			<a href="/books/${book.id}/edit" class="btn btn-primary">Edit</a>
		</div>
	</div>


</body>
</html>

