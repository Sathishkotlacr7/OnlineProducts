package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateAdmin extends HttpServlet
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
	  int k=new DAO().updateUser(req);
	  if(k>0)
	  {
	   req.getRequestDispatcher("Adminview.jsp").forward(req, res);
	  }
	  else
	  {
	    //NotUpdated
		  req.getRequestDispatcher("UserChoice.html").include(req, res);
	  }
  }
 }
}
