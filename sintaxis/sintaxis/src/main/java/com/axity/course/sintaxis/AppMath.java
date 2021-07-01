package com.axity.course.sintaxis;

public class AppMath {

	public static void main(String args[]) {
		
		A a = new A();
		int n = a.suma(1, 2);
		
		System.out.println(n);
		
		System.out.println(Math.max(8, 10));

		System.out.println(Math.min(8, 10));

		System.out.println(Math.sqrt(144.0));

		System.out.println(Math.abs(-123.5));

		System.out.println("-----");
		for (int i = 0; i < 10; i++) {
			System.out.println((int) (Math.random() * 101));
		}
	}
}
