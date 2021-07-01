package com.axity.course.oop;

public class ViernesChiquito extends Jueves {

	public ViernesChiquito() {
		super();
		super.flag = false;
		value = 999;
		System.out.println("ViernesChiquito()");
	}
	
	public void setA(int a ) {
		this.a = a * 2;
	}
}
