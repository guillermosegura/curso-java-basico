package com.axity.course.sintaxis;

import com.axity.course.other.TeacherInAdvance;

public class StudentAppLocal {

	public static void main(String[] args) {

		Student student = new Student();
		student.name = "Juan";
		student.lastname = "Perez";
		System.out.println(student);

//		TeacherInAdvance ta = new TeacherInAdvance();
//		ta.lastname = "Wick";
//		ta.name = "John";
//		System.out.println(ta);
//		System.out.println("ta.name=" + ta.name);

//		System.out.println("student.name=" + ((Student) ta).name);

	}

}
