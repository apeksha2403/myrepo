package com.Collection;

import java.util.HashSet;
import java.util.*;
import java.util.Iterator;


public class HashTest {

	public static void main(String[] args) {
		System.out.println("HashSet====> Unorderd");
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(54);
		hashSet.add(254);
		hashSet.add(25);
		hashSet.add(24);
		Iterator<Integer> itr = hashSet.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println(i);
		}
		
		
		System.out.println("LinkedHashSet====> Orderd");
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
		linkedHashSet.add(54);
		linkedHashSet.add(254);
		linkedHashSet.add(25);
		linkedHashSet.add(24);
		Iterator<Integer> itr1 = linkedHashSet.iterator();
		while(itr1.hasNext()) {
			int i1 = itr1.next();
			System.out.println(i1);
		}

	}

}
