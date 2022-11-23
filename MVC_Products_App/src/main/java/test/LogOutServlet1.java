package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/Logout")
public class LogOutServlet1 extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 {
	req.getServletContext().removeAttribute("Bean");
	HttpSession hs=req.getSession();
	hs.removeAttribute("fname");
	hs.invalidate();
    req.getServletContext().removeAttribute("cart");
    req.getServletContext().removeAttribute("amount");
    req.getServletContext().removeAttribute("bill");
	req.getRequestDispatcher("Home.html").include(req, res);
 }
}
