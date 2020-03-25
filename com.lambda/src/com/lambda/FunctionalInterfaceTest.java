package com.lambda;
import java.util.function.*;
import java.util.*;
public class FunctionalInterfaceTest {
  public static void printList(List<Integer> list) {
	  for(Integer i:list){
			System.out.println(i);
		}
	  
  }
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(25);
		list.add(24);
		
       Predicate<List<Integer>> pr=()->list.isEmpty();
       System.out.println(pr.test());
       
       Consumer<Integer> consumer =	(Integer x)->System.out.println(x);
				printList(list);
				
	   Supplier<Integer> supplier=()->list.indexOf(24);			
	   System.out.println(supplier.get());
				
       Function<Integer,String> function=(Integer i)->i>22?"Greater":"Lesser";
       System.out.println(function.apply(list.get(1)));
	}
}
@FunctionalInterface
interface Predicate<T>{
    boolean test();
}
@FunctionalInterface
interface Consumer<T>{
	void accept(T t);
}

@FunctionalInterface
interface Supplier<T>{
	T get();
}
@FunctionalInterface
interface Function<T,R>{
	R apply(T t);
}