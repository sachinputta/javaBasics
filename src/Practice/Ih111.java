package Practice;

public class Ih111 implements Ih11 {



	@Override
	public void method2(String Name) {
		System.out.println("Name :" + Name);
		
	}

	@Override
	public void method3(int age) {
		System.out.println("age :" + age);
		
	}
	
	public static void main(String[] args) {
		
		Ih1.method1();
		Ih111 g = new Ih111();
		g.method2("Sachin");
		g.method3(25);
	}

}
