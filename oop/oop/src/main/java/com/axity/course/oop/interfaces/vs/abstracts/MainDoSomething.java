package com.axity.course.oop.interfaces.vs.abstracts;

public class MainDoSomething {

	public static void main(String[] args) {

		MyInterface a = new A();
		MyInterface b = new B();
		MyInterface c = new C();

		a.doSomething();
		b.doSomething();
		c.doSomething();

		a.giveMeFive();
//		b.giveMeFive();
		c.giveMeFive();
	}

}
