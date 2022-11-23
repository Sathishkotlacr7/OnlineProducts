<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
 function myfunction1()
 {
	 alert("Session Expired LoginAgain.....")
 }
</script>
<body onload="myfunction1()">
<jsp:include page="Home.html"></jsp:include>
</body>
</html>