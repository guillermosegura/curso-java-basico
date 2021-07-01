package com.axity.course.fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarApp {

	public static void main(String[] args) {
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTimeInMillis(0L);
		System.out.println(cal1.getCalendarType());
		System.out.println(cal1);

		CalendarApp app = new CalendarApp();

		app.gregorian();

		app.setter();
		app.getter();

		app.add(1);
		app.add(-10);
	}

	private void gregorian() {
		GregorianCalendar now = new GregorianCalendar();
		System.out.println(now);
		int year = 2021;
		int month = Calendar.JUNE;
		int dayOfMonth = 14;
		int hourOfDay = 12;
		int minute = 30;
		int second = 5;

		GregorianCalendar gc1 = new GregorianCalendar(year, month, dayOfMonth);
		System.out.println(gc1);

		GregorianCalendar gc2 = new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);
		System.out.println(gc2);

	}

	private void add(int days) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, days);
		this.print(cal);
	}

	private void setter() {
		Calendar cal = Calendar.getInstance();
		int field = Calendar.YEAR;
		cal.set(field, 2021);
		// 2021-06-14 12:00:00
		int year = 2021;
		int month = Calendar.JUNE;
		int date = 14;
		int hourOfDay = 12;
		int minute = 30;
		int second = 5;
		cal.set(year, month, date);
		System.out.println(cal);
		cal.set(year, month, date, hourOfDay, minute);
		System.out.println(cal);
		cal.set(year, month, date, hourOfDay, minute, second);
		System.out.println(cal);
	}

	private void getter() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int second = cal.get(Calendar.SECOND);
		int minute = cal.get(Calendar.MINUTE);
		int millisecond = cal.get(Calendar.MILLISECOND);

		String str = String.format("%d-%02d-%02d %02d:%02d:%02d.%03d", year, month, date, hourOfDay, second, minute,
				millisecond);
		System.out.println(str);
	}

	private void print(Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int second = cal.get(Calendar.SECOND);
		int minute = cal.get(Calendar.MINUTE);
		int millisecond = cal.get(Calendar.MILLISECOND);
		System.out.printf("%d-%02d-%02d %02d:%02d:%02d.%03d", year, month, date, hourOfDay, second, minute,
				millisecond);
		System.out.println();
	}
}
