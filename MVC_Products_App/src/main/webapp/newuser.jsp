<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*,javax.servlet.annotation.*"%>
<!DOCTYPE html>
<html>
<head>
<script>
 function myfunction1()
 {
	 alert("New USer Created Sucessfully...")
 }
 function myfunction2()
 {
	 alert("Enter Valid Details...")
 }
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head> 

<%
 int k=new DAO().insert(request);
 if(k>0)
 {
%><body onload="myfunction1()"></body> 
<%
 }
 else
 {
	 %><body onload="myfunction2()"></body>
	 <% 
 }
 %> 
<jsp:include page="Home.html"></jsp:include>
</html>