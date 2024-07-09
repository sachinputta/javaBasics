package Exceptions;

public class Custom1 {

	 public static void checkValue(int value) throws CustomException {
	        if (value > 10) {
	            throw new CustomException("Value is too high!");
	        }
	        System.out.println("Value is: " + value);
	       
	    }
	 
	 public static void main(String[] args) {
	        try {
	            
	            checkValue(15);
	        } catch (CustomException e) {
	          
	            System.out.println("Caught MyException....!!");
	            System.out.println(e);
	        }
	        finally {
	        	 System.out.println( "Hello....!!!!");
	        }
	    } 
	 
}
