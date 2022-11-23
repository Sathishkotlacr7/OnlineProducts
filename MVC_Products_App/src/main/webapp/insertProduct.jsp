<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<script>
 function myfunction1()
 {
	 alert("Product Added SucessFuly....")
 }
 function myfunction2()
 {
	 alert("Product Not Added...")
 }
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
int k=(int)request.getAttribute("insert");
 if(k>0)
 {
	 %>
	 <body onload="myfunction1()"></body>
	 <%
 }
 else
 {
	 %>
	 <body onload="myfunction2()"></body>
	 <% 
 }
%>
<jsp:include page="AdminChoice.html"></jsp:include>
</html>