package school_classes;

import java.util.LinkedList;


import people.Student;
import people.Teacher;

public class School_Course {
	private String courseSubject;
	private LinkedList<Student> studentsInCourse;
	private Teacher courseTeacher;
	private String courseCode;
	private int studentCount;
	private static int MAX_STUDENTS_PER_CLASS = 40;
	
	School_Course (String subject, Teacher teacher, String code) {
		setCourseSubject(subject);
		setStudentsInCourse(new LinkedList<>());
		courseTeacher = teacher;
		setCourseCode(code);
		setStudentCount(0);
	}

	public String getCourseSubject() {
		return courseSubject;
	}

	public void setCourseSubject(String courseSubject) {
		this.courseSubject = courseSubject;
	}

	public LinkedList<Student> getStudentsInCourse() {
		return studentsInCourse;
	}

	public void setStudentsInCourse(LinkedList<Student> studentsInCourse) {
		this.studentsInCourse = studentsInCourse;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	public static int getMAX_STUDENTS_PER_CLASS() {
		return MAX_STUDENTS_PER_CLASS;
	}

	public static void setMAX_STUDENTS_PER_CLASS(int mAX_STUDENTS_PER_CLASS) {
		MAX_STUDENTS_PER_CLASS = mAX_STUDENTS_PER_CLASS;
	}
	
	
}
