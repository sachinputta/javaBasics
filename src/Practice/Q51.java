package Practice;

import java.util.*;
/*
 51)Write a Java program to get the character (Unicode code point) at the given index within the String
 */
public class Q51 {
	
	static String name="sAchin";
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the char Values :");
	int input = scanner.nextInt();
	
	System.out.println(name.codePointAt(input));

	
	}

}
