package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/pay")
public class PaymentCard extends HttpServlet
{
 protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 {
	 HttpSession hs=req.getSession();
	 if(hs==null)
	 {
		 req.getRequestDispatcher("SessionExpired.jsp").forward(req, res);
	 }
	 else
	 {
		 VisaBean vb=new DAO().VerifyCard(req);
		 req.getServletContext().setAttribute("visa", vb);
		 if(vb==null)
		 {
			 req.getRequestDispatcher("InvalidCard.jsp").forward(req, res);
		 }
		 else
		 {
			 req.getRequestDispatcher("AmountCuted.jsp").forward(req, res);
		 }
	 }
 }
}
