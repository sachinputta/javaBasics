package Exceptions;

public class Exception3 {
	
	public void numCheck(int a) {
		
		if(a < 1) {
			throw new ArithmeticException("Number is Negative");
		}
		else {
			System.out.println("Number is Positive");
			System.out.println("Square :" + (a*a));
			
		}
	}
	
	public static void main(String[] args) {
		Exception3 r = new Exception3();
		r.numCheck(2);
		
	}
	
	

}
