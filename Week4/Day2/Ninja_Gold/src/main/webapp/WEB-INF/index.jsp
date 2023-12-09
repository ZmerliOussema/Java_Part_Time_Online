<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold Game</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body class="container mt-5">
  <div class="row">
    <div class="col-md-6">
      <div class="mb-3">
        <label>Your Gold: </label> 
        <span class="badge bg-warning">0</span>
      </div>
    </div>
  </div>

  <div class="row">
    <div class="col-md-4">
      <div class="card mb-3">
        <div class="card-body">
          <h5 class="card-title">Farm</h5>
          <p class="card-text">(earns 10-20 gold)</p>
          <button class="btn btn-primary">Find Gold!</button>
        </div>
      </div>
    </div>

    <div class="col-md-4">
      <div class="card mb-3">
        <div class="card-body">
          <h5 class="card-title">Cave</h5>
          <p class="card-text">(earns 5-10 gold)</p>
          <button class="btn btn-primary">Find Gold!</button>
        </div>
      </div>
    </div>

    <div class="col-md-4">
      <div class="card mb-3">
        <div class="card-body">
          <h5 class="card-title">House</h5>
          <p class="card-text">(earns 2-5 gold)</p>
          <button class="btn btn-primary">Find Gold!</button>
        </div>
      </div>
    </div>
  </div>

  <div class="row">
    <div class="col-md-6">
      <div class="card mb-3">
        <div class="card-body">
          <h5 class="card-title">Quest</h5>
          <p class="card-text">(earns/takes 0-50 gold)</p>
          <button class="btn btn-primary">Find Gold!</button>
        </div>
      </div>
    </div>
  </div>

  <div class="row">
    <div class="col-md-6">
      <label>Activities</label>
      <p></p>
    </div>
  </div>

  <!-- Add Bootstrap JS and Popper.js scripts -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>