package Practice;

import java.util.*;



/*
 55) Write a Java program to sort in ascending and descending order by length of the given array of strings.

Original unsorted colors: [Green, White, Black, Pink, Orange, Blue, Champagne, Indigo, Ivory]

Sorted color (descending order): [Champagne, Orange, Indigo, Green, White, Black, Ivory, Pink, Blue]

Sorted color (ascending order): [Pink, Blue, Green, White, Black, Ivory, Orange, Indigo, Champagne]
 */
public class Q55 {
	public static void main(String[] args) {
	
	String[] array = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
	
	// sorted in ascending order
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));

	
	// sorted in descending order 
	String  array2[]=  new String[0];
//	System.out.println(array.length);
	 array2 = Arrays.copyOf(array2, array.length);
	for(int i=array.length-1 ,j=0; i>=0; i--, j++) {
		
//		System.out.println((array[i]));
		array2[j] = array[i];
		
		
	}
	
	System.out.println(Arrays.toString(array2));
	
	
	
	}
	
}
