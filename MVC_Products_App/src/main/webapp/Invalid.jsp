<%@ page language="java" 
         contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
 function myfunction()
 {
	 alert("Invalid UserName/PassWord....")
 }
</script>
</head>
 <body onload="myfunction()">
 <jsp:include page="Home.html"></jsp:include>
</body>
</html>