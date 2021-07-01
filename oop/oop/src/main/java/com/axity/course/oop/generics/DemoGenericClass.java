package com.axity.course.oop.generics;

public class DemoGenericClass<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}
