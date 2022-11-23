package test;
import java.io.*;
@SuppressWarnings("serial")
public class CartBean implements Serializable
{
 private String pname,pcode;
 private long pqty,uqty;
 private double pprice,tprice;
 public CartBean() {}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPcode() {
	return pcode;
}
public void setPcode(String pcode) {
	this.pcode = pcode;
}
public long getPqty() {
	return pqty;
}
public void setPqty(long pqty) {
	this.pqty = pqty;
}
public long getUqty() {
	return uqty;
}
public void setUqty(long uqty) {
	this.uqty = uqty;
}
public double getPprice() {
	return pprice;
}
public void setPprice(double pprice) {
	this.pprice = pprice;
}
public double getTprice() {
	return tprice;
}
public void setTprice(double tprice) {
	this.tprice = tprice;
}
}
