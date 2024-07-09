package javaMethods;

public class ThirdClass {
	static String str= "Mumbai";
	char b4='F';
	int numb1 = 3400;
	

	public void class_3() {
		
		
		System.out.println("Accessing class-3");
				
		
		method13();
		method16();
		
				
	}
	
	public static void method13() {
		int i=100;
		int m=200;
		
		System.out.println("this is static method-13");
		System.out.println(i*m);
		method14();
		method15();
		
	}
	
	public static void method14() {
		
		System.out.println("this is static method-14");
		
		// called static global variable
		System.out.println(str);
	}
	public static void method15() {
	
		System.out.println("this is static method-15");
		// called global variable
		SecondClass m2= new SecondClass();
		System.out.println(m2.b4);
	
		
	}
	
	public void method16() {
		System.out.println("this is non-static method-16");
		int i=100;
		int m=200;
		System.out.println(i+m);
		method17();
		method18();
		
		
		}
		public void method17() {
			System.out.println("this is non-static method-17");
			
			// accessed the global variable directly
			System.out.println(numb1);
			
			
			}
		public void method18() {
			System.out.println("this is non-static method-18");
			
			// accessed static global variables directly
			System.out.println(str);
			
		}
	
	
}
