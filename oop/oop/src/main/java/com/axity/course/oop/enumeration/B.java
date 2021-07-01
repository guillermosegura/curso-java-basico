package com.axity.course.oop.enumeration;

public enum B implements GetId {
	B1(1), B2(2), B3(3);

	private int id;

	private B(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

}
