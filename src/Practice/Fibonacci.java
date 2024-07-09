package Practice;

public class Fibonacci {
	
	public static void main(String[] args) {
		int n1=0,n2= 1, count =10,i,n3, sum =0 ;
		
		
		//sum of n natural number
		
		for (i=1; i<=count; i++) {
			sum = sum +i;
			
		}
		System.out.println("summation : " + sum);
		
		
		// fibonacci
		 
		
		System.out.print(n1+" "+n2);
		
		for(i=2; i<count; i++) {
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1= n2;
			n2=n3;
		}
		

	 
	}

}
