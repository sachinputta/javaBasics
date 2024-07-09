package javaMethods;

public class SecondClass {
	
	static String str= "kolkata";
	char b4='C';
	int numb1 = 4000;
	

//	public void class_2() {
//			
//		System.out.println("Accessing class-2");
//				
//		
//		method7();
//		method10();
//		
//				
//	}
	
	public static void method7() {
		int i=100;
		int m=200;
		
		System.out.println("this is static method-7");
		System.out.println(i*m);
		method8();
		method9();
		
	
		
	}
	
	public static void method8() {
		
		System.out.println("this is static method-8");
		
		// called static global variable
		System.out.println(str);
	}
	public static void method9() {
	
		System.out.println("this is static method-9");
		// called global variable
		SecondClass m2= new SecondClass();
		System.out.println(m2.b4);
		
		// calling non-static method to static method
		
		System.out.println("calling non-static method in static");
		SecondClass z1= new SecondClass();
		z1.method11();
		
	
		
	}
	
	public void method10() {
		System.out.println("this is non-static method-10");
		int i=100;
		int m=200;
		System.out.println(i+m);
		method11();
		method12();
		
		
		}
		public void method11() {
			System.out.println("this is non-static method-11");
			
			// accessed the global variable directly
			System.out.println(numb1);
			
			
			
			
			}
		public void method12() {
			System.out.println("this is non-static method-12");
			
			// accessed static global variables directly
			System.out.println(str);
			
			// calling the static method in to non-static 
			System.out.println("calling static method in non-static");
			method7();
			
		}
		
		
		public static void main(String[] args) {
			System.out.println("Accessing class-2");
			
			//accessing static method
			method7();

			
			// accessing non-static method by creating new class object
			SecondClass m1= new SecondClass();
			m1.method10();
					
			
		}
		
	
	
	
	
}
