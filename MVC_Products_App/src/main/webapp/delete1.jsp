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
	 alert("Deleted Sucessfully....")
 }
 function myfunction2()
 {
	 alert("Something Problrm in deleting...")
 }
</script>
</head>
<%
 HttpSession hs=request.getSession();
 if(hs==null)
 {
	 %>
	  <jsp:forward page="SessionExpired.jsp"></jsp:forward> 
	 <%
 }
 else
 {
 int k=new DAO().delete1(request);
if(k>0)
{
%><body onload="myfunction1()"></body> 
<%
}
else
{
	 %><body onload="myfunction2()"></body>
	 <% 
}}
%> 
<jsp:include page="Home.html"></jsp:include>
<body>

</body>
</html>