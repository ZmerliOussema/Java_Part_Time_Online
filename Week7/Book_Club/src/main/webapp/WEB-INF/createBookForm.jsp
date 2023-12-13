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
<title>Book Share</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body class="p-5">
<div class="d-flex justify-content-between align-items-sm-center">
	<h1>Add a Book to Your Shelf!</h1>
	<a href="/dashboard" class="ml-auto p-2">back to the shelves</a>
</div>
	
	<form:form action="/books" method="post" modelAttribute="book"
		class="w-25 py-3">
		<p class="form-group">
			<form:label path="title">Title: </form:label>
			<form:errors path="title" class="text-danger"/>
			<form:input path="title" class="form-control" />
		</p>
		<p class="form-group">
			<form:label path="author">Author: </form:label>
			<form:errors path="author" class="text-danger"/>
			<form:input path="author" class="form-control" />
		</p>
		<p class="form-group">
			<form:label path="thoughts">My thoughts: </form:label>
			<form:errors path="thoughts" class="text-danger"/>
			<form:textarea path="thoughts" class="form-control" />
		</p>
		<input type="submit" value="Submit" class="btn btn-primary" />
	</form:form>
</body>
</html>

