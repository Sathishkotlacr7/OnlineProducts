<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table, th, td ,tr{
  border: 1px solid black;
}
</style>
<body>
<%
 ArrayList<ProductBean> al=new DAO().AllProducts();
 Iterator<ProductBean> it=al.iterator();
 %>
  <table>
  <caption>All Products</caption>
  <tr>
  <th></th>
  <th>ProductName</th>
  <th>ProductPrice</th>
  <th></th>
  <th>EnterQty</th>
  <th>PressAddToCart</th>
  
  </tr>
 <%
 while(it.hasNext())
 {
	 ProductBean pb=(ProductBean)it.next();
	 %>
	 <tr>
	<form action='cart' method='post'>
	 <td><input type='hidden' name='pcode' value='<%= pb.getpCode() %>'readonly></td>
	 <td><input type='text' name='pname' value='<%= pb.getpName() %>'readonly></td>
	 <td><input type='text' name='pprice' value='<%= pb.getpPrice() %>'readonly ></td>
	 <td><input type='hidden' name='pqty' value='<%= pb.getpQty()  %>' ></td>
	 <td><input type='text' name='uqty'></td>
	 <td><input type='submit' value='AddToCart'></td>
	 </form>
	 </tr>
	 <%
 }
%>
</table>
     <a href='showcart.jsp'><button>ShowCart<button></a>
	<a href="UserChoice.html"><button>GoBack</button></a>
</body>
</html>