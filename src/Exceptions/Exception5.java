package Exceptions;

public class Exception5 {
	
	public void eligible(int age) throws Exception {
		if(age <60) {
			throw new ArithmeticException("Not a Senior Citizen");
		}
		else {
			System.out.println("Senior Citizen");
		}
		
	}
	
    // Run time exception -- using throws 
	public static void main(String[] args) throws Exception {
		
		Exception5 h = new Exception5();
		h.eligible(5);
		
	}
	
	
	
	
	// compile time exception -- handle with try and catch
//	public static void main(String[] args)  {
//		
//		Exception5 h = new Exception5();
//		try {
//			h.eligible(5);
//		} catch (Exception e) {
//		
//			System.out.println(e);
//		}
//			
//		}
//		
	

}
