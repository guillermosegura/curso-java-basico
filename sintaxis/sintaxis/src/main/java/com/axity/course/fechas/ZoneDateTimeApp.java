package com.axity.course.fechas;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeApp {

	public static void main(String[] args) {
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		for (String s : allZoneIds) {
			System.out.println(s);
		}
		System.out.println("-----");
		ZoneId zoneId = ZoneId.of("America/Mexico_City");

		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);

		System.out.println(zonedDateTime);

		String text = "2021-06-14T12:30:05.350-05:00[America/Mexico_City]";
		zonedDateTime = ZonedDateTime.parse(text);

		System.out.println(zonedDateTime);

		localDateTime = LocalDateTime.of(2021, Month.JUNE, 14, 12, 30);

		ZoneOffset zoneOffest = ZoneOffset.of("+01:00");
		OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, zoneOffest);

//		 		
		System.out.println(offsetDateTime);

	}
}
