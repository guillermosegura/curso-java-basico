
package com.axity.course.oop;

public class Foo {

	private static final String BAR = "bar";

	public static void bar() {
		System.out.println(barValue());
		
	}

	public static String barValue() {
		return BAR;
	}

	public String foo(int n) {
		

		
		return foo(n, null);
	}

	public String foo(String s) {
		return foo(0, s);
	}

	public String foo(int n, String s) {
		String str;
		if (s == null) {
			str = "Default";
		} else {
			str = s;
		}
		return n + "-" + str;

	}

	public int sum(int x, int y) {
		return (x + y);
	}

	public int sum(int x, int y, int z) {
		return (x + y + z);
	}

	public double sum(double x, double y) {
		return (x + y);
	}

	public int sum(int... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}
}
