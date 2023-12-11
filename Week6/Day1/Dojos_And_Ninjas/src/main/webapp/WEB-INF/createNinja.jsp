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
<title>New Ninja</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body class="w-25 p-3">
	<h1>New Ninja</h1>
	<form:form action="/ninjas" method="post" modelAttribute="ninja">
		<p class="form-group">
			<form:label path="dojo">Dojo: </form:label>
			<form:select path="dojo" class="form-select">
				<c:forEach items="${dojos }" var="dojo">
					<form:option value="${dojo.id }">
						<c:out value="${dojo.name }"></c:out>
					</form:option>
				</c:forEach>
			</form:select>
		</p>
		<p class="form-group">
			<form:label path="firstName">First Name: </form:label>
			<form:errors path="firstName" class="text-danger" />
			<form:input path="firstName" class="form-control" />
		</p>
		<p class="form-group">
			<form:label path="lastName">Last Name: </form:label>
			<form:errors path="lastName" class="text-danger" />
			<form:input path="lastName" class="form-control" />
		</p>
		<p class="form-group">
			<form:label path="age">Age: </form:label>
			<form:errors path="age" class="text-danger" />
			<form:input path="age" class="form-control" type="number"/>
		</p>
		<input type="submit" value="Create" class="btn btn-primary" />
	</form:form>
</body>
</html>

