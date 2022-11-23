<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.Bean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
 function myfunction1()
 {
	 alert("Details Updated SuccessFully....To See Better Results Login Again..")
 }
</script>
</head>
<body>
<%
Bean be=(Bean)request.getServletContext().getAttribute("Bean");
%>
<form action="update" method="post">
UserName:<input type="text" name="uname" value="<%=be.getuName()%>"><br>
PassWord:<input type="text" name="pword" value="<%=be.getpWord()%>"><br>
FirstName:<input type="text" name="fname" value="<%=be.getfName()%>"><br>
LastName:<input type="text" name="lname" value="<%=be.getlName()%>"><br>
Address:<input type="text" name="addr" value="<%=be.getAddr()%>"><br>
MailId:<input type="text" name="mid" value="<%=be.getMailId()%>"><br>
PhoneNumber:<input type="text" name="phno" value="<%=be.getPhNO()%>"><br>
<input  type="submit" onclick="myfunction1()" value="Update"><br>
</form>
<button onclick="history.back()">Go Back</button>
<a href="Logout"><button>LogOut</button></a>
</body>
</html>