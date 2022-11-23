<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

/* Set a style for all buttons */
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  position: relative;
}

img.avatar {
  width: 20%;
  border-radius: 20%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
  padding-top: 60px;
}
.button1 {width: 100px;}
.button {
  border: none;
  color: white;
  padding:left;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 20px;
  margin: 4px 2px;
  cursor: pointer;
}
/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}

/* Add Zoom Animation */
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s;
  width: 40%;
  height: 80%
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 ArrayList<CartBean> al=(ArrayList<CartBean>)application.getAttribute("cart");
 Iterator<CartBean> it=al.iterator();
 %>
     <table>
	 <caption>Cart List</caption>
	 <tr>
	 <th>ProductName</th>
	 <th>ProductPrice</th>
	 <th>Entered Quantity</th>
	 <th>TotalAmt</th>
	 </tr>
	 
 <%
 while(it.hasNext())
 {
	 CartBean cb=(CartBean)it.next();
	 %>
	 <tr>
	 <td><%= cb.getPname() %></td>
	 <td><%= cb.getPprice() %></td>
	 <td><%= cb.getUqty() %></td>
	 <td><%= cb.getTprice() %></td>
	 </tr>
	 <%
 }
%>
</table>
<%! double  amt=0; %>
<%
 ArrayList<Double> al1=(ArrayList<Double>)application.getAttribute("amount");
 Iterator<Double> it1=al1.iterator();
 while(it1.hasNext())
 {
	 Double d=(Double)it1.next();
	 amt=amt+d.doubleValue();
 }
 application.setAttribute("bill", amt);
 %>
	 <h3>Amount:<%=amt%></h3>
	 <a href="payment.jsp" class="button button1"><button>Payment</button></a>
<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Generate Bill</button>
<a href="viewproducts1.jsp" class="button button1" ><button>Back</button></a>
<div id="id01" class="modal">
  
  <form class="modal-content animate" action="#" method="post">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="user.png" alt="Avatar" class="avatar">
    </div>
    <div class="container">
    <%
Bean be=(Bean)request.getServletContext().getAttribute("Bean");
%>
<table>
<tr>
<th>Name</th>
<th>Address</th>
<th>MailId</th>
<th>MobileNumber</th>
</tr>
<tr>
<td><%=be.getuName()%></td>
 <td> <%=be.getAddr()%></td>
 <td><%=be.getMailId()%></td>
<td><%=be.getPhNO()%></td>
</tr>
</table>
      <%
 ArrayList<CartBean> al3=(ArrayList<CartBean>)application.getAttribute("cart");
 Iterator<CartBean> it3=al3.iterator();
 %>
     <table>
	 <caption>Ordered List</caption>
	 <tr>
	 <th>ProductName</th>
	 <th>ProductPrice</th>
	 <th>Entered Quantity</th>
	 <th>TotalAmt</th>
	 </tr>
	 
 <%
 while(it3.hasNext())
 {
	 CartBean cb=(CartBean)it3.next();
	 %>
	 <tr>
	 <td><%= cb.getPname() %></td>
	 <td><%= cb.getPprice() %></td>
	 <td><%= cb.getUqty() %></td>
	 <td><%= cb.getTprice() %></td>
	 </tr>
	 <%
 }
%>
</table>
	 <h3>Amount:<%=amt%></h3>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
    </div>
  </form>
  <a href="payment.jsp" class="button button1"><button>Payment</button></a>
</div>
<script>
// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>
</body>
</html>