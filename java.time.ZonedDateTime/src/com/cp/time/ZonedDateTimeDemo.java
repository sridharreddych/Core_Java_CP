package com.cp.time;

import java.time.ZonedDateTime;

/**
 * @author Sridhar reddy java.time.ZonedDateTime ZonedDateTime class represents
 *         date and time with zone. The example can be
 *         2014-09-12T18:32:29.636+05:30[Asia/Calcutta]. This class provides the
 *         methods to get year, month, day, hour, minute, seconds and zone
 *         offset.
 */
public class ZonedDateTimeDemo {
	public static void main(String[] args) {
		System.out.println(ZonedDateTime.now());
		ZonedDateTime zdt = ZonedDateTime.parse("2014-09-12T10:15:30+01:00[Europe/Paris]");
		System.out.println("getDayOfYear:" + zdt.getDayOfYear());
		System.out.println("zdt.getYear():" + zdt.getYear());
	}
}