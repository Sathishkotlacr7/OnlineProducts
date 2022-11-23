package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/Home")
public class DispatchServlet extends HttpServlet
{
 protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 {
	 String str=req.getParameter("v1");
		if(str.equals("AdminLogin"))
		{
			req.getRequestDispatcher("AdminLogin.html").include(req, res);
		}
		else 
		{
			req.getRequestDispatcher("UserLogin.html").include(req, res);
		}
 }
}
