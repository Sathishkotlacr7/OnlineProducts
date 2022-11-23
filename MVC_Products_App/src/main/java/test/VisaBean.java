package test;
import java.io.*;
@SuppressWarnings("serial")
public class VisaBean implements Serializable
{
 private String CardHolder,ExpMonth;
 private long CardNo,ExpYear,cvv;
 public long getCvv() {
	return cvv;
}
public void setCvv(long cvv) {
	this.cvv = cvv;
}
private double CardAmt;
 public VisaBean()
 {
	 
 }
public String getCardHolder() {
	return CardHolder;
}
public void setCardHolder(String cardHolder) {
	CardHolder = cardHolder;
}
public String getExpMonth() {
	return ExpMonth;
}
public void setExpMonth(String expMonth) {
	ExpMonth = expMonth;
}
public long getCardNo() {
	return CardNo;
}
public void setCardNo(long cardNo) {
	CardNo = cardNo;
}
public long getExpYear() {
	return ExpYear;
}
public void setExpYear(long expYear) {
	ExpYear = expYear;
}
public double getCardAmt() {
	return CardAmt;
}
public void setCardAmt(double cardAmt) {
	CardAmt = cardAmt;
}
}
