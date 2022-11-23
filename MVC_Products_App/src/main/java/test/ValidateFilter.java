 package test;
 import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebFilter("/Login")
public class ValidateFilter implements Filter
{
	public ArrayList<Double> al=new ArrayList<Double>();
	public  ArrayList<CartBean> al1=new ArrayList<CartBean>();
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException 
	{	
	 	String str=req.getParameter("log");
	 	if(str.equals("ALogin"))
	 	{
	 		Bean be=new DAO().adminCheck(req);
	 		if(be==null)
	 		{
	 			
	 			req.getRequestDispatcher("Invalid.jsp").include(req, res);
	 		}
	 		else
	 		{
	 			req.getServletContext().setAttribute("Bean", be);
	 			chain.doFilter(req, res);
	 		}
	 	}
	 	else if(str.equals("ULogin"))
	 	{
	 		Bean be=new DAO().userCheck(req);
	 		if(be==null)
	 		{
	 			req.getRequestDispatcher("Invalid.jsp").include(req, res);
	 		}
	 		else
	 		{
	 			req.getServletContext().setAttribute("amount", al);
	 			req.getServletContext().setAttribute("cart", al1);
	 			req.getServletContext().setAttribute("Bean", be);
	 			chain.doFilter(req, res);
	 		}
	 	}
	}
}
