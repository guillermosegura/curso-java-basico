package com.axity.course.oop;

public class Jueves {
	public int a = 10;
	public String str = "abc";
	public int[] array;
	public boolean flag = true;
	public double value = 11.0;
	
	public Jueves() {
		this.a =  1100;
		System.out.println("Jueves()");
	}
	
	public Jueves(int a) {
		this();
		this.a = a;
	}
	
	public Jueves(int a, String str) {
		this(a);
		this.str = str;
	}
	
	public Jueves(int a, String str, int[]array) {
		this(a, str);
		this.array = array;
	}
	
	public void setA(int a ) {
		this.a = a;

	}
}
