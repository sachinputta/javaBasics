package Inheritance;

public class Student extends Teacher{


	String name;
	int age;
	String subjectName;
	String studentName;
	String studentId;
	
	
	public Student(String name, int age, String subjectName,String studentName,String studentId) {
		super(name,age, subjectName);
		this.studentName = studentName;
		this.studentId = studentId;
		
	}
	
	public void studentDetails() {
		super.teacherDetails();
		System.out.println("StudentName : " + studentName);
		System.out.println("StudentId : " + studentId);
	}

	public static void main(String[] args) {
		  Student s1 = new Student("Suresh", 34,"Mathematics","Kiran","DFF566");
	        s1.studentDetails();
	        
	}

}
