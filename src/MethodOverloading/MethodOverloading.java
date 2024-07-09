package MethodOverloading;

public class MethodOverloading {
	
	public static void  Subtraction(int a, int b) {

	if(a>b) {
		int c = a-b;
		System.out.println("Subtracton-1 :" + c);
		System.out.println("The Greatest number is: " + a);
		
	}
	else if(b>a) {
		int c = b-a;
		System.out.println("Subtracton-1   :" + c);
		System.out.println("The Greatest number is: " + b);
	}
	else {
		System.out.println("Both a and b are same ");
		System.out.println("a = "+ a + " ; " + "b = " + b);
	}
	}

	public static void  Subtraction(double a, double b) {
		
		if(a>b) {
			double c1 = a-b;
			System.out.println("Subtracton-2  :" + c1);
			System.out.println("The Greatest number is: " + a);
			
		}
		else if(b>a) {
			double c1 = b-a;
			System.out.println("Subtracton-2  :" + c1);
			System.out.println("The Greatest number is: " + b);
		}
		else {
			System.out.println("Both a and b are same ");
			System.out.println("a = "+ a + " ; " + "b = " + b);
		}
		
		}
			

	public void Subtraction(int num1, int num2, int num3) {
       
        // Checking the biggest of three numbers
		int biggest;
		
        if (num1 > num2 && num1 > num3) {
            biggest = num1;    
            int result =  (num1 - num2-num3);
            System.out.println("Subtracton-3 :" + result);
                      
//        	System.out.println(num1-num2);
//        	System.out.println(num1-num3);
             
        }
        else if(num1 >= num2 && num2 >= num1) {
        	biggest = num1; 
        	
        	System.out.println("num1 :"+num1 +" and " + "num2 :"+num2 + " are equal");
       
        }
        
        else if(num2 >= num3 && num3 >= num2) {
        	biggest = num2; 
        	
        	System.out.println("num2 :"+num2 +" and " + "num3 :"+num3 +" are equal");
        	
        }
        
        else if(num3 >= num1 && num1 >= num3) {
        	biggest = num3; 
        	
        	System.out.println("num1 :"+num1 +" and " + "num3 :"+num3 +" are equal");
        	
        }
        else if((num2 > num1 ) && (num2>num3)) {
        	biggest = num2;
            
            int result =  (num2 - num1-num3);
            System.out.println("Subtracton-3 :" + result);

	
        }
        
        
        else if((num2 > num1 ) && (num2>num3)) {
        	biggest = num2;
            
            int result =  (num2 - num1-num3);
            System.out.println("Subtracton-3 :" + result);
	
        }
        
        
        else {
        	biggest = num3;	
           
            int result =  (num3 - num1-num2);
            System.out.println("Subtracton-3 :" + result);     
        
        }
        
        System.out.println("The Greatest number is: " + biggest);
        
	}
	

	public static void main(String[] args) {
        Subtraction(10,100);
        Subtraction(15d,150d);
        MethodOverloading n1 = new MethodOverloading();
        n1.Subtraction(1,15,15);
        
       
	}
	

}
