package com.axity.course.sintaxis;

import java.util.Date;

/**
 * Clase ejemplo para mostrar la sintaxis del lenguaje
 * 
 * @author guillermo.segura@axity.com
 *
 */
public class MyClase {
	/** Identificador */
	private int id;
	/** Nombre */
	private String name;
	/** Fecha */
	private Date date;

	/** Constructor default */
	public MyClase() {
		this.id = 0;
		this.date = new Date();
	}

	/**
	 * Constructor por id y nombre
	 * 
	 * @param id   asigna el id
	 * @param name asigna el nombre
	 */
	public MyClase(int id, String name) {
		this.id = id;
		this.name = name;
		this.date = new Date();
	}

	/**
	 * Método main, no emplea argumentos
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		MyClase myClase = new MyClase();
		myClase.name = "Axity";

		System.out.println(myClase.name + " [" + myClase.date + "], id:" + myClase.id);

		myClase = new MyClase(1, "Curso Java");

		System.out.println(myClase.name + " [" + myClase.date + "], id:" + myClase.id);
	}
}