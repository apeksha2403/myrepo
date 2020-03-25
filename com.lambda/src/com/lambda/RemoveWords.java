package com.lambda;
import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

public class RemoveWords {
	
       public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
        list.add("Abc");
        list.add("Abcd");
        System.out.println("Before: ");
        Consumer<List<String>> con=(List<String> s)->System.out.println(s);
        con.accept(list);
       
        list.removeIf(n -> (n.length() % 2 != 0));
        System.out.println("\nAfter: ");
        con.accept(list);
        
	}

}


