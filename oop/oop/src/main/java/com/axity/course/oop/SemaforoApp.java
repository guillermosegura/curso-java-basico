package com.axity.course.oop;

import java.util.Calendar;

public class SemaforoApp {

	public static void main(String[] args) {
//		Sem sem = new Sem();
//		System.out.println(sem.getId());
		
//		Util u = new Util();
		Util.hello();
		
		Util u = Util.getInstance();
		
		Calendar cal = Calendar.getInstance();
	}

}
