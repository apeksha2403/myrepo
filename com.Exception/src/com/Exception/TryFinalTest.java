package com.Exception;
import java.util.*;
public class TryFinalTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		try {
			int z=x/y;
			System.out.println(z);
		}
		finally {
			System.out.println("Try final block test done.");
		}

	}

}
