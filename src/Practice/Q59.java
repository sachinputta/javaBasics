package Practice;

import java.util.*;

/*
 
59) Write a Java program to test if a given string contains the specified sequence of char values.

Original String: PHP Exercises and Python Exercises                                                           
Specified sequence of char values: "and"                                                                        
output : true

 */
public class Q59 {
	static String str= "PHP Exercises and Python Exercises";
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a char values: ");
        String input = scanner.nextLine();

		
//		String str2 ="and";
		
		if(str.contains(input)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}		
		
	}

}
