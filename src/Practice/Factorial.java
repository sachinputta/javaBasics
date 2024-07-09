package Practice;

public class Factorial {
	
	
	public static void main(String[] args) {
		int i, fact =1;
		int no=4;
		for (i=1; i<=no ; i++) {
			fact = fact *i;
		}
		System.out.println("Factorial of " + no + " is " + fact);
	}

	
 
}
