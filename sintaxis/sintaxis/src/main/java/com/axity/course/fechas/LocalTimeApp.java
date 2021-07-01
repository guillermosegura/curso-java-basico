package com.axity.course.fechas;

import java.time.LocalTime;

public class LocalTimeApp {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);

		int hour = 12;
		int minute = 30;
		int second = 5;
		int nanosecond = 350000000;		
		LocalTime time = LocalTime.of(hour, minute);
		System.out.println(time);
		
		time = LocalTime.of(hour, minute, second);
		System.out.println(time);
		time = LocalTime.of(hour, minute, second, nanosecond);
		System.out.println(time);

		
		time = LocalTime.parse("12:30:05.350");
		System.out.println(time);
		
	}

}
