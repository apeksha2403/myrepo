package com.lambda;
import java.util.function.*;

public class ArithmeticTest {

	public static void main(String[] args) {
	MathOperation addition=(a,b)->a+b;
	MathOperation subtraction=(a,b)->a-b;
	MathOperation multiplication=(a,b)->a*b;
	MathOperation division=(a,b)->a/b;
	System.out.println("Addition= "+addition.operation(10,12));
	System.out.println("Subtraction= "+ subtraction.operation(10,12));
	System.out.println("Multiplication= "+multiplication.operation(10,5));
	System.out.println("Division= "+division.operation(10,5));
	}

}
@FunctionalInterface
interface MathOperation{
	int operation(int a,int b);
}