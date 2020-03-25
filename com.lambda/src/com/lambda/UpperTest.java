package com.lambda;
import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

public class UpperTest {
	/*
	 public static void printList(List<String> list) {
		  for(String i:list){
				System.out.println(i);
			}
		  
	  }
	 */
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
        list.add("Abc");
        list.add("Abcd");
        Consumer<List<String>> consumer= (List<String> list1)->System.out.println(list);
        System.out.println("Before: ");
        consumer.accept(list);
     
      list.replaceAll(list1->(list1.toUpperCase()));
        
        System.out.println("\nAfter: ");
        consumer.accept(list);
	}

}
