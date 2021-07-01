package com.axity.course.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeApp {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		int year = 2021;
		int month = 06;
		int dayOfMonth = 14;
		int hour = 12;
		int minute = 30;
		int second = 5;
		int nanoOfSecond = 350000000;

		LocalDateTime localDateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
		System.out.println(localDateTime);

		localDateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second);
		System.out.println(localDateTime);

		localDateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond);
		System.out.println(localDateTime);

		localDateTime = LocalDateTime.parse("2021-06-14T12:30:05.350");
		System.out.println(localDateTime);

		
		for (int i = 1800; i < 2200; i += 10) {
			LocalDate localDate = LocalDate.of(i, Month.JANUARY, 1);
			System.out.println("Año: " + localDate.getYear() + " " + localDate.isLeapYear());

		}
	}

}
