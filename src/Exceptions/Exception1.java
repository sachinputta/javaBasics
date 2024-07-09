package Exceptions;

public class Exception1 {
	
	static String name;
	
	static String location = "Hyd";
	
	String state = "TG";
	
	public static void main(String[] args) {
		
		
		try {

		System.out.println("Length: " + name.length());
		}
		catch (NullPointerException e) {
		 
            System.out.println(e.getMessage()); 
        	System.out.println("Enter the Name...!!!");
			
		}
		
		finally {
			
			System.out.println("Location : " + location);
			
			Exception1 h = new Exception1();
			System.out.println("State : "+ (h.state));
		}
		 
		
	}
	
}
