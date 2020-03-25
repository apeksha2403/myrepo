package com.Collection;
import java.util.*;

import com.Collection.Date;
class Employee{
	private String name;
	private int id;
	private double salary;
	
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return 2524;
	}
	@Override
	public boolean equals(Object ob) {
		return true;
		
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		HashMap<Integer,Employee> hashMap=new HashMap<Integer,Employee>();
		Employee e1=new Employee("ABC",123,10000);
		Employee e2=new Employee("XYZ",124,13000);
		hashMap.put(1,e1);
		hashMap.put(2,e2);
		
		 Employee s=hashMap.get(2);
		  	System.out.println(s);
		  	System.out.println(hashMap.get(1).hashCode());
		  	System.out.println((hashMap.get(1)).equals(hashMap.get(2)));
		

	}

}
