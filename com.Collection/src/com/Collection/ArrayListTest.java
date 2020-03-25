package com.Collection;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(12);
		arrayList.add(10);
		arrayList.add(24);
		arrayList.add(25);		
		arrayList.add(13);
		System.out.println("Array list in backward direction=====>");
		ListIterator<Integer> itr1 = arrayList.listIterator();
		for(int i=arrayList.size()-1;i>=0;i--) {
	
			System.out.println(arrayList.get(i));
		
		}
		
	}

}
