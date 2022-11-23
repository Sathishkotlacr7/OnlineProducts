package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/Login")
public class DispatchServlet1 extends HttpServlet
{
 protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 {
	 String str=req.getParameter("log");
	 Bean be=(Bean)req.getServletContext().getAttribute("Bean");
	 if(str.equals("ALogin"))
	 	{
		 HttpSession hs=req.getSession();
		 hs.setAttribute("fname", be.getfName());
	 	  req.getRequestDispatcher("AdminChoice.html").include(req, res);	
	 	}
	 	else if(str.equals("ULogin"))
	 	{
	 		HttpSession hs=req.getSession();
			 hs.setAttribute("fname", be.getfName());
	 		req.getRequestDispatcher("UserChoice.html").include(req, res);
	 	}
 }
}
