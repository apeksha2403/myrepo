package com.Collection;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return 2524;
	}
	@Override
	public boolean equals(Object d) {
		Date d2=(Date)d;
		if(this.day==d2.day&&this.month==d2.month)
		return true;
		else
		return false;
	}
	
	
}
public class HashMapTest {

	public static void main(String[] args) {
		
	ConcurrentHashMap<Date,String> hashMap=new ConcurrentHashMap<Date,String>();
	Date dt1=new Date(24,03,1998);
	Date dt2=new Date(24,03,1999);
	Date dt3=new Date(13,10,2000);
      hashMap.put(dt1,"Abc");
      hashMap.put(dt2,"Xyz");
      hashMap.put(dt3,"Pqr");
      
      
      Iterator trav=hashMap.entrySet().iterator();
      while(trav.hasNext())
      {
         Map.Entry record=(Map.Entry)trav.next(); 
    
         System.out.println(record.getValue() + "–>" + record.getKey() );
      }
    
      String s=hashMap.get(dt2);
  	System.out.println("Call ="+s);
	}
	

}
