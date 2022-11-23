package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/updateproduct")
public class AdminUpdateProduct extends HttpServlet
{
 protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 {
	 HttpSession hs=req.getSession();
	 if(hs==null)
	 {
		 req.getRequestDispatcher("SessionExpired.jsp").forward(req, res);
	 }
	 else
	 {
		 int k=new DAO().updateProduct(req);
		 req.setAttribute("update", k);
		 if(k>0)
		 {
			 req.getRequestDispatcher("updateproduct.jsp").forward(req, res);
		 }
		 else
		 {
			 req.getRequestDispatcher("updateproduct.jsp").forward(req, res); 
		 }
	 }
 }
}
