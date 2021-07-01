package com.axity.course.oop;

public final class Util {

	private Util() {
		// ofusca constructor
	}

	public static Util getInstance() {
		Util u = new Util();
		return u;
	}

	public static void hello() {
		System.out.println("Hola mundo");
	}
}
