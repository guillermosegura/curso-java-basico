package com.axity.course.fechas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationApp {

	public static void main(String[] args) {
		LocalTime time = LocalTime.parse("12:30:15");
		LocalTime timeEnd = time.plus(Duration.ofSeconds(5));

		long difference = Duration.between(time, timeEnd).getSeconds();
		long seconds = ChronoUnit.SECONDS.between(time, timeEnd);

		System.out.println(difference);

		DurationApp app = new DurationApp();
		app.factoryMethodsOf();
		app.parse();
		app.getters();
		app.minus();
		app.plus();
	}

	private void plus() {
		String text = "PT3H5M20.5S";
		Duration duration = Duration.parse(text);
		System.out.println("Duración: " + duration);
		System.out.println("===========");
		Duration d = duration.plusHours(2);
		System.out.println("Más 2 Horas " + d);

		d = duration.plusMinutes(5);
		System.out.println("Más 5 Minutos " + d);

		d = duration.plusSeconds(10);
		System.out.println("Más 10 Segundos " + d);

		d = duration.plusMillis(100);
		System.out.println("Más 100 millis " + d);

		d = duration.plusNanos(3500);
		System.out.println("Más 3500 nanos" + d);

	}

	private void minus() {
		String text = "PT3H5M20.5S";
		Duration duration = Duration.parse(text);

		System.out.println("Duración: " + duration);
		System.out.println("===========");
		Duration d = duration.minusHours(2);
		System.out.println("Menos 2 Horas " + d);

		d = duration.minusMinutes(5);
		System.out.println("Menos 5 Minutos " + d);

		d = duration.minusSeconds(10);
		System.out.println("Menos 10 Segundos " + d);

		d = duration.minusMillis(100);
		System.out.println("Menos 100 millis " + d);

		d = duration.minusNanos(3500);
		System.out.println("Menos 3500 nanos" + d);

	}

	private void getters() {
		String text = "PT3H5M20.5S";
		Duration duration = Duration.parse(text);
		long seconds = duration.getSeconds();
		int nanos = duration.getNano();
		System.out.println(seconds);
		System.out.println(nanos);
	}

	private void parse() {
		String text = "PT20.345S";
		Duration duration = Duration.parse(text);
		System.out.println(duration);
	}

	private void factoryMethodsOf() {
		int hours = 1;
		int minutes = 10;
		int seconds = 5;
		int milliseconds = 100;
		int nanos = 3501;
		Duration duration = Duration.ofHours(hours);
		System.out.println(duration);
		duration = Duration.ofMinutes(minutes);
		System.out.println(duration);
		duration = Duration.ofSeconds(seconds);
		System.out.println(duration);
		duration = Duration.ofMillis(milliseconds);
		System.out.println(duration);
		duration = Duration.ofNanos(nanos);
		System.out.println(duration);

	}

}
