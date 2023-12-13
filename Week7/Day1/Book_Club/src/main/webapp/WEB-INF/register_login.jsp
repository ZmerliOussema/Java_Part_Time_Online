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
<body class="container w-50">
	<!--Register  -->
	<h3>Register</h3>
	<form:form action="/register" method="post" modelAttribute="newUser">
		<p class="form-group">
			<form:label path="userName">User Name: </form:label>
			<form:errors path="userName" class="text-danger" />
			<form:input path="userName" class="form-control" />
		</p>
		<p class="form-group">
			<form:label path="email">Email: </form:label>
			<form:errors path="email" class="text-danger" />
			<form:input type="email" path="email" class="form-control" />
		</p>
		<p class="form-group">
			<form:label path="password">Password: </form:label>
			<form:errors path="password" class="text-danger" />
			<form:input path="password" type="password" class="form-control" />
		</p>
		<p class="form-group">
			<form:label path="confirm">Confirm Password: </form:label>
			<form:errors path="confirm" class="text-danger"/>
			<form:input path="confirm" type="password" class="form-control" />
		</p>
		<input type="submit" value="Submit" class="btn btn-primary" />
	</form:form>

	<!-- Login -->
	<h1>Login</h1>
	<form:form action="/login" method="post" modelAttribute="newLogin">
		<p class="form-group">
			<form:label path="email">Email: </form:label>
			<form:errors path="email" class="text-danger" />
			<form:input path="email" type="email" class="form-control" />
		</p>
		<p class="form-group">
			<form:label path="password">Password: </form:label>
			<form:errors path="password" class="text-danger" />
			<form:input path="password" type="password" class="form-control" />
		</p>
		<input type="submit" value="Submit" class="btn btn-success" />
	</form:form>
</body>
</html>

