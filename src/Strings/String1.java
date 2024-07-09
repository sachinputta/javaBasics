package Strings;

public class String1 {
	
	static String str = "A bCd Efg";
	
	public static void main (String[] args) {
		System.out.println("Length of String : "+str.length());
		System.out.println("Is String Empty : "+str.isEmpty());
		System.out.println("Changed to UpperCase : "+str.toUpperCase());
		System.out.println("Changed to LowerCase : "+str.toLowerCase());
		System.out.println("Whether it contains ? :"+str.contains("bCd"));
		System.out.println("Is String Same : "+str.equals("ABCDEFG"));
		System.out.println("Adding the String with : "+str.concat(" hijkl"));
		System.out.println("Ignore EqualsCase : "+str.equalsIgnoreCase("ABCDEFG"));
		System.out.println("Replacement : "+str.replace("C","i"));
		System.out.println("Character at point:"+str.charAt(3));
		System.out.println("Index of : "+str.indexOf("d"));
		System.out.println("Substring : "+str.substring(1,6));
		
	}
	
	

}
