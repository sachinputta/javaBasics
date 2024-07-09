package loopStatement;


public class class_3 {
	
	String new1 = "green";
	static boolean b1 = false;
	static int max_allowed = 4;
	static int n= 10;
	
	
	public static void method1() {
		for (int i = 1; i <= 5; i++) {
		        System.out.println("Vehicle No: " + i);      
				if (i==max_allowed) {
				System.out.println("max vehicle allowed only -- " + i );
				break;
				
			}
		    } 	
	}
	
	public static void method2(int d) {
		do {
			
			System.out.println("checking clear..!!!" );
			b1 = true;
			d++;
			if (d== (max_allowed + 1) ) {
					
				b1= false;
			}
			System.out.println("Vehicle allowed..!!!" );
			
		}while(b1);
	}
	
	public void method3() {
		while(n>=max_allowed) {
			System.out.println("Vehicle No in queue -- " + n );
			n--;
			
		}
	}
	
	public static void method4() {
	

		for (int i = 1; i <= 5; i++) {
		      System.out.println("Vehicle No: " + i); 
		      
		      // Inner loop
		      for (int j = 1; j <= 1; j++) {
		        System.out.println(" Vehicle owner: " + j +" " + "Vehicle license " + (j*j));
		      }
		      
				if (i==max_allowed) {
				System.out.println("max vehicle allowed only -- " + i );
				break;
				
			}
		    } 
		
	}
	
	

	public static void main(String[] args) {
		method1();
		method2(1);
		class_3 h = new class_3();
		h.method3();
		method4();

	}

}
