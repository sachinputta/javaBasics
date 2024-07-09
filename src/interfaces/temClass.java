package interfaces;

public class temClass implements Celebrity {

	@Override
	public void TempleDetails1(String Name, String City, String State) {
		System.out.println("Temple-1 : " + Name );
		System.out.println("City : " + City + ", " + "State : " + State );
		System.out.println("-------------------" );
		
	}

	@Override
	public void TempleDetails2(String Name, String City, String State) {
		System.out.println("Temple-2 : " + Name );
		System.out.println("City : " + City + ", " + "State : " + State );
		System.out.println("-------------------" );

		
	}

	@Override
	public void celebrityDetails(String Name) {
		System.out.println("Celebrity Name : " + Name );
		
	}
	
	public static void main(String[] args) {
		temClass t = new temClass();
		t.TempleDetails1("Brihadeeswarar Temple", "Thanjavur", "Tamilnadu");
		t.TempleDetails2("Meenakshi Temple", "Madurai", "Tamilnadu");
		t.celebrityDetails("Sachin");
			
	}

}
