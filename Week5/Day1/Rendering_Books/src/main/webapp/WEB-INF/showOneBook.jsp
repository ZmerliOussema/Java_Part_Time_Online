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
	<div class="card" style="width: 18rem;">
		<div class="card-body">
			<h5 class="card-title">${book.title }</h5>
			<h6 class="card-subtitle mb-2 text-muted">Description: ${book.description }</h6>
			<h6 class="card-subtitle mb-2 text-muted">Language: ${book.language }</h6>
			<h6 class="card-subtitle mb-2 text-muted">Number of Pages: ${book.numberOfPages }</h6>
		</div>
	</div>
</body>
</html>

