package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/cart")
public class Cart extends HttpServlet
{  
	@SuppressWarnings({ "unchecked" })
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{	
		
		ArrayList<CartBean> al=(ArrayList<CartBean>)req.getServletContext().getAttribute("cart");
		 CartBean cb=new CartBean();
		 cb.setPcode(req.getParameter("pcode"));
		 cb.setPname(req.getParameter("pname"));
		 double price=Double.parseDouble(req.getParameter("pprice"));
		 cb.setPprice(price);
		 long pqty=Long.parseLong(req.getParameter("pqty"));
		 cb.setPqty(pqty);
		 long uqty=Long.parseLong(req.getParameter("uqty"));
		 cb.setUqty(uqty);
		 double tamt=(price*uqty);
		 cb.setTprice(tamt);
		 req.setAttribute("tamt", tamt);
		 if(uqty>pqty)
		 {
			 req.setAttribute("avlqty", pqty);
			 req.setAttribute("uqty", uqty);
			 req.getRequestDispatcher("QtyExceeds.jsp").forward(req, res);
		 }
		 else
		 {
		 al.add(cb);
		 ArrayList<Double> al1=(ArrayList<Double>)req.getServletContext().getAttribute("amount");
		 al1.add(tamt);
		 req.getRequestDispatcher("AddedToCart.jsp").forward(req, res);
		 }
		
	}
}
