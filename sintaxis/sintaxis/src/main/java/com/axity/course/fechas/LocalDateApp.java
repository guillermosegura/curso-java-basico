package com.axity.course.fechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateApp {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		int year = 2021;
		int month = 6;
		int dayOfMonth = 20;
		localDate = LocalDate.of(year, Month.DECEMBER, dayOfMonth);
		System.out.println(localDate);
		
		

		localDate = LocalDate.parse("2021-06-14");
		System.out.println("iso-->" + localDate);
		
		
		System.out.println(localDate.get(ChronoField.YEAR));
		System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
		System.out.println(localDate.get(ChronoField.DAY_OF_WEEK));
		
		System.out.println(localDate.getYear());
//		if (true)return;
		
		LocalDate now = LocalDate.now();
		LocalDate tomorrow = now.plusDays(1);
		System.out.println(tomorrow);
  
		System.out.println("===================");
		System.out.println( now.plusDays(1));
		System.out.println( now.plusMonths(1));
		System.out.println( now.plusWeeks(1));
		System.out.println( now.plusYears(1));
		System.out.println("===================");
		
		System.out.println(now.minusDays(10));
		System.out.println(now.minusMonths(10));
		System.out.println(now.minusWeeks(10));
		System.out.println(now.minusYears(10));
		
		LocalDate en5Dias = now.plusWeeks(5);
		System.out.println(en5Dias);
	}

}
