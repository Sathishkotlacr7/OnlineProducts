package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/viewusers")
public class ViewAllUsers extends HttpServlet
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
	 ArrayList<Bean> al=new DAO().allUsers();
	 if(al==null)
	 {
		pw.println("No Records"); 
	 }
	 else
	 {
		 Spliterator<Bean> sp=al.spliterator();
		 pw.println("<table border='5' align='center'  style='width:500px;'>");
	     pw.println("<caption><h3>All User's</h3></caption>");
	     pw.println("<th>UserName</th>");
	     pw.println("<th>PassWord</th>");
         pw.println("<th>FirstName</th>");
         pw.println("<th>SecondName</th>");
         pw.println("<th>MailId</th>");
         pw.println("<th>MobileNo</th>");
         pw.println("<th>Address</th>");
   	     pw.println("<tr>"); 
		 sp.forEachRemaining((k)->
		 {
			
			Bean bb=(Bean)k;
			pw.println("<td>"+bb.getuName()+"</td>");
			pw.println("<td>"+bb.getpWord()+"</td>");
			pw.println("<td>"+bb.getfName()+"</td>");
			pw.println("<td>"+bb.getlName()+"</td>");
			pw.println("<td>"+bb.getAddr()+"</td>");
			pw.println("<td>"+bb.getMailId()+"</td>");
			pw.println("<td>"+bb.getPhNO()+"</td>");
			pw.println("</tr>");
			
		 });
		   pw.println("</table>");
		pw.println("<button onclick='history.back()'>Go Back</button>");
	 }
	 }
	 
 }
}
