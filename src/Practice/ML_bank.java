package Practice;

public class ML_bank {
	
	String bankName;
	String bankLocation;
	
	// parameterized constructor
	
	public ML_bank(String bankName, String bankLocation) {
		
		this.bankName = bankName;
		this.bankLocation = bankLocation;
		
	}
	
	public void bankDetails() {
		System.out.println("Bank Name :" + bankName);
		System.out.println("Bank Location :" + bankLocation);
		
		}
	
	

}
