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
table, th, td {
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
  <th>ProductCode</th>
  <th>ProductName</th>
  <th>ProductPrice</th>
  <th>ProductQty</th>
  </tr>
 <%
 while(it.hasNext())
 {
	 ProductBean pb=(ProductBean)it.next();
	 %>
	 <tr>
	 <td><input type='text' name='pcode' value='<%= pb.getpCode() %>' readonly></td>
	 <td><input type='text' name='pname' value='<%= pb.getpName() %>'  readonly></td>
	 <td><input type='text' name='pprice' value='<%= pb.getpPrice() %>'  readonly></td>
	 <td><input type='text' name='pqty' value='<%= pb.getpQty()  %>'  readonly></td>
	 </tr>
	 </table>
	 <%
 
 }
%>
</body>
</html>