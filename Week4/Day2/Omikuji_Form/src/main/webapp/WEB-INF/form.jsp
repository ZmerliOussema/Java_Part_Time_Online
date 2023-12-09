<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body class="container">
	<h1>Send an Omikuji!</h1>

	<form action="/processForm" method="POST" >
		<div class="mb-3">
			<label for="pickNumber" class="form-label">Pick any number from 5 to 25</label> 
			<input type="number" class="form-control" name="pickNumber">
		</div>
		<div class="mb-3">
			<label for="city" class="form-label">Enter the name of any city.</label> 
			<input type="text" class="form-control" name="city">
		</div>
		<div class="mb-3">
			<label for="realPerson" class="form-label">Enter the name of any real person</label> 
			<input type="text" class="form-control" name="realPerson">
		</div>
		<div class="mb-3">
			<label for="hobby" class="form-label">Enter professional endeavor or hobby:</label> 
			<input type="text" class="form-control" name="hobby">
		</div>
		<div class="mb-3">
			<label for="livingThing" class="form-label">Enter any type of living thing.</label> 
			<input type="text" class="form-control" name="livingThing">
		</div>
		<div class="mb-3">
			<label for="somethingNice" class="form-label">Say something nice to someone:</label> 
			<input type="text" class="form-control" name="somethingNice">
		</div>
		<p>Send and show a friend</p>
		<button type="submit" class="btn btn-primary">Send</button>
	</form>
</body>
</html>