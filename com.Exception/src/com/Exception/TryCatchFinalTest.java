package com.Exception;
import java.util.*;
public class TryCatchFinalTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		try {
			int z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Try catch final block test done.");
		}

	}

}

