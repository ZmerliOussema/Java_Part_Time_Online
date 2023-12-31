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
<title>Lookify</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body class="d-flex justify-content-center align-items-center vh-100">
	<div class="card" style="width: 18rem;">
		<div class="card-body">
			<h5 class="card-title">Song Details</h5>
			<p class="card-text">Title: <span><c:out value="${song.title }"></c:out></span></p>
			<p class="card-text">Artist: <span><c:out value="${song.artist }"></c:out></span></p>
			<p class="card-text">Rating: <span><c:out value="${song.rating }"></c:out></span></p>
			<a href="/dashboard" class="card-link">Dashboard</a>
		</div>
	</div>
</body>
</html>

