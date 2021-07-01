package com.axity.course.oop.interfaces.vs.abstracts;

public abstract class AbstractClase {

	
	public abstract void llamame();
	
	public void hola(String name) {
		System.out.println("Hola " + name);
		llamame();
	}
}
