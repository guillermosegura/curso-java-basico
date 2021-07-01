package com.axity.course.other;

import com.axity.course.sintaxis.Student;

public class StudentAppOther   {

	public   void main(String[] args) {
		Student student = new Student();
		student.name = "Ivan";
		student.lastname = "Perez";
		
		System.out.println(student);
		
		Student student2 = new Student();
		student2.name = "Martha";
		student2.lastname = "Sanchez";
		
		System.out.println(student2);

	}

}
