package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericNumberList{
	 public static void printlist(List<? extends Number> list) {
		 for(Object ele:list) {
			 System.out.println(ele+"\t");
		 }
	 }
  
	public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	List<Double> list1=new ArrayList();
     list.add(24);
     list.add(25);
     list.add(13);
     list1.add(24.0);
     printlist(list);
     printlist(list1);
	}

}
