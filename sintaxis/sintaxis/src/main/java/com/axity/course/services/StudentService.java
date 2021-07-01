package com.axity.course.services;

import com.axity.course.sintaxis.Course;
import com.axity.course.sintaxis.Student;
import com.axity.course.sintaxis.model.Address;;

public interface StudentService {

	void assignCourse(Student student, Course course);

	void addAddress(Student student, Address address);

	void unassignCourse(Student student, Course course);

	void removeAddress(Student student, Address address);

}
