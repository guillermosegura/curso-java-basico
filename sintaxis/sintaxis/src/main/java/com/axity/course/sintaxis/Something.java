package com.axity.course.sintaxis;

import java.util.Date;

public class Something {

	public static int counter;
	public static final int MAX_VALUE = 10;

	private int n = 6;

	public Something() {
	}

	public Something(int n) {
		this.n = n;
	}

	public static void main(String[] args) {

		
	}

	private void foo(int a) {

	}

	private static void hello() {
		System.out.println("Hello world!");
	}

	private Student bonjour(Student student) {
		String message = student.lastname + ", " + student.name;
		System.out.println("Bonjour mon ami! " + message);

		student = new Student();
		student.name = "Ana bobana";
		student.lastname = "Bobana ana";
		return student;
	}

	private Date data(final Date date) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Date d = new Date();
		return d;
	}
}
