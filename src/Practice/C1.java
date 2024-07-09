package Practice;

public class C1 {
 
	String Name;
	int age;
	int e;
	int g;
	int b;
	
	public C1(String Name, int age) {
		
		this.Name = Name;
		this.age = age;
		
	}
    public C1(int e, int g, int b) {
		
		this.e =e;
		this.g = g;
		this.b = b;
		
	}
	
	public void details() {
		System.out.println("Name :" + Name);
		System.out.println("Age :" +age);
		
	}
	
	public void sum() {
		System.out.println(e+g+b);
	}
	
	public static void main(String[] args) {
		
		C1 h= new C1("Ravi",23 );
		h.details();
		
		
		C1 g= new C1(10,23,12 );
		g.sum();
	
	}
	
}
