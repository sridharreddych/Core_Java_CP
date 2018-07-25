package com.cp.time.format;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;

/**
 * @author Sridhar reddy DateTimeFormatterBuilder Example If we want to create
 *         our own DateTimeFormatter object, then
 *         java.time.format.DateTimeFormatterBuilder will help. All the
 *         formatter has been created using DateTimeFormatterBuilder. There are
 *         different methods like appendValue, appendLiteral and appendText etc
 *         that is used to generate a formatter.
 */
public class DateTimeFormatterBuilderDemo {
	public static void main(String[] args) {
		DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder();
		DateTimeFormatter formatter = builder.appendLiteral("Day is:").appendValue(ChronoField.DAY_OF_MONTH)
				.appendLiteral(", month is:").appendValue(ChronoField.MONTH_OF_YEAR).appendLiteral(", and year:")
				.appendPattern("u").appendLiteral(" with the time:").appendValue(ChronoField.HOUR_OF_DAY)
				.appendLiteral(":").appendText(ChronoField.MINUTE_OF_HOUR, TextStyle.NARROW_STANDALONE).toFormatter();
		LocalDateTime dateTime = LocalDateTime.now();
		String str = dateTime.format(formatter);
		System.out.println(str);
	}
}