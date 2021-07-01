package com.axity.course.oop;

public class Semaforo {

	private int id;

	public Semaforo() {
	}

	public Semaforo(int id) {
//		this.id = id;
		this.setId(id);
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

}
