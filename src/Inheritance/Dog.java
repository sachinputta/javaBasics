package Inheritance;

public class Dog extends Animals{
	
	public Dog(String Name, int age) {
		super(Name,age);  // accessing the superclass Fields
			
	}
	
	
	public void animalDetails() {
		super.animalDetails();  //accessing the superclass method
		
	}
	
	//method overriding
	
	public void makeSound() {
	System.out.println("Sound : Barking....!!!");
		
		
	}

	public static void main(String[] args) {
		
		//creating a new object
		
		Dog d= new Dog("Atlas", 2);
		d.animalDetails();
		d.makeSound();
		
		

	}

}
