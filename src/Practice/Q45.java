package Practice;

import java.util.*;



/*
 45).Find out factors of given numbers. n=34
 */

public class Q45 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the n :" );
		int input = scanner.nextInt();
		for (int i=1; i<=input; i++) {
			
			if (input%i == 0) {
			System.out.println( i);
			}
		}
		
		scanner.close();
	}
	
}
