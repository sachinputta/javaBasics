package Practice;

/* Write a java program for palindrome in normal way as well as using Command line arguments.
i/p="MADAM"
o/p MADAM is a Palindrome*/

public class Q6 {

	static String str = "MADAM";

	public static void main(String[] args) {

		String str2 = "";

		int x = str.length();

		for (int i = x - 1; i >= 0; i--) {

			str2 += str.charAt(i);
		}
		System.out.println("String -1 :" + str);
		System.out.println("String -2 :" + str2);

		if (str.equals(str2)) {
			System.out.println(str2 + " is a Palindrone");
		} else {
			System.out.println(str2 + " is a not Palindrone");
		}

	}

}
