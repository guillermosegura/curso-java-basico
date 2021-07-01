package com.axity.course.fechas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;

public class DateApp {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);

		long timeInMillis = System.currentTimeMillis();
		Date d2 = new Date(timeInMillis);
		System.out.println(d2);

		Date d3 = Date.from(Instant.now());
		System.out.println(d3);
		
		DateFormat df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss", Locale.getDefault());
		System.out.println(df.format(d1));

	}

}
