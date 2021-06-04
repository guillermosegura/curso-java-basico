package com.axity.course.sintaxis;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Areas {

	private double circle(double radious) {
		return PI * pow(radious, 2.0);
	}

	public static void main(String[] args) {
		Areas a = new Areas();
		System.out.println(a.circle(2));
	}
}
