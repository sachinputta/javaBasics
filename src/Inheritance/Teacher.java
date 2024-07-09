package Inheritance;

public class Teacher extends School {

	String subjectName;
	public Teacher(String name, int age,String subjectName) {
		
		super(name, age);
		this.subjectName = subjectName;
		
	}
	
	
	public void teacherDetails() {
		super.displaydetails();
		System.out.println("Subject :" + subjectName);
		
	}
	
//	public static void main (String[] args) {
//		Teacher t1= new Teacher("Suresh", 34,"Mathematics");
//		t1.teacherDetails();
//	}

	

}
