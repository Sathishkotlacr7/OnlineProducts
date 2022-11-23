package test;
import java.util.*;
import java.sql.*;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class DAO 
{
	public ArrayList<CartBean> al1=new ArrayList<CartBean>();
	public int k=0;
	public VisaBean vb=null;
 public Bean ab=null;
 public ArrayList<ProductBean> al=new ArrayList<ProductBean>();
 public ArrayList<Bean> al2=new ArrayList<Bean>();
 public Bean adminCheck(ServletRequest req)
 {
	 try
	 {
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement
				 ("Select * From Admin48 where username=? and password=?");
		 ps.setString(1, req.getParameter("uname"));
		 ps.setString(2, req.getParameter("pword"));
		 ResultSet rs=ps.executeQuery();
		 if(rs.next())
		 {
			 ab=new Bean();
			 ab.setuName(rs.getString(1));
			 ab.setpWord(rs.getString(2));
			 ab.setfName(rs.getString(3));
			 ab.setlName(rs.getString(4));
			 ab.setAddr(rs.getString(5));
			 ab.setMailId(rs.getString(6));
			 ab.setPhNO(rs.getLong(7));
		 }
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return ab;
 }
 public Bean userCheck(ServletRequest req)
 {
	 try
	 {
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement
				 ("Select * From user48 where username=? and password=?");
		 ps.setString(1, req.getParameter("uname"));
		 ps.setString(2, req.getParameter("pword"));
		 ResultSet rs=ps.executeQuery();
		 if(rs.next())
		 {
			 ab=new Bean();
			 ab.setuName(rs.getString(1));
			 ab.setpWord(rs.getString(2));
			 ab.setfName(rs.getString(3));
			 ab.setlName(rs.getString(4));
			 ab.setAddr(rs.getString(5));
			 ab.setMailId(rs.getString(6));
			 ab.setPhNO(rs.getLong(7));
		 }
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return ab;
 }
 public int updateUser(ServletRequest req)
 {
	 try
	 {
		Bean be=(Bean)req.getServletContext().getAttribute("Bean");
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement
			 ("update user48 set username=?,password=?,fname=?,lname=?,address=?,mailid=?,phno=? where username=? and password=?");
		 ps.setString(1, req.getParameter("uname"));
		 ps.setString(2, req.getParameter("pword"));
		 ps.setString(3, req.getParameter("fname"));
		 ps.setString(4, req.getParameter("lname"));
		 ps.setString(5, req.getParameter("addr"));
		 ps.setString(6, req.getParameter("mid"));
		 ps.setLong(7, Long.parseLong(req.getParameter("phno")));
		 ps.setString(8, be.getuName());
		 ps.setString(9, be.getpWord());
		 k=ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return k;
 }
 public int updateAdmin(ServletRequest req)
 {
	 try
	 {
		Bean be=(Bean)req.getServletContext().getAttribute("Bean");
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement
			 ("update Admin48 set username=?,password=?,fname=?,lname=?,address=?,mailid=?,phno=? where username=? and password=?");
		 ps.setString(1, req.getParameter("uname"));
		 ps.setString(2, req.getParameter("pword"));
		 ps.setString(3, req.getParameter("fname"));
		 ps.setString(4, req.getParameter("lname"));
		 ps.setString(5, req.getParameter("addr"));
		 ps.setString(6, req.getParameter("mid"));
		 ps.setLong(7, Long.parseLong(req.getParameter("phno")));
		 ps.setString(8, be.getuName());
		 ps.setString(9, be.getpWord());
		 k=ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return k;
 }
 public int insert(ServletRequest req)
 {
	 try
	 {
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement
				 ("insert into USer48 values(?,?,?,?,?,?,?)");
		 ps.setString(1, req.getParameter("uname"));
		 ps.setString(2, req.getParameter("pword"));
		 ps.setString(3, req.getParameter("fname"));
		 ps.setString(4, req.getParameter("lname"));
		 ps.setString(5, req.getParameter("addr"));
		 ps.setString(6, req.getParameter("mid"));
		 ps.setLong(7, Long.parseLong(req.getParameter("phno")));
		 k=ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return k;
 }
 public int delete1(ServletRequest req)
 {
	 try
	 {
		 Bean be=(Bean)req.getServletContext().getAttribute("Bean");
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement("delete from USer48 where username=? and password=? and fname=? and lname=? and address=? and mailid=? and phno=?");
		 ps.setString(1, be.getuName());
		 ps.setString(2, be.getpWord());
		 ps.setString(3, be.getfName());
		 ps.setString(4, be.getlName());
		 ps.setString(5, be.getAddr());
		 ps.setString(6, be.getMailId());
		 ps.setLong(7, be.getPhNO());
		 k=ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return k;
 }
 public ArrayList<ProductBean> AllProducts()
 {
	 try
	 {
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement
				 ("Select * from Products48");
		 ResultSet rs=ps.executeQuery();
		 while(rs.next())
		 {
			 ProductBean pb=new ProductBean();
			 pb.setpCode(rs.getString(1));
			 pb.setpName(rs.getString(2));
			 pb.setpPrice(rs.getFloat(3));
			 pb.setpQty(rs.getInt(4));
			 al.add(pb);
		 } 
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return al;
 }
 public ArrayList<CartBean> Addcart(ServletRequest req,ServletResponse res)
 {
	 try
	 {
	 CartBean cb=new CartBean();
	 cb.setPcode(req.getParameter("pcode"));
	 cb.setPname(req.getParameter("pname"));
	 double price=Double.parseDouble(req.getParameter("pprice"));
	 cb.setPprice(price);
	 long pqty=Long.parseLong(req.getParameter("pqty"));
	 cb.setPqty(pqty);
	 long uqty=Long.parseLong(req.getParameter("uqty"));
	 cb.setUqty(uqty);
	 Double tamt=price*uqty;
	 if(uqty>pqty)
	 {
		 req.setAttribute("avlqty", pqty);
		 req.setAttribute("uqty", uqty);
		 req.getRequestDispatcher("QtyExceeds.jsp").forward(req, res);
	 }
	 cb.setTprice(tamt);
	 al1.add(cb);
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return al1;
 }
 public  ArrayList<Bean>  allUsers()
 {
	 try
	 {
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement
				 ("Select * From User48");
		 ResultSet rs=ps.executeQuery();
		while(rs.next())
		 {
			 Bean be7=new Bean();
			 be7.setuName(rs.getString(1));
			 be7.setpWord(rs.getString(2));
			 be7.setfName(rs.getString(3));
			 be7.setlName(rs.getString(4));
			 be7.setAddr(rs.getString(5));
			 be7.setMailId(rs.getString(6));
			 be7.setPhNO(rs.getLong(7));
			 al2.add(be7);
		 }
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return al2;
 }
 public int updateProduct(ServletRequest req)
 {
	 try
	 {
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement
				 ("update PRODUCTS48 set  PRODUCTPRICE=?, PRODUCTQTY=? where PRODUCTCODE=?");
		 ps.setDouble(1, Double.parseDouble(req.getParameter("pprice")));
		 ps.setLong(2, Long.parseLong(req.getParameter("pqty")));
		 ps.setString(3, req.getParameter("pcode"));
		 k=ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return k;
 }
 public int insertproduct(ServletRequest req)
 {
	 try
	 {
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement
				 ("insert into ProductS48 values(?,?,?,?)");
		 ps.setString(1, req.getParameter("pcode"));
		 ps.setString(2, req.getParameter("pname"));
		 ps.setFloat(3, Float.parseFloat(req.getParameter("pprice")));
		 ps.setLong(4, Long.parseLong(req.getParameter("pqty")));
		 k=ps.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return k;
 }
 public VisaBean VerifyCard(ServletRequest req)
 {
	 try
	 {
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement
          ("select*from visa Where  CARDHOLDER =? and CARDNO=? and EXPMONTH=?  and EXPYEAR=? and cvv=?");
		 ps.setString(1, req.getParameter("cholder"));
		 ps.setLong(2, Long.parseLong(req.getParameter("cno")));
		 ps.setString(3, req.getParameter("expmonth").toUpperCase());
		 ps.setLong(4, Long.parseLong(req.getParameter("expyear")));
		 ps.setLong(5, Long.parseLong(req.getParameter("cvv")));
		 ResultSet rs=ps.executeQuery();
		 while(rs.next())
		 {
		   vb=new VisaBean();
		   vb.setCardHolder(rs.getString(1));
		   vb.setCardNo(rs.getLong(2));
		   vb.setExpMonth(rs.getString(3));
		   vb.setExpYear(rs.getLong(4));
		   vb.setCardAmt(rs.getDouble(5));
		   vb.setCvv(rs.getLong(6));
		 }
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return vb;
 }
 public int CardAmtCut(ServletRequest req,VisaBean vb,ServletResponse res)
 {
	 try
	 {
		 Connection con=DBConnection.getConn();
		 PreparedStatement ps=con.prepareStatement
          ("Update visa set amount=amount-? Where  CARDHOLDER =? and CARDNO=? and EXPMONTH=? and  AMOUNT=? and EXPYEAR=? and cvv=?");
		double amt=(double)req.getServletContext().getAttribute("bill");
		double amt1=vb.getCardAmt();
		if(amt1<amt)
		{
			req.getRequestDispatcher("LowAmount.jsp").forward(req, res);
		}
		else
		{
		 ps.setDouble(1, amt);
		 ps.setString(2, vb.getCardHolder());
		 ps.setLong(3,  vb.getCardNo());
		 ps.setString(4, vb.getExpMonth());
		 ps.setDouble(5, vb.getCardAmt());
		 ps.setLong(6, vb.getExpYear());
		 ps.setLong(7, vb.getCvv());
		 k=ps.executeUpdate();
		}
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return k;
 }
}