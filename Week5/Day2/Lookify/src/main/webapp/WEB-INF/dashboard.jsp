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
<!-- Add Bootstrap CSS link -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<nav class="navbar navbar-light bg-white justify-content-between py-3">
		<div class="container">
			<a class="navbar-brand" href="/new">Add New</a> <a
				class="navbar-brand" href="#top-songs">Top Songs</a>
			<form class="form-inline" action="/search" method="post">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search" name="artist">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<table class="table container">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Rating</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${songs }" var ="song">
		<tr>
				<td><a href="/songs/${song.id }"><c:out
							value="${song.title }"></c:out></a></td>
				<td><c:out value="${song.rating }"></c:out></td>
				<td><form action="/songs/${song.id}" method="post">
						<input type="hidden" name="_method" value="delete"> <input
							type="submit" value="Delete">
					</form>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>

