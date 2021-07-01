package com.axity.course.oop.interfaces.vs.abstracts;

public class C implements MyInterface {

	@Override
	public void doSomething() {
		System.out.println("Clase C : doSomething");

	}

	@Override
	public void doSomethingElse() {
		System.out.println("Clase C : doSomethingElse");
	}

	@Override
	public void giveMeFive() {
		System.out.println("Clase C: Dame 5");
		doA();
	}
	
	
	@Override
	public void doA() {
		System.out.println("Clase C: doA");
		
	}

	@Override
	public void doB() {
		System.out.println("Clase B: doB");
	}

	@Override
	public void doC() {
		System.out.println("Clase C: doC");
	}

}
