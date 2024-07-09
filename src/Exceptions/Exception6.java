package Exceptions;

public class Exception6 {

	static int a = 100;
	static int b = 0;
	
	public static void main (String[] args) {
		
		try {
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
