package com.Exception;
import java.util.*;
import java.util.Scanner;
public class NestedTryCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		try {
			int z=x/y;
			System.out.println(z);
			try {
				int z1=x1/y1;
				System.out.println(z1);
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
	}

}
