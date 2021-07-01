package com.axity.course.sentencias;

public class IfTernary {

	public static void main(String[] args) {
		boolean a = true;

//		int n;
//		if (a) {
//			n = 1;
//		} else {
//			n = 2;
//		}
		int n = a ? a() == true ? 3 : b() | c() ? 1 : 0 : 2;
		System.out.println(n);
	}

	private static boolean a() {
		return (Math.random() * 100) > 50 ? true : false;
	}

	private static boolean b() {
		return (Math.random() * 100) > 50 ? true : false;
	}

	private static boolean c() {
		return (Math.random() * 100) > 50 ? true : false;
	}

}
