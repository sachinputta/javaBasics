package loopStatement;


public class class_4 {
	
	  static int max_kgs = 25;
	  static boolean weight_limit = false;
public static void method1() {
	System.out.println("Executed method-1");
	int i = 10; 
	int j = 15;
	while(i<=j) {
		System.out.println("Executed method-1");
		System.out.println("Print --" + i);
		i++;
	}
	
}

   public static void method2(int b) {
	   System.out.println("Executed method-2");
		for (int i = 1; i <= 2; i++) {
		      System.out.println("outer : " + i); 
		      
		      // Inner loop
		      for (int j = 1; j <= 3; j++) {
		        System.out.println(" inner: " + j );
		      }
		      
			}
		    } 
	public static void method3(int kgs) {
		System.out.println("Executed method-3");
		do {
			if(kgs <= max_kgs)
			{
				System.out.println("luggage weight In limits");
				weight_limit = true;
				break;
			}
			
			System.out.println("luggage is over weight...!!");
		}while(weight_limit);
		
		
		
	}
	
	public void method4(int a, int b, int c) {
		System.out.println("Executed method-4");
		for( a=1; a<=5; a++) {
			int z = a+b;
			System.out.println(z);
			if ( c == z) {
				System.out.println("Matched");
				break;
			}
			else {
				System.out.println("Not Matched");
			}
			
		}
		
	}
 
  
	public static void main(String[] args) {
		
     method1();
     method2(200);
     method3(15);
     class_4 p = new class_4();
     p.method4(1,2,6);
     
	}

}
