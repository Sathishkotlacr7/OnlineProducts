package test;
import java.io.*;
@SuppressWarnings("serial")
public class Bean implements Serializable
{
 private String uName,pWord,fName,lName,Addr,mailId;
 private long phNO;
 public Bean()
 {
	 //Default Constructor
 }
public String getuName() {
	return uName;
}
public void setuName(String uName) {
	this.uName = uName;
}
public String getpWord() {
	return pWord;
}
public void setpWord(String pWord) {
	this.pWord = pWord;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getAddr() {
	return Addr;
}
public void setAddr(String addr) {
	Addr = addr;
}
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public long getPhNO() {
	return phNO;
}
public void setPhNO(long phNO) {
	this.phNO = phNO;
}
 
}
