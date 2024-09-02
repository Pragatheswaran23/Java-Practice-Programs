package Programs;

public class Student {
	
	String studentName;
	String studentId;
	double percentage;
	
	public Student(String studentName, String studentId, double percentage){
		this.studentName = studentName;
		this.studentId = studentId;
		this.percentage = percentage;
	}

	public String toString() {
		
		return "Student Name : " + studentName + "\nStudent ID : " + studentId + "\nPercentage : " + percentage;
	}

}
