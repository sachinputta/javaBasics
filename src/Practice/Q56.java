package Practice;

/*
56) Write a Java program to create a new string repeating every character twice of a given string.

   Sample Output:

   The given string is: welcome
   The new string is: wweellccoommee

  */
public class Q56 {
	
	static String a1 = new String("welcome");
	
	public static void main(String[] args) {
		
		int x= a1.length();
		 String result = " ";
		for(int i =0; i<= x-1; i++ ) {
			
			result = result + a1.charAt(i);
			
			result = result + a1.charAt(i);
			
		}
		System.out.println( result);
	}
	

}
