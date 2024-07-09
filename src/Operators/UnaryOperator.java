package Operators;

public class UnaryOperator {
	
	int a= 100;

	
	public void method1() {
		System.out.println("Unary Operation");
		System.out.println("Post prefix");
		
		// post prefix
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		
		
		}
	
	public static void method2(int b) {
		// prefix
		
		System.out.println("Prefix");
		
				System.out.println(b); //200
				System.out.println(++b); //201
				System.out.println(b); // 201
				System.out.println(--b);// 200
				
	}
	public  void method3() {
		
		System.out.println("Tenary Operation");
		int a= 5;
		int b= 10;
		
		int c = (a<b) ? a:b;
		System.out.println(c);
		
		
	}
	
	public static void method4() {
		
		int x= 566;
		int y= 3455;
		
		String c = (x>y) ? "Hyderabad":"Bangalore";
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
	
		UnaryOperator z = new UnaryOperator();
		z.method1();
		method2(200);
		z.method3();
		method4();
	}

}
