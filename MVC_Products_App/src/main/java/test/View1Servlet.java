package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class View1Servlet extends HttpServlet
{
 protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 {
	 HttpSession hs=req.getSession(false);
	 if(hs==null)
	 {
		 req.getRequestDispatcher("SessionExpired.jsp").forward(req, res);
	 }
	 else
	 {
	    req.getRequestDispatcher("view.jsp").forward(req, res);
	 }
 }
}
