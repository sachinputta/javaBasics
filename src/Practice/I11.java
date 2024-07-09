package Practice;

public class I11 extends I1 {
	
	public I11(String Name, int age) {
		super(Name, age);
		
	}
	
	public void details() {
		super.method1();
		
	}
	 
	
	// method overriding
	
	public void method2() {
		System.out.println("Changed.....!!!!");
	}
	
	public static void main(String[] args) {
		I11 h = new I11("sdf",12);
		h.details();
		h.method2();
	}
	
	
	

}
