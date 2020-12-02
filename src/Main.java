import java.util.Scanner;
import java.awt.Rectangle;

public class Main {
	public static void main(String[] args) {
		int studentAge = 15;
		double studentGPA = 3.45;
		boolean hasPerfectAttendance = true;
		String studentFirstName = "Tomohiro";
		String studentLastName = "Yoshida";
		char studentFirstInitial = studentFirstName.charAt(0);
		char studentLastInitial = studentLastName.charAt(0);
		
		System.out.println(studentAge);
		System.out.println(studentGPA);
		System.out.println(studentFirstInitial);
		System.out.println(studentLastInitial);
		System.out.println(hasPerfectAttendance);
		
		System.out.println(studentFirstName + " " + 
		studentLastName + " has a GPA of " + studentGPA);
		
		System.out.println("What do you want to update it to?");
		
		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();
		
		System.out.println(studentFirstName + " " + 
				studentLastName + " has a GPA of " + studentGPA);
		
		System.out.println("**************************************");
		
		Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
		Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
		
		double triangleAArea = triangleA.findArea();
//		System.out.println(triangleAArea);
		
		double triangleBArea = triangleB.findArea();
//		System.out.println(triangleBArea);
//		
//		System.out.println(triangleA.sideLenThree);
//		System.out.println(triangleA.base);
//		
//		System.out.println(Triangle.numOfSides);
		
		Student studentA = new Student("Tomohiro", "Yoshida", 2021, 4.2, "WMDD");
		
		System.out.println(studentA.firstName);
		System.out.println(studentA.lastName);
		System.out.println(studentA.graduateYear);
		System.out.println(studentA.gpa);
		System.out.println(studentA.major);
		
		studentA.incrementGraduateYear();
		
		System.out.println(studentA.graduateYear);
		
		System.out.println(new Rectangle());
	}

}
