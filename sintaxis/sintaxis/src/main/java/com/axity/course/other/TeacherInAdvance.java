package com.axity.course.other;

import com.axity.course.sintaxis.Student;

public class TeacherInAdvance extends Student {

	public long professorId;
//	public String name;
	
	public TeacherInAdvance() {
		super.name ="TA";
	}

	public void setName(String name) {
		this.name = name;
//		this.name = name;
//		super.name = name;
	}

	public String toString() {
		return this.lastname + ", " + this.name + " (" + this.professorId + ")";
	}
	
	private void foo() {

	}

}
