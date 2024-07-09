package Exceptions;

public class Exception4  {
	
   
    public int divideNum(int m, int n) throws ArithmeticException {  
        int div = m / n;  
        return div;  
    }  
    

    public static void main(String[] args) {  
        Exception4 h = new Exception4();  
        try {  
            System.out.println(h.divideNum(40, 0));  
        }  
        catch (ArithmeticException e){  
        	System.out.println(e);  
        }  
          
        System.out.println("Hello....!");  
    }  

}
