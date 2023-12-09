<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Burger Tracker</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body class="container">
	<div>
		<h3 class="text-primary">Edit Burger</h3>
		<a href="/">Go back</a>
	</div>
	<form:form action="/burgers/${burger.id }" method="post" modelAttribute="burger">
		<input type="hidden" name="_method" value="put">
		<div class="mb-3">
			<form:label class="form-label" path="name">Burger Name</form:label> 
			<form:input type="text" class="form-control" path="name"/>
			<form:errors style="color: red" path="name" />
		</div>
		<div class="mb-3">
			<form:label class="form-label" path="restaurantName">Restaurant Name</form:label> 
			<form:input type="text" class="form-control" path="restaurantName"/>
			<form:errors style="color: red" path="restaurantName" />
		</div>
		<div class="mb-3">
			<form:label class="form-label" path="rating">Rating</form:label> 
			<form:input type="number" class="form-control" path="rating"/>
			<form:errors style="color: red" path="rating" />
		</div>
		<div class="mb-3">
			<form:label class="form-label" path="notes">Notes</form:label>
			<form:textarea type="text" class="form-control" path="notes"/>
			<form:errors style="color: red" path="notes" />
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
</body>
</html>

