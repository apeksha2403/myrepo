package com.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

public class FirstLetter {

	public static void printList(List<String> list) {
		  for(String i:list){
				System.out.println(i);
			}  
	  }

public static void main(String[] args) {
Consumer<List<String>> modify = list -> {
for (int i = 0; i < list.size(); i++)
list.set(i, list.get(i));
};

Consumer<List<String>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

List<String> list = new ArrayList<String>();
list.add("computer");
list.add("java");
list.add("abcd");
//modify.accept(list);
//dispList.accept(list);
Iterator<String> itr = list.iterator();
while (itr.hasNext()) {
String name = itr.next();
System.out.print(name.charAt(0));
}

}
}


