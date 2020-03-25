package com.FileHandling;
import java.io.*;
public class FileDetails {
	
		 static void RecursivePrint(File[] arr,int index,int level)  
	     {  
	         if(index == arr.length) 
	             return; 
	            
	         for (int i = 0; i < level; i++) 
	             System.out.print("\t"); 
	           
	   
	         if(arr[index].isFile()) {
	             System.out.println(arr[index].getName()); 
	             System.out.println(arr[index]. list());
	             System.out.println(arr[index]. length());
	             System.out.println(arr[index].canRead());
	             System.out.println(arr[index].canWrite());
	             System.out.println(arr[index]. getPath());
	             
	         }
	   
	         else if(arr[index].isDirectory()) 
	         { 
	             System.out.println("[" + arr[index].getName() + "]"); 
	               
	      
	             RecursivePrint(arr[index].listFiles(), 0, level + 1); 
	         } 
	            
	    
	         RecursivePrint(arr,++index, level); 
	    } 
	
public static void main(String[] args) throws FileNotFoundException, IOException {
		String path="F:\\IBM\\FileList";
		File dir = new File(path);
				if(dir.exists() && dir.isDirectory()) 
		        {
		         File arr[]=dir.listFiles();
		         System.out.println("Files Name: ");
	       
		         RecursivePrint(arr,0,0);

	}
}
}
