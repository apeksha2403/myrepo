package com.Exception;
import java.util.*;
import java.util.Scanner;
public class MultipleTry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		try {
			System.out.println("Divison:");
			int div=x/y;
			System.out.println("Division= "+div);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
