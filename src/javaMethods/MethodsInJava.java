package javaMethods;

public class MethodsInJava {
	
	// static and global variable 
	static String myLoc="Hyd";
	// global variable
	int numb1 =1000; 
		
    
	// 3 static methods
	
	public static void method1() {
		String firstName="sachin"; // local variable
		String lastName= "p"; // local variable 
		
		System.out.println("this is static method-1");
		System.out.println(firstName + " " + lastName);

		method2();
		method3();	
				
	}
	public static void method2() {
		System.out.println("this is static method2");
		
		//called static global variable 
		System.out.println(myLoc);
				
			
		}
	public static void method3() {
		System.out.println("this is static method3");
		
		//called non-static variables by creating class object
		MethodsInJava m2= new MethodsInJava();
		System.out.println(m2.numb1);
			
	}
//	
//	
//	// 3 non-static method
	
	public void method4() {
	System.out.println("this is non-static method-4");
	int i=100;
	int m=200;
	System.out.println(i+m);
	method5();
	method6();
	
	
	}
	public void method5() {
		System.out.println("this is non-static method-5");
		
		// accessed the global variable directly
		System.out.println(numb1);
		
		
		}
	public void method6() {
		System.out.println("this is non-static method-6");
		
		// accessed static global variables directly
		System.out.println(myLoc);
		
	}

	public static void main(String[] args) {
		System.out.println("Accessing Class-1");
		//accessing static method
		method1();

		
		// accessing non-static method by creating new class object
		MethodsInJava m1= new MethodsInJava();
		m1.method4();
		
		
		//accessing class-2
//		SecondClass a1 = new SecondClass();
//		a1.class_2();
// 
//		
//		//accessing class-3
//		ThirdClass a2 = new ThirdClass();
//		a2.class_3();
//	    
//		//accessing class-4
//		FouthClass a3 = new FouthClass();
//		a3.class_4();
	

		
		
	}

}






