package school;

import java.util.*;

import students.Student;

public class SchoolDataBase {
	private HashSet<Student> studentList;
	private static int studentCount = 0; //incremented every time student is registered
	private static int MAX_STUDENTS_NUMBER = 1000;
	
	public SchoolDataBase() {
		studentList = new HashSet<>();
	}
	
	public HashSet<Student> getDataBase() {
		return studentList;
	}
	
	
	
	public void registerStudent(Student s) {
		boolean check = checkIfInSet(s);
		if (check) {
			System.out.println(s.getfirstName() + "  " + s.getLastName() + " is already registered in the system.");
		} else {
			studentList.add(s);
			studentCount++;
			System.out.println(s.getfirstName() + " " + s.getLastName() + " is registered.");
		}
	}
	
	
	public void removeStudent(Student s) {
		boolean stillExists = checkIfInSet(s);
		
		if (stillExists) {
			studentList.remove(s);
			System.out.println(s.getfirstName() + " " + s.getLastName() + " is no longer registered.");
		} else {
			System.out.println(s.getfirstName() + " " + s.getLastName() + " does not exist in the system.");
		}
	}
	
	
	//return if really redundant
	public boolean checkIfInSet(Student s) {
		return studentList.contains(s);
	}
	
	//return set of students whose GPA is between 1 and 2 inclusive
	public HashSet<Student> getGPASet(double minGPA, double maxGPA) {
		HashSet<Student> studentGPAList = new HashSet<>();
		
		for (Student s : studentList) {
			if(s.getGPA() >= minGPA && s.getGPA() <= maxGPA) {
				studentGPAList.add(s);
			}
		}
		
		return studentGPAList;
		
	}
	
	public HashSet<Student> getStudentsOfOneGPASet(double minGPA) {
		HashSet<Student> studentsWithGPAPassed = new HashSet<>();
		
		for (Student s : studentList) {
			if (s.getGPA() >= minGPA) {
				studentsWithGPAPassed.add(s);
			}
		}
		
		return studentsWithGPAPassed;
	}
	
	//create method for getting students of certain grade
	
	//create method to get students by name between two letters
}
