package ControlStatements;

public class SwitchStatement {
	
	static int day = 2;
	
	
	int m1 =3;
	int b = 1;
	
	
	public static void method1() {
		
	    switch (day) {
	      case 1:
	        System.out.println("Monday");
	        break;
	      case 2:
	        System.out.println("Tuesday");
	        break;
	      case 3:
	        System.out.println("Wednesday");
	        break;
	      default:
	        System.out.println("Nothing");
	     
	    }
		
	}
	
	


public  void method2() {
		
	    switch (b) {
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
	     
	        
	    }
		
	}


public static void method3() {
	 String e = "abc";
   switch (e) {
     case  "abc" :
       System.out.println("abc");
       break;
     case "def":
       System.out.println("def");
       break;
     case "ghi":
       System.out.println("ghi");
       break;
     default:
       System.out.println("Nothing");
    
       
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
      
        
    }
	
}



	
	public static void main(String[] args) {

		
		method1();
		
		
		SwitchStatement z = new SwitchStatement();
		z.method2();
		
		method3();
		z.method4();
		
	}

}
