package com.axity.course.oop.interfaces;

public class Programmer extends Employee implements Trainable {

	private String[] programmingLanguages;

	public void writeCode() {
	}

	@Override
	public void attendTraining() {
		System.out.println("Programmer - attend training");
	}

}
