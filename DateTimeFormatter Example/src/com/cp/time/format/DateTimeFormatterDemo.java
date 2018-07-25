package com.cp.time.format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Sridhar reddy Java 8 has provided DateTimeFormatter and
 *         DateTimeFormatterBuilder to play with formatting date, time or both
 *         in different ways. DateTimeFormatter has in-built formats that can
 *         directly be used to parse a character sequence.
 *         DateTimeFormatterBuilder provides custom way to create a formatter.
 * 
 *         DateTimeFormatter Example java.time.format.DateTimeFormatter provides
 *         formatting pattern to parse a character sequence. There are many
 *         constant fields in DateTimeFormatter that can be used to format a
 *         date or time or combination of both. In the example we are using some
 *         constant of DateTimeFormatter.
 */
public class DateTimeFormatterDemo {
	public static void main(String[] args) {
		LocalTime time = LocalTime.parse("10:15:30", DateTimeFormatter.ISO_TIME);
		System.out.println(time);
		LocalDate date = LocalDate.parse("20131206", DateTimeFormatter.BASIC_ISO_DATE);
		// LocalDate date1 = LocalDate.parse("Thu, 5 Jun 2014 05:10:40 GMT",
		// DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		System.out.println(date);
		// System.out.println(date1);
		LocalDateTime dateTime1 = LocalDateTime.parse("Thu, 5 Jun 2014 05:10:40 GMT",
				DateTimeFormatter.RFC_1123_DATE_TIME);
		System.out.println(dateTime1);
		LocalDateTime dateTime2 = LocalDateTime.parse("2014-11-03T11:15:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println(dateTime2);
		LocalDateTime dateTime3 = LocalDateTime.parse("2014-10-05T08:15:30+02:00",
				DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		System.out.println(dateTime3);
	}
}