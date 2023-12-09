<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
<body class="bg-light">
    <div class="container">
        <div class="row justify-content-center mt-5">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <h1 class="card-title text-center">Here's Your Omikuji!</h1>
                        <p class="card-text text-center">
                            In <span><c:out value="${pickNumber }"></c:out></span>, you will <br/>
                            live in <span><c:out value="${city }"></c:out></span> with <br/>
                            <span><c:out value="${realPerson }"></c:out></span> as your <br/>
                            roommate, <span><c:out value="${hobby }"></c:out></span> for a living. <br/>
                            The next time you see a <span><c:out value="${livingThing }"></c:out></span>, you will <br/>
                            have good luck. <br/>
                            Also, <span><c:out value="${somethingNice }"></c:out></span>
                        </p>
                        <div class="text-center">
                            <a href="/omikuji" class="btn btn-primary">Go Back</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <!-- Add any additional scripts here -->
</body>
</html>