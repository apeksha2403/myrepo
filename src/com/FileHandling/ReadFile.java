package com.FileHandling;
import java.io.*;
public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		File file = new File("F://IBM//B.txt");
		FileInputStream fis = new FileInputStream(file);
		
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		do {
		i = fis.read();
		if(i != -1)
		sb.append((char)i);
		}
		while(i != -1);
		System.out.println("File contents:  " + sb);
		
		
		String s=new String(sb);
		File file1= new File("F://IBM//A.txt");
		FileOutputStream fos = new FileOutputStream(file1);
		fos.write(s.getBytes());
		fos.flush();
		fos.close();
		fis.close();
		  
		
		
		
	}

}
