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
<title>Show Expense</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
 <div class="d-flex justify-content-between align-items-center bg-primary p-3" style="max-width: 600px; margin: 0 auto;">
    <h1 class="text-light mb-0">Expense Details</h1>
    <a href="/expenses" class="text-light">Go Back</a>
  </div>
  <div class="card mx-auto mt-4" style="width: 18rem;">
    <div class="card-body">
      <div class="mb-2">
        <label class="font-weight-bold"><strong>Expense Name:</strong></label>
        <span class="ml-2"><c:out value="${expense.name }"></c:out></span>
      </div>
      <div class="mb-2">
        <label class="font-weight-bold"><strong>Expense Description:</strong></label>
        <span class="ml-2"><c:out value="${expense.description }"></c:out></span>
      </div>
      <div class="mb-2">
        <label class="font-weight-bold"><strong>Vendor:</strong></label>
        <span class="ml-2"><c:out value="${expense.vendor }"></c:out></span>
      </div>
      <div>
        <label class="font-weight-bold"><strong>Amount Spent:</strong></label>
        <span class="ml-2">$<c:out value="${expense.amount }"></c:out></span>
      </div>
    </div>
  </div>
</body>
</html>

