package Practice;

/*
54) Write a Java program to remove a specified character from a given string.
Original string: "abcdefabcdeabcdaaa"

remove char from given string :  "a"

Output string: "bcdefbcdebcd"
 */
public class Q54 {
 static String str = "abcdefabcdeabcdaaa";
 
 public static void main(String[] args) {
	 
	 String output ="";
	 
	 int x = str.length();
	 for(int i=0; i<=x-1; i++) {
		 
		 String h = Character.toString(str.charAt(i));
		 if( h.equals("a")) {	
			 continue;
		 }
		 else {
			 output = output + h;
		 }
		 
		 System.out.print(h);
	  }
	 
 
 }

}
