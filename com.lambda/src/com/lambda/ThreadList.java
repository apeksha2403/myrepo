package com.lambda;
import java.util.*;
import java.util.function.*;
public class ThreadList extends Thread{
	public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
	 
     Runnable runnable=new Runnable() {
     public void run() {
    	 list.add(12);
         list.add(13);
         list.add(14);
         Consumer<List<Integer>> con=(List<Integer> i)->System.out.println(i);
         con.accept(list);
         
     }
     };
	
     Thread t=new Thread(runnable);
     t.start();
	}

}
