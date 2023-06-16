package school;

import java.util.*;
import java.util.Map.Entry;

import students.Student;

public class SchoolDataBase {
	private HashSet<Student> studentList;
	private static int id; //incremented every time student is registered
	
	public SchoolDataBase() {
		studentList = new HashSet<>();
	}
	
	public HashSet<Student> getDataBase() {
		return studentList;
	}
	
	
	
	public void registerStudent(Student s) {
		
		
	}
	
	
	public int getKeyByValue(Student s) {
		
		return 0;
	}
	
	
	public void removeStudent(Student s) {
		
	}
	
	
	//create method for getting students of certain gpa
	
	//create method for getting students of certain grade
	
	//create method to get students by name between two letters
}
