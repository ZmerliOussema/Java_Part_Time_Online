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
<title>Save Travels</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body class="container">

	<!-- Show All Travels -->
	<h1 class="text-primary">Save Travels</h1>
	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Expense</th>
				<th scope="col">Vendor</th>
				<th scope="col">Amount</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${expenses }" var="expense">
				<tr>
					<td><a href="expenses/${expense.id }"><c:out
								value="${expense.name }"></c:out></a></td>
					<td><c:out value="${expense.vendor }"></c:out></td>
					<td><c:out value="${expense.amount }"></c:out></td>
					<td class="d-flex align-items-center"><a href="/expenses/edit/${expense.id }" style="margin-right: 20px" class="btn btn-info">edit</a>

						<form action="/expenses/${expense.id}" method="post" >
							<input type="hidden" name="_method" value="delete" > 
							<input type="submit" value="Delete" class="btn btn-danger">
						</form></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<!-- Create An Expense -->
	<h3 class="col text-center text-primary">Add an expense</h3>
	<form:form action="/expenses" method="post" modelAttribute="expense"
		class="row justify-content-center mt-5">
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

