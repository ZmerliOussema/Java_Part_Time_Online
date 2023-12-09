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
<title>Books</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body class="container">
	<h1>Books</h1>
	<table class="table">
		<tr>
			<th>Id</th>
			<th>Title</th>
			<th>Description</th>
			<th>Language</th>
			<th>Number Of pages</th>
		</tr>
		<c:forEach items="${ books}" var="book">
			<tr>
				<td>${book.id }</td>
				<td><a href="/books/${book.id }">${book.title }</a></td>
				<td>${book.description }</td>
				<td>${book.language }</td>
				<td>${book.numberOfPages }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

