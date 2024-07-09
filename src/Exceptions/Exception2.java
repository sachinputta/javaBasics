package Exceptions;

public class Exception2 {

public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		int c= 0;
		
		
		try {
			int d = a/c;	
			System.out.println(d);	
		
		}
		catch (Exception e) {
		 
            System.out.println(e.getMessage()); 
        	System.out.println("Exception Occurs");
			
		}
		
		finally {
			int e = a*b;
			System.out.println("Multiply : "+e);
			System.out.println("Total Sum : "+(a+b+c));
		}
		 
		
		
	}

}
