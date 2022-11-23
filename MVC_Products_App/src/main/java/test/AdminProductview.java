package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/adminproductview")
public class AdminProductview extends HttpServlet
{
 protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 {
	 PrintWriter pw=res.getWriter();
	 res.setContentType("text/html");
	 HttpSession hs=req.getSession();
	 if(hs==null)
	 {
		 req.getRequestDispatcher("SessionExpired.jsp").forward(req, res);
		
	 }
	 else
	 {
		 ArrayList<ProductBean> al=new DAO().AllProducts();
		 if(al.isEmpty())
		 {
			 req.getRequestDispatcher("EmptyRecords1.jsp").forward(req, res);
		 }
		 else
		 {
		 Spliterator<ProductBean> sp=al.spliterator();
         pw.println("<table border='5' align='center'  style='width:500px;'>");
	     pw.println("<caption><h3>All Products</h3></caption>");
         pw.println("<th>ProductCode</th>");
         pw.println("<th>ProductName</th>");
         pw.println("<th>ProductPrice</th>");
         pw.println("<th>ProductQTY</th>");
         pw.println("<th>Update</th>");
   	    pw.println("<tr>");
	 sp.forEachRemaining((k)->
	 {
		ProductBean bb=(ProductBean)k;
	
		  pw.println("<form action='updateproduct' method='post'>");
		 pw.println("<td><input type='text' name='pcode' value='"+bb.getpCode()+"' readonly></td>");
		 pw.println("<td><input type='text' name='pname' value='"+bb.getpName()+"' readonly></td>");
		 pw.println("<td><input type='text' name='pprice' value='"+bb.getpPrice()+"'></td>");
		 pw.println("<td><input type='text' name='pqty' value='"+bb.getpQty()+"'></td>");
		 pw.println("<td><input type='submit' value='update'></td>");
		 pw.println("</tr>");
		 pw.println("</form>");
	 });
       pw.println("</table>");
	 }
	 }
 }
}
