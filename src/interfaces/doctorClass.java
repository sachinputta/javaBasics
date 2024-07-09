package interfaces;

public class doctorClass implements Doctor {

	@Override
	
	public void professionName(String Name, String location) {
		System.out.println("Profession : " + Name );
		System.out.println("Location : " + location );
			
	}

	@Override
	public void doctorDetails(String Name, int Experience, String specialist) {
		System.out.println("Name : " + Name );
		System.out.println("Experience : " + Experience );
		System.out.println("Specialist : " + specialist );
		
	}
	
	public static void main(String[] args) {
		Profession.method1();
		doctorClass l = new doctorClass();
		l.professionName("Doctor", "Bangalore");
		l.doctorDetails("Dr.Srinivasan", 12, "Orthopaedics" );
		
	}

}
