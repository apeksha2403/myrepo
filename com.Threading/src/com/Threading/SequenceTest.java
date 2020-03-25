package com.Threading;
import java.io.*;
public class SequenceTest {

	public static void main(String[] args) throws Exception {
		FileInputStream fin1=new FileInputStream("F:\\IBM\\FileList\\A.txt");
		FileInputStream fin2=new FileInputStream("F:\\IBM\\FileList\\B.txt");
		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		StringBuilder sb=new StringBuilder("");
		int i=0;
		do {
			i=sis.read();
			if(i!=-1)
				sb.append((char)i);
			   
		}
		while(i!=-1);
		System.out.println("File contents: "+sb);
		sis.close();
		fin1.close();
		fin2.close();
		

	}

}
