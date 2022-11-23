package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/addproduct")
public class InsertProduct extends HttpServlet
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
		 int k=new DAO().insertproduct(req);
		 req.setAttribute("insert", k);
		 if(k>0)
		 {
			 req.getRequestDispatcher("insertProduct.jsp").forward(req, res);
		 }
		 else
		 {
			 req.getRequestDispatcher("insertProduct.jsp").forward(req, res);
		 }
	 }
 }
}
