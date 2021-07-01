package com.axity.course.oop.annotations;

@Watch(key = "Clase B")
public class B {

	@Watch(key = "<Campo id>")
	private int id;

	@Watch(key = "<Campo name>")
	private String name;

	private String hidden;

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

	public String getHidden() {
		return hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

}
