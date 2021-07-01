package com.axity.course.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterApp {

	public static void main(String[] args) {
//		LocalDateTime date = LocalDateTime.now();
		ZonedDateTime date = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String text = date.format(formatter);

		System.out.println(date.format(formatter));
		System.out.println(date.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(date.format(DateTimeFormatter.ISO_OFFSET_DATE));
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));
		System.out.println(date.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

		System.out.println(text);

		LocalDate parsedDate = LocalDate.parse(text, formatter);
		System.out.println(parsedDate);
	}

}
