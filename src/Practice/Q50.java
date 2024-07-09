package Practice;
import java.util.Scanner;

/*
 50)Write a Java program to get the character at the given index within the String
 */


public class Q50 {
	
	static String name ="Sachin";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter a char values: ");
		int input = scanner.nextInt();
		System.out.println(name.charAt(input));

	}

	
	

}
