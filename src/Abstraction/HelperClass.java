package Abstraction;

public class HelperClass {
	
	public demo1 getOutput() {
		demo1 result = new demo2();
		return result;
		
	}
	
	public static void main(String[] args) {
		
		HelperClass helperClass= new HelperClass();
		demo1 output =helperClass.getOutput();
		output.method1("Venkateshwara Temple");
		output.method2("Hyderabad");
		output.method3("Telangana");
		
	}

}
