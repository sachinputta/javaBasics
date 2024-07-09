package loopStatement;


public class class_5 {
	public static void method1(int a, int b) {
		System.out.println("Executed method-1");
		int coins = 0;
		int coinsNeeded = 5; 

		while (coins < coinsNeeded) {
		    coins++;
		
		}

		System.out.println("Enough coins to buy!");
	}
	
	public void method2(int z) {
		System.out.println("Executed method-2");
		while (z<5) {
			System.out.println("Print z as --" + z );
			z++;
		}
		
	}
	
	public static void method3(int j) {
		System.out.println("Executed method-3");
		do {
			 System.out.println("Print j as -- " + j);
			 j++;
		} while(j<=5);
	}
	
	public void method4(int a, int b, int c) {
		System.out.println("Executed method-4");
		for( a=1; a<=5; a++) {
			int z = a+b;
			System.out.println(z);
			if ( c == z) {
				System.out.println("Both c and z are equal");
				break;
			}
		}
		
	}
	

	public static void main(String[] args) {
		
		method1(1,1);
		class_1 h = new class_1();
		h.method2(0);
		method3(1);
		h.method4(1,2,6);
		

	}
}
