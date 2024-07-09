package JavaConstructors;

public class EmployeeDetails {
	
	String employeeName;
	String companyName;
	String companyLocation;
	String employeeId;
	float monthlySalary;
	String employeeDesignation;
	int employeeExperience;
	
	
	
	
	// parameterized constructor
	
	public EmployeeDetails(String empName,String compName,String compLocation,String empId,
	int empSalary,String empDesignation,int empExp) {
		// return type of these  constructor is no return type
		this.employeeName = empName;
		this.companyName = compName;
		this.companyLocation = compLocation;
		this.employeeId = empId;
		this.monthlySalary = empSalary;
		this.employeeDesignation = empDesignation;
		this.employeeExperience = empExp;	
	}

	
    // Method to calculate the annual salary
    public  float calculateAnnualSalary() {
    	float z = (this.monthlySalary * 12)/100000; // in lpa
        return z;
        
    }
	

	
	// method for employee Details
	public void empDetails() {
		
		System.out.println("Employee Name: " + employeeName );
		System.out.println("Company Name: " + companyName );
		System.out.println("Company Location: " + companyLocation );
		System.out.println("Employee ID: " + employeeId );
		System.out.println("Monthly Salary: Rs " + monthlySalary );	
		System.out.println("Employee Designation: " + employeeDesignation );
		System.out.println("Employee Experience: " + employeeExperience + " yrs" );
		System.out.println("Annual Salary: Rs " + calculateAnnualSalary() + " LPA");
		System.out.println("****-----------------******" );
			
		
	}
	
	

	public static void main(String[] args) {
		
		//Employee Details
	
		EmployeeDetails example1 = new EmployeeDetails("Sachin","W3softech","Hyderabad","Inf123",30000,"Developer",1);
		EmployeeDetails example2 = new EmployeeDetails("Ravi","Wipro","Hyderabad","wp153",55000,"Developer",3);	
		EmployeeDetails example3 = new EmployeeDetails("Kiran","TechM","Delhi","TM143",44000,"Developer",2);
		EmployeeDetails example4 = new EmployeeDetails("Virat","LTIM","Pune","LTM143",40000,"Developer",2);
		EmployeeDetails example5 = new EmployeeDetails("Suresh","Tcs","Bangalore","Tcs1233",78000,"Developer",4);
		
		example1.empDetails();
		example2.empDetails();
		example3.empDetails();
		example4.empDetails();
		example5.empDetails();
	}

}
