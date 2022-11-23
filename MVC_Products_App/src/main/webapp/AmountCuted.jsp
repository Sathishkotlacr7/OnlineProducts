<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
 function myfunction1()
 {
	 alert("Amount Credited...Delivary reach In 2 Days...")
 }
 function myfunction2()
 {
	 alert("Low Amount In Your Card")
 }
</script>
</head>
<%
 VisaBean vb=(VisaBean)application.getAttribute("visa");
 int k=new DAO().CardAmtCut(request, vb,response);
 if(k>0)
 {
	 %>
	  <body onload="myfunction1()"></body>
	  <jsp:include page="UserChoice.html"></jsp:include>
	  <%
 }
 else
 {
	 %> 
	 <body onload="myfunction2()"></body> 
	 <jsp:include page="payment.jsp"></jsp:include>
	 <%
 }
%>
</html>