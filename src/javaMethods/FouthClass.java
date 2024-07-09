package javaMethods;

public class FouthClass {
	
	static String str= "Chennai";
	char b4='F';
	float numb1 = 43.44f;
	

	public void class_4() {
		
		
		System.out.println("Accessing class-4");
				
		
		method19();
		method22();
		
				
	}
	
	public static void method19() {
		int i=100;
		int m=200;
		
		System.out.println("this is static method-19");
		System.out.println(i*m);
		method20();
		method21();
		
	}
	
	public static void method20() {
		
		System.out.println("this is static method-20");
		
		// called static global variable
		System.out.println(str);
	}
	public static void method21() {
	
		System.out.println("this is static method-21");
		// called global variable
		SecondClass m2= new SecondClass();
		System.out.println(m2.b4);
	
		
	}
	
	public void method22() {
		System.out.println("this is non-static method-22");
		int i=100;
		int m=200;
		System.out.println(i+m);
		method23();
		method24();
		
		
		}
		public void method23() {
			System.out.println("this is non-static method-23");
			
			// accessed the global variable directly
			System.out.println(numb1);
			
			
			}
		public void method24() {
			System.out.println("this is non-static method-24");
			
			// accessed static global variables directly
			System.out.println(str);
			
		}
	

}
