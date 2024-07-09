package encapsulation;

public class Student {
    // Private attributes
    private String studentName;
    private String studentID;
    private double GPA;

    // Public getter for student name
    public String getStudentName() {
        return studentName;
    }

    // Public setter for student name
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Public getter for student ID
    public String getStudentID() {
        return studentID;
    }

    // Public setter for student ID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Public getter for GPA
    public double getGPA() {
        return GPA;
    }

    // Public setter for GPA with validation
    public void setGPA(double GPA) {

            this.GPA = GPA;
      
    }
    


}

