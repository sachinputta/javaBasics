package Practice;


/* 
 52) Write a Java program that checks the letters of the second string are present in the first string. Return true otherwise false.

Input the first string: "Java"
Input the second string: "Ja"
Check first string contains letters from the second string: "true"
 */
public class Q52 {
	
	static String  input1 ="Java";
	static String input2 = "Ja";
	public static void main(String[] args) {
		
		if(input1.contains(input2)) {
			System.out.println(true);
			
		}
		else {
			System.out.println(false);
		}
		
	}

}
