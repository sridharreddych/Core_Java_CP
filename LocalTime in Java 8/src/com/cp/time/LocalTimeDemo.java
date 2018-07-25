package com.cp.time;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * @author Sridhar reddy Java 8 time API has introduced the API to represent
 *         local time by LocalTime that does not know date and time zone,
 *         LocalDate that does not know time and time zone and LocalDateTime
 *         represents the combination of LocalDate and LocalTime but does not
 *         know time zone.
 * 
 *         LocalTime in Java 8 java.time.LocalTime is a time without time- zone
 *         that can be represented like hour-minute-second. LocalTime is
 *         immutable and represents only time. It does not represent date or
 *         time zone.
 */
public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime localt1 = LocalTime.now();
		System.out.println(localt1);
		LocalTime localt2 = LocalTime.now(Clock.systemDefaultZone());
		System.out.println(localt2);
		System.out.println(LocalTime.now(ZoneId.of("Indian/Cocos")));
		System.out.println(LocalTime.now(ZoneId.of("America/Caracas")));
		System.out.println(LocalTime.now(ZoneId.of("Pacific/Norfolk")));
	}
}