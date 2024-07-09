package Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		//type-1
		int a[] = new int[5];
		a[0]= 20;
		a[1]= 120;
		a[2]= 100;
		a[3]= 40;
		a[4]= 60;
		
		for(int i=0; i<5 ;i++) {
			System.out.println(a[i]);
			
		}
		
		
		System.out.println("===================");
		
		
        //type-2
        
        double[] temp = {36.4, 41.1,40.1, 32.3, 31.4};
        
        int tempArray = temp.length;
        
        
        for ( int i =0; i<tempArray; i++) {
        	System.out.println("Temperature : "+temp[i]);
        	if(temp[i]<= 34) {
        		System.out.println("Weather condition is Normal");
        		
        	}
        	else {
        		System.out.println("Too Hot Weather condition...!!!");
        	}
        }
        
        
		

	}

}
