package test;
import java.sql.*;
public class DBConnection 
{
 private static Connection con=null;
 private DBConnection()
 {
	 //Default Private COnstructor
 }
 static
 {
	 try
	 {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 con=DriverManager.getConnection
				 ("jdbc:oracle:thin:@localhost:1522:orcl","C##SATHISH","SATHISHCR7");
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }//end-static
 public static Connection getConn()
 {
	 return con;
 }
}
