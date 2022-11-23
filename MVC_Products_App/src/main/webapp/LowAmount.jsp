<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>
 function myfunction()
 {
	 alert("Your Account Is Running On Low Balence....")
 }
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="myfunction()">
<jsp:include page="payment.jsp"></jsp:include>
</body>
</html>