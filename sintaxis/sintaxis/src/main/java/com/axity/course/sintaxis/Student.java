package com.axity.course.sintaxis;

import java.util.ArrayList;
import java.util.List;

import com.axity.course.sintaxis.model.Address;

public class Student {
	public String name = "<TBD>";
	public String lastname;
	private List<Address> addresses;
	private List<Course> courses;
	private int age;

	public Student() {
	}

	public Student(String name, String lastname, int age) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}

	/**
	 * Método que agrega una dirección, valida que se haya inicializado la lista de
	 * direcciones, en caso contrario hace un Lazy initialization.
	 * 
	 * <br>
	 * Valida que la dirección no exista previamente, en caso de ser una nueva
	 * agrega la dirección
	 * 
	 * @param address Dirección a agregar
	 */
	public void addAddress(Address address) {
		// Validar si está inicializada la lista de direcciones
		if (this.addresses == null) {
			this.addresses = new ArrayList<>();
		}
		// Validar si la direccion no existe
		if (!this.addresses.contains(address)) {
			// Agregar la nueva direccion
			this.addresses.add(address);
		}
	}

	public void addCourse(Course course) {
		int c = 1; // contador inicial
	}

	public Address removeAddress(Address address) {
		Address addressRemoved = null;
//		if (this.addresses != null) {
//			if (this.addresses.contains(address)) {
//				addressRemoved = this.addresses.get(this.addresses.indexOf(address));
//				this.addresses.remove(address);
//			}
//		}
		return addressRemoved;
	}

	public Course removeCourse(Course course) {
		// quitar curso y regresar su data
		return null;
	}

	public String toString() {
		return "{" +this.lastname + ", " + this.name + ", age " + age + "}";
	}

	public void setName(String name) {
		this.name = name;
	}
}
