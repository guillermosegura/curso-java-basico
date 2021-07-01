package com.axity.course.fechas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatApp {

	public static void main(String[] args) {
		DateFormat df1 = new SimpleDateFormat();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		DateFormat df2 = new SimpleDateFormat(pattern);

		System.out.println(df1.format(new Date()));
		System.out.println(df2.format(new Date()));

		DateFormat df3 = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
		try {
			Date date = df3.parse("2021-06-14 12:30:05");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
