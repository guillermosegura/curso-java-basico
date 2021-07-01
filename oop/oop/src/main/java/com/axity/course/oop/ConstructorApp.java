package com.axity.course.oop;

public class ConstructorApp {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getQuantity());

		a.setQuantity(20);
		System.out.println(a.getQuantity());
		
		System.out.println("===========");
		B b = new B(10);
		// Salida 10
		System.out.println(b.getQuantity());

		b.setQuantity(20);
		// Salida 20
		System.out.println(b.getQuantity());


	}
	

}
