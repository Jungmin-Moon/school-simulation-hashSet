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
	
	//returns the studentSet
	public HashSet<Student> getDataBase() {
		return studentList;
	}
	
	
	//adds student to set
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
	
	//removes student from set
	public void removeStudent(Student s) {
		boolean stillExists = checkIfInSet(s);
		
		if (stillExists) {
			studentList.remove(s);
			System.out.println(s.getfirstName() + " " + s.getLastName() + " is no longer registered.");
		} else {
			System.out.println(s.getfirstName() + " " + s.getLastName() + " does not exist in the system.");
		}
	}
	
	
	//return bool if student exists in the set
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
	
	//returns set of students who match the minGPA
	public HashSet<Student> getStudentsOfOneGPASet(double minGPA) {
		HashSet<Student> studentsWithGPAPassed = new HashSet<>();
		
		for (Student s : studentList) {
			if (s.getGPA() >= minGPA) {
				studentsWithGPAPassed.add(s);
			}
		}
		
		return studentsWithGPAPassed;
	}
	
	//method for getting students of certain grade
	public HashSet<Student> getStudentsOfGrade(int exactGradeLevel) {
		HashSet<Student> studentListGradeLevel = new HashSet<>();
		
		for (Student s : studentList) {
			if (s.getGradeLevel() == exactGradeLevel) {
				studentListGradeLevel.add(s);
			}
		}
		
		return studentListGradeLevel;
	}
	
	//method to get students between grade level range
	public HashSet<Student> getListByGradeInclusive(int minGradeLevel, int maxGradeLevel) {
		HashSet<Student> listTwoGradesInclusive = new HashSet<>();
		
		for (Student s : studentList) {
			if (s.getGradeLevel() >= minGradeLevel && s.getGradeLevel() <= maxGradeLevel) {
				listTwoGradesInclusive.add(s);
			}
		}
		
		return listTwoGradesInclusive;
	}
	
	//method to get students by name between two letters first name
	public HashSet<Student> firstNameStartInclusive(char letter1, char letter2) {
		HashSet<Student> listFirstNameInclusive = new HashSet<>();
		
		for (Student s : studentList) {
			if (s.getfirstName().charAt(0) >= letter1 && s.getfirstName().charAt(0) <= letter2) {
				listFirstNameInclusive.add(s);
			}
		}
		
		return listFirstNameInclusive;
	}
}
