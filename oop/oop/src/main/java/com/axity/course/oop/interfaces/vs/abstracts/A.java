package com.axity.course.oop.interfaces.vs.abstracts;

public class A implements MyInterface {

	@Override
	public void doSomething() {
		System.out.println("Clase A : doSomething");

	}

	@Override
	public void doSomethingElse() {
		System.out.println("Clase A : doSomethingElse");
	}

	@Override
	public void doA() {
		System.out.println("Clase A: doA");
		
	}

	@Override
	public void doB() {
		System.out.println("Clase A: doB");
	}

	@Override
	public void doC() {
		System.out.println("Clase A: doC");
	}

}
