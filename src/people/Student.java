package people;

import java.util.concurrent.atomic.AtomicInteger;

public class Student {
	private int age;
	private String firstName;
	private String lastName;
	private double gpa;
	private int gradeLevel;
	private static int studentsCreated = 0;
	private static final AtomicInteger ID = new AtomicInteger();
	String studentId;
	
	
	public Student(String fName, String lName, int age, double gpa, int gradeLevel) {
		firstName = fName;
		lastName = lName;
		this.age = age;
		this.gpa = gpa;
		this.gradeLevel = gradeLevel;
		studentsCreated++;
		studentId = generateUniqueId();
	}
	
	public static String generateUniqueId() {
		return String.valueOf(ID.incrementAndGet());
	}
	
	//getters and setters
	
	public int getAge() {
		return age;
	}
	public void changeAge(int newAge) {
		age = newAge;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void changeFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void changeLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public void changeGPA(int newGPA) {
		gpa = newGPA;
	}
	
	public int getGradeLevel() {
		return gradeLevel;
	}
	
	public void changeGradeLevel() {
		gradeLevel++;
	}
	
	public int getStudentsCreated() {
		return studentsCreated;
	}
	
	public String getId() {
		return studentId;
	}
	
	public String toString() {
		return String.format("Name: %S %S\nAge: %d\nGrade: %d\nGPA: %.2f", firstName, lastName, age, gradeLevel, gpa);
	}
}
