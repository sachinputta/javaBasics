package Inheritance;

public class School {
	
	String name;
	int age;
	
	
	//constructor
	public School(String name, int age) {
		this.name = name;
		this.age = age;
			
	}
	
	public void displaydetails() {
		
		System.out.println("School Name : XYZ Model school ");
		System.out.println("Teacher Name :" + name );
		System.out.println("Age: " + age);
	}



}
