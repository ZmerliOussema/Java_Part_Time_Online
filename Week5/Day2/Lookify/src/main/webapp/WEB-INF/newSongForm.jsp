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
<body class="p-5">
	<h1 clas>Add Song</h1>
	<form:form action="/songs" method="post" modelAttribute="song" class="w-25 py-3">
		<p class="form-group">
			<form:label path="title">Title: </form:label>
			<form:errors path="title" />
			<form:input path="title" class="form-control"/>
		</p>
		<p class="form-group">
			<form:label path="artist">Artist: </form:label>
			<form:errors path="artist" />
			<form:input path="artist" class="form-control"/>
		</p>
		<p class="form-group">
			<form:label path="rating">Rating(1-10): </form:label>
			<form:errors path="rating" />
			<form:input type="number" path="rating" class="form-control"/>
		</p>
		<input type="submit" value="Submit" class="btn btn-primary"/>
	</form:form>
	<a href="/dashboard" class="my-3">Dashboard</a>
</body>
</html>

