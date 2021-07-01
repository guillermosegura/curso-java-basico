package com.axity.course.oop.annotations;

@Watch(key = "Esta es una clase de tipo A")
public class A {

	@Watch(key = "qwerty123")
	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
