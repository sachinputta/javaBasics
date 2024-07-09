package interfaces;

public class lawClass implements Lawyer {

	@Override
	public void professionName(String Name, String location) {
		System.out.println("Profession : " + Name );
		System.out.println("Location : " + location );
		
	}

	@Override
	public void lawyerDetails(String Name, int Experience) {
		System.out.println("Name : " + Name );
		System.out.println("Experience : " + Experience );
		
	}
	
	public static void main(String[] args) {
		Profession.method1();
		lawClass l = new lawClass();
		l.professionName("Lawyer", "Hyderabad");
		l.lawyerDetails("Ramu", 5);
		
	}

}
