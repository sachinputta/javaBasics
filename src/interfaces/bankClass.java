package interfaces;

public class bankClass implements Employee {
	
	@Override
	public void bankName(String bnkName, String brchCode) {
		System.out.println("Bank Name :" + bnkName );
		System.out.println("Branch code :" + brchCode );
		
	}

	@Override
	public void bankManager(String Name, String managerID) {
		System.out.println("Manager Name :" + Name );
		System.out.println("Manager ID :" + managerID );	
		
	}

	

	@Override
	public void bankEmployee(String Name, String empID) {
		System.out.println("Employee Name :" + Name );
		System.out.println("Employee ID :" + empID );
		
	}
	
	public static void main(String[] args) {
		
		bankClass b = new bankClass();
		b.bankName("SBI","SBIN123");
		b.bankManager("Sachin", "SBI33442");
		b.bankEmployee("Ravi", "SBI34123");
		
	}
	
	
	
	

}
