package com.axity.course.oop;

public class MetodosApp {
	public static void main(String[] args) {
		Foo foo = new Foo();

		System.out.println(foo.foo(10));
		System.out.println(foo.foo("ABC"));
		System.out.println(foo.foo(15, "DFE"));

		System.out.println(foo.sum(10.5, 1.1));
		System.out.println(foo.sum(5, 7));
		System.out.println(foo.sum(5, 7, 8));
		

		// Llamar un método con varargs
		System.out.println(foo.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

		System.out.println(foo.sum(new int[] { 1, 2, 3, 4, 5 }));

		Foo.bar();
	}

}
