package Operators;

public class AssignmentOperators {

	  String light = "Red";
	
	public static void method1(int a) {
		
		a += 100;
		a *= 4;	
		
		System.out.println("Assignment Operation");
		System.out.println(a);

		
		if (a >= 1000) {
			System.out.println("It's true");
		}
		else {
			System.out.println("It's false");
		}
			
		
	}
	
	public static void method2(int b) {
		
		b -= 100;
		b /= 5;
		System.out.println(b);
		
		if (b <= 20) {
			System.out.println("It's true");
		}
		else {
			System.out.println("It's false");
		}
		
	}
	
	public  void method3() {
		
		System.out.println("Tenary Operation");
		int a= 5;
		int b= 5;
		
		String c = (a <= b) ? "It's equal":"Not equal";
		System.out.println(c);
		
		
	}
	
	
	public  void method4() {
		
	    switch (light) {
	      case "Red":
	        System.out.println("Please Stop!!!");
	        break;
	      case "Green":
	        System.out.println("You can go...!!");
	        break;
	  
	      default:
	        System.out.println("Please go slow...!!");
	        
	    }
	    }
	
	public static void main(String[] args) {
		
		method1(100);
		method2(200);
		AssignmentOperators n1 = new AssignmentOperators();
		n1.method3();
		n1.method4();
	

	}

}
