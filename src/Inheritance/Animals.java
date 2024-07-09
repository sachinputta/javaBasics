package Inheritance;

public class Animals {
	
	String Name;
	int age;

	
	public Animals(String Name, int age) {
		this.Name= Name;
		this.age = age;

		
	}
	
	public void animalDetails() {
		System.out.println("Name :" + Name );
		System.out.println("Age :" + age );
		
	
	}
	
	public void makeSound() {
		System.out.println("Give Animal Sound...." );
	}


}
