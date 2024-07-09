package loopStatement;

public class class_2 {
    static int total_max = 8;
    
    static boolean subject_passed = false;
    static int passed_marks = 35;
    
    
	public static void method1(int joined) {
		System.out.println("Executed method-1");
		for (joined = 1; joined<= total_max; joined++) {
			System.out.println("Member joined " + joined);
			if (joined == total_max) {
				System.out.println("Members are full");
				break;
			}
		}
	}
			
	public static void method2(int removed) {
		System.out.println("Executed method-2");
		
		for (removed = 15; removed >= total_max; removed--) {
			System.out.println("Member left " + removed);
			if (removed == total_max) {
				System.out.println("Members adjusted acc to capacity");
			}
			
		}
	}

	public void method3(int z) {
		System.out.println("Executed method-3");
		while(z>=6) {
			System.out.println("value -- " + z );
			z--;
						
		}	
	}
	
	public static void method4(int marks) {
		System.out.println("Executed method-4");
		do {
			if(marks >= passed_marks)
			{
				System.out.println("Passed the subject");
				subject_passed = true;
				break;
			}
			
			System.out.println("Failed in subject");
		}while(subject_passed);		
		
	}
	
	
	public static void main(String[] args) {
		method1(1);
		method2(15);
		class_2 b= new class_2();
		b.method3(10);
		
		method4(65);
		

	}

}
