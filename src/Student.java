
public class Student {
	
	String firstName;
	String lastName;
	int graduateYear;
	double gpa;
	String major;
	
	public Student(String firstName, String lastName, 
			int graduateYear, double gpa, 
			String major) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.graduateYear = graduateYear;
		this.gpa = gpa;
		this.major = major;
	}
	
//	public int incrementGraduateYear() {
//		int graduateYear = this.graduateYear;
//		this.graduateYear = graduateYear + 1;
//		return this.graduateYear;
//	}

	public void incrementGraduateYear() {
		this.graduateYear = this.graduateYear + 1;
	}
		
}
