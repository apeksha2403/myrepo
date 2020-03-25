package com.Exception;
class InsufficientBalanceException extends RuntimeException{
	private String message;
	public InsufficientBalanceException() {
		this.message="";
	}
	public InsufficientBalanceException(String message) {
		this.message=message;
	}
	public String toString() {
		return "Insufficent Balance !!!" + message;
	}	
}
public class CustomException {
	public static void withdraw(double balance) throws InsufficientBalanceException{
		if(balance<100) {
			throw new InsufficientBalanceException();

		}
		System.out.println(""+balance);
	}

	public static void main(String[] args) throws InsufficientBalanceException{
		withdraw(200);
      
	}

}
