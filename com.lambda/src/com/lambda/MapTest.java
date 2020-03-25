package com.lambda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class MapTest {
	  public static void printMapKeyValues(Map<String,String> hmap) {
		  Iterator trav=hmap.entrySet().iterator();
		    StringBuilder sb=new StringBuilder("");
	      while(trav.hasNext())
	      {
	         Map.Entry record=(Map.Entry)trav.next(); 
	         sb.append(record.getKey());
	         sb.append(record.getValue());   
	      }
		  System.out.println("String with all key and values together= "+sb);
	  }
	public static void main(String[] args) {
	Map<String,String> hmap=new HashMap<String,String>();
	hmap.put("A","abc");
	hmap.put("B","def");
	hmap.put("C","ghi");
	printMapKeyValues(hmap);
	}
	}




