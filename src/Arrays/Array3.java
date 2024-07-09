package Arrays;

public class Array3 {
	
public static void main(String[] args) {
	
	String Details [][]= {{"Sachin", "Hyd","TG"},
			{"Rahul","Guntur","AP"},
			{"Ramesh","Medak","TG"},
			{"Guru","Bangalore","KA"}};
	
	for(int i=0; i<4; i++) {
		for (int j=0;j<3;j++) {
			
			System.out.print(Details[i][j] + "  ");
		}
		
		System.out.println();
		
		
	}
	
	System.out.println("=================");
	// belonging to particular state
	for(int i=0;i<4;i++) {
		if(Details[i][2]=="TG") {
			System.out.println("Name : "+Details[i][0]);
		}
	}
	
	
	
}


	
}
