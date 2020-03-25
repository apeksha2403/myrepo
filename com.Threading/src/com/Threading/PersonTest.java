package com.Threading;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

class Person implements Comparable<Person>{
	 private double weight;
	 private double height;
	 private String name;
	public Person(double weight, double height, String name) {
		super();
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person person) {
		if(this.weight>person.weight) {
			return -1;
		}
		else if(this.weight<person.weight) {
			return 1;
		}
		else if(this.height>person.height) {
			return -1;
		}
		else if(this.height<person.height) {
			return 1;
		}
		else {
	        return 0;
	} 
}
}
public class PersonTest {

	public static void main(String[] args) {
	TreeSet<Person> treeSet=new TreeSet<Person>();
	treeSet.add(new Person(43,211,"ABC"));
	treeSet.add(new Person(43,156,"XYZ"));
	treeSet.add(new Person(56,215,"PQR"));
   System.out.println( "\n"+treeSet.toString());
	}
}
