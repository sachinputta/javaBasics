package ControlStatements;


public class IfElse {
	
	int m=100;
	int n=200;

	public static void method1() {
		int a=10;
		int b=20;
		if (a>=b) {
			System.out.println("a");
		}
		else {
			System.out.println("b");
		}
		
		
	}
	
	
	public  void method2()  {
	
		if (m<= 500) {
			System.out.println("m");
		}
		else {
			System.out.println("n");
		}	
	}


	public static void method3() {
		int time = 22;
	    if (time < 10) {
	      System.out.println(" morning.");
	    } else if (time < 18) {
	      System.out.println(" afternoon.");
	    }  else {
	      System.out.println("evening.");
	    }
		
	}
	
	public  void method4() {
		
		if (n>= 500) {
			System.out.println("m");
		}
		else {
			System.out.println("n");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		method1();
		
		IfElse m1 = new IfElse();
		m1.method2();
		
		method3();
		
		m1.method4();
		

	}

}
