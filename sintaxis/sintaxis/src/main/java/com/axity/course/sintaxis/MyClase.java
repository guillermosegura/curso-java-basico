package com.axity.course.sintaxis;

import java.util.Date;

public class MyClase {
	private String name;
	private Date date;

	public MyClase() {
		this.date = new Date();
	}

	public static void main(String args[]) {
		MyClase myClase = new MyClase();
		myClase.name = "Axity";

		System.out.println(myClase.name + " [" + myClase.date + "]");
	}
}