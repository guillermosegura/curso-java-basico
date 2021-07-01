package com.axity.course.fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodApp {
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.parse("2020-06-14");
		System.out.println(fecha);
		LocalDate fechaFinal = fecha.plus(Period.ofDays(5));
		System.out.println(fechaFinal);

		fechaFinal = fecha.plus(Period.ofWeeks(7));
		System.out.println(fechaFinal);

		int difference = Period.between(fecha, fechaFinal).getDays();
		long days = ChronoUnit.DAYS.between(fecha, fechaFinal);

		System.out.println(difference);
		System.out.println(days);
		System.out.println(Period.of(2, 3, 15).getDays());

		String text = "P1Y2M3D";
		Period period = Period.parse(text);
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println(period.getYears());
	}
}
