package Practice;

public class SL11 extends SL1 {
	
	public void dogName() {
		System.out.println("Hero");
		
	}
	
	public void makeSound() {
			
		System.out.println("Bark");
		
	}
	
	public static void main(String[] args) {
		SL11 h = new SL11();
		h.dogName();
		h.eat();
		h.makeSound();

	}
	

}
