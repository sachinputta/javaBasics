package Practice;

public class ML_employee extends ML_manager {
	String studentName;
	String studentId;
	
	public ML_employee(String Name, String Location, String managerName, String managerId
			,String studentName,String studentId	) {
		super(Name, Location, managerName, managerId);
		this.studentName = studentName;
		this.studentId = studentId;
		
		
	}
	
	public void employeeDetails() {
		System.out.println("Employee Name : " + studentName);
		System.out.println("Employee Id : " + studentId);
	}
	
	
	public static void main(String[] args) {
		ML_employee s = new ML_employee("Sbi", "Hyd", "Ravi", "sdfg23", "sachin", "sdf@44");
		s.bankDetails();
		s.managerDetails();
		s.employeeDetails();
	}

}
