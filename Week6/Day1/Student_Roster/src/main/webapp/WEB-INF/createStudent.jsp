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
<title>New Student</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body class="container">
	<h1 class="text-center">New Student</h1>
	<a href="/dorms" class="mb-3">Dashboard</a>
	<form:form action="/students" method="post" modelAttribute="student">
		<p class="form-group">
			<form:label path="name">Name: </form:label>
			<form:errors path="name" />
			<form:input path="name" class="form-control w-50" />
		</p>
		<div>
			<form:label path="name">Select Dorm: </form:label>
			<form:select path="dorm" class="form-select w-50 mb-3 mt-3">
				<c:forEach items="${dorms }" var="dorm">
					<form:option value="${dorm.id }">
						<c:out value="${dorm.name }"></c:out>
					</form:option>
				</c:forEach>
			</form:select>
		</div>
		<input type="submit" value="Add" class="btn btn-primary" />
	</form:form>
</body>
</html>

