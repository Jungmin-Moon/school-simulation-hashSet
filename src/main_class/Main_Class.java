package main_class;
import students.Student;
import school.SchoolDataBase;
public class Main_Class {
	public static void main(String[] args) {
		//System.out.println("Fine for now");
		
		Student stu1 = new Student("John", "Doe", 15, 3.4, 11);
		Student stu2 = new Student("Jane", "Smith", 17, 4, 12);
		Student stu3 = new Student("Chris", "Jones", 14, 2.8, 9);
		
		SchoolDataBase schoolData = new SchoolDataBase();
		
		/*
		System.out.println(stu1.getId());
		System.out.println();
		
		System.out.println(stu2.getId());
		System.out.println();
		
		System.out.println(stu3.getId());
		System.out.println(); 
		*/
		
		//schoolData.registerStudent(stu1);
		//schoolData.registerStudent(stu2);
		//schoolData.registerStudent(stu3);
		
		//schoolData.removeStudent(stu2);
		
		//System.out.println(schoolData.getDataBase());
		
		
	}
}
