package encapsulation;



public class IntializeValues  {
	
	public static void main(String[] args) {

		
		Student s = new Student();
		s.setStudentName("Sachin");
		s.setStudentID("SDB1234");
		s.setGPA(7.8);
		
		System.out.println("Student Name : " +s.getStudentName());
		System.out.println("Student ID : "+s.getStudentID());
		System.out.println("GPA : "+s.getGPA());


	    }

}
