package Operators;


public class ArithmaticOperator {
	int a= 100;
	int b= 200;
	int m1 = 3;
	static int c = 3000;
	
	public void method1() {
		int i=100;
		int m=200;
		
		System.out.println("Arthimatic opeations");
		System.out.println(i+m);
		System.out.println(i-m);

		
	}

	
	
	public static void method2() {
	
		ArithmaticOperator h1 = new ArithmaticOperator();
		
		System.out.println(h1.a * h1.b);
		System.out.println(h1.a/h1.b);
		

		
	}
	
	public static void method3() {

	    if (c == 2000) {
	      System.out.println(" correct");
	   
	    }  else {
	      System.out.println("Incorrect");
	    }
		
	}
	
	
	public  void method4() {
		
	    switch (m1) {
	      case 1:
	        System.out.println("America");
	        break;
	      case 2:
	        System.out.println("Australia");
	        break;
	      case 3:
	        System.out.println("India ");
	        break;
	      default:
	        System.out.println("Nothing");
	        break;
	        
	    }
		
	}


	public static void main(String[] args) {
		
		ArithmaticOperator m1 = new ArithmaticOperator();
		
		m1.method1();
		
		method2();
		method3();
		m1.method4();

	}
	


}
