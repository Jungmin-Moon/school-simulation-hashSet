package school;

import java.util.*;

import people.Student;

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
	
	//returns List of students who first name starts with passed in char
	public ArrayList<Student> firstNameStart(char letter) {
		ArrayList<Student> listFirstNameStart = new ArrayList<>();
		
		for (Student s : studentList) {
			if (s.getfirstName().charAt(0) == letter) {
				listFirstNameStart.add(s);
			}
		}
		
		return listFirstNameStart;
	}
	
	//returns list of students who last name starts with firstLetter and secondLetter inclusive
	public ArrayList<Student> lastNameStartInclusive(char firstLetter, char secondLetter) {
		ArrayList<Student> lastNameListInclusive = new ArrayList<>();
		
		for (Student s : studentList) {
			if (s.getLastName().charAt(0) >= firstLetter && s.getLastName().charAt(0) <= secondLetter) {
				lastNameListInclusive.add(s);
			}
		}
		
		return lastNameListInclusive;
	}
	
	//returns list of students last name starts with char only
	public ArrayList<Student> lastNameStart(char letter) {
		ArrayList<Student> listLastNameStart = new ArrayList<>();
		
		for (Student s : studentList) {
			if (s.getLastName().charAt(0) == letter) {
				listLastNameStart.add(s);
			}
		}
		
		return listLastNameStart;
	}
	
	//method to find students whose first name or last name contains a substring
	public HashSet<Student> containsSubString(String str) {
		HashSet<Student> hasSubStringList = new HashSet<>();
		
		for (Student s : studentList) {
			if (s.getfirstName().contains(str) || s.getLastName().contains(str)) {
				hasSubStringList.add(s);
			}
		}
		
		return hasSubStringList;
	}
	
	//method to check if the list of students is empty
	public boolean isEmpty() {
		return studentList.isEmpty();
	}
	
	//method returns current size of Collection
	public int getSize() {
		return studentList.size();
	}
	
	
	
}
