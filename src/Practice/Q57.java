package Practice;


/*
 57) Write a Java program to reverse words in a given string.

Sample Input / Output:

The given string is:= Reverse words in a given string

The new string after reversed the words:= string given a in words Reverse
 
 
 */
public class Q57 {
	
   static String words = "Reverse words in a given string";
   
   public static void main(String[] args) {
	   
	   
	   
	  String [] word = words.split("\\s+");
	  int x = word.length;
//	  System.out.println(x);
	  
	  String result ="";
	  for(int i=x-1; i>=0; i--) {
//		  System.out.println(word[i]);
		  result += word[i] + " ";
	  }
	  System.out.println(result);
	   
	   
	   
   }

}
