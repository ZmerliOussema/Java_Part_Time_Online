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
<title>Edit Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body class="container">
	<div>
		<h1 class="text-success row justify-content-center mt-5 ">Edit Expense</h1>
		<a href="/expenses" class="row justify-content-center mt-5">Go Back</a>
	</div>
	<form:form action="/expenses/${expense.id }" method="post"
		modelAttribute="expense" class="row justify-content-center mt-5">
		<input type="hidden" name="_method" value="put">
		<div class="col-md-6">
			<div class="form-group">
				<form:label path="name">Expense Name: </form:label>
				<form:errors path="name" class="text-danger" />
				<form:input path="name" class="form-control" />
			</div>
			<p class="form-group">
				<form:label path="vendor">Vendor: </form:label>
				<form:errors path="vendor" class="text-danger" />
				<form:input path="vendor" class="form-control" />
			</p>
			<p class="form-group">
				<form:label path="amount">Amount $: </form:label>
				<form:errors path="amount" class="text-danger" />
				<form:input path="amount" type="number" class="form-control" />
			</p>
			<p class="form-group">
				<form:label path="description">Description: </form:label>
				<form:errors path="description" class="text-danger" />
				<form:textarea type="number" path="description" class="form-control" />
			</p>
			<input type="submit" value="Submit" class="btn btn-primary" />
		</div>
	</form:form>
</body>
</html>

