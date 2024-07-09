package Practice;

public class ML_manager extends ML_bank {
	
	String managerName;
	String managerId;
	
	public ML_manager(String Name, String Location,String managerName,String managerId) {
		super(Name, Location);
		this.managerName = managerName;
		this.managerId = managerId;
		
		
		
	}
	
	public void managerDetails() {
		System.out.println("Manager Name : " + managerName);
		System.out.println("Manager Id : " + managerId);
		
	}
	
	
}
