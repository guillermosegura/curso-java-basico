package com.axity.course.oop.generics;

import java.io.Serializable;

public class Entity<T extends Serializable> {
	private T t;

	public Entity(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
