package com.axity.course.oop.abstraccion;

public class Main {

	public static void main(String[] args) {
		Country country = new Country();
		country.setId(15);
		country.setName("Mexico");

		Student student = new Student();
		student.setId(20);

		OfficeItem officeItem = new OfficeItem();
		officeItem.setId(220);

		doSomething(country);
		doSomething(student);
		doSomething(officeItem);

	}

	private static void doSomething(AbstractEntity e) {
		System.out.println("id:" + e.getId());
		if (e instanceof Country) {
			System.out.println("Name " + ((Country) e).name);
		}
	}

}
