package com.axity.course.oop.enumeration;

public enum A implements GetId {
	A1(1), A2(2), A3(3);

	private int id;

	private A(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

}
