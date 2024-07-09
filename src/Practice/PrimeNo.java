package Practice;

public class PrimeNo {
	
	public static void CheckPrime(int n) {

		int i, m=0, flag=0;
		
		m = n/2;
		if( n==0 || n==1) {
			System.out.println(n+ " is not a prime no");
		}
		else {
			for(i=2; i<=m; i++)
			{
				if(n%i == 0) { // module function
					System.out.println(n+ " is not a prime no");
					flag =1 ;
					break;
				}
			}
			
			if (flag== 0) {
				System.out.println(n+ " is  a prime no");
			}
		}
				
		
	}
	
	public static  void main(String[] args) {
		
		CheckPrime(1);
		CheckPrime(3);
		CheckPrime(7);
		CheckPrime(20);
		
	}

}
