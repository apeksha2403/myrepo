package com.FileHandling;
import java.io.*;
import java.io.Serializable;
class Date implements Serializable {
	private static final long serialVersionUID = 1l;
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
     @Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
   	  }
}
class NewAcc implements Serializable{
	private static final long serialVersionUID = 1l;
	private transient String name;
	private int account_no;
	private Date dob;
	public NewAcc(String name, int account_no, Date dob) {
		super();
		this.name = name;
		this.account_no = account_no;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", account_no=" + account_no + ", dob=" + dob + "]";
	}
}
public class SerializationTest {
     
	public static NewAcc writeObject() throws Exception{
		File file = new File("F:\\IBM\\FileList\\abc.txt");
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(new NewAcc("Name",123,new Date(24,3,1998)));
		out.flush();
		out.close();
		return null;
		
	}
	public static  NewAcc  readObject() throws Exception{
		File file = new File("F:\\IBM\\FileList\\abc.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		NewAcc account=(NewAcc)ois.readObject();
		System.out.println("Account "+account);
		ois.close();
		return account;
		
	}
	public static void main(String[] args) throws Exception {
		writeObject();
	    readObject();
		System.out.println("Done...");

	}

}
