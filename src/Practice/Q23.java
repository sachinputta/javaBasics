package Practice;
import java.util.*;

/*
 23).Design a Prime Number between 2 to 30.
 */

public class Q23 {

	public static void main(String[] args) {
			
		
		for (int n=1; n<=30; n++) {
			
			int flag=0;
		int m=n/2;
		if(n==0 || n==1) {
//			System.out.println(n+" is not a prime no");
			flag=1;
		}
		else {
			
			for(int i=2; i<=m; i++) {
				if(n%i == 0) {
//					System.out.println(n+" is not a prime no");
					flag=1;
					
				}
			}
			
			if(flag== 0) {
				System.out.print(n+" ");
			}
		}
		
		
		}
		
}
}