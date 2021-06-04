package com.axity.course.sintaxis;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public String name;
	public String lastname;
	private List<Address> addresses;
	private List<Course> courses;

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

}
