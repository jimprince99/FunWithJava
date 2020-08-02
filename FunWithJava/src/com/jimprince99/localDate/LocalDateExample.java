package com.jimprince99.localDate;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;

public class LocalDateExample {

	public static void main(String[] args) {
		
		LocalDateExample example1 = new LocalDateExample();
		
		example1.test1();
		example1.test2();
		example1.test3();
		example1.test4();
		example1.test5();
		example1.test6();
		example1.test7();
		example1.test8();
		
		

	}
	
	/**
	 * setting dates
	 */
	public void test1() {
		
		System.out.println("test2");

		LocalDate localDate1 = LocalDate.parse("2020-07-01");
		System.out.println("localDate1=" + localDate1);
		
		LocalDate localDate2 = LocalDate.of(2020, 07, 01);
		System.out.println("localDate2=" + localDate2);
		
		LocalDate localDate3 = LocalDate.now();
		System.out.println("localDate3=" + localDate3);
				
	}
	
	/**
	 * Adding and subtracting days
	 */
	public void test2() {
		System.out.println("test2");
		LocalDate localDate1 = LocalDate.now();
		System.out.println("localDate1=" + localDate1);

		localDate1 = localDate1.plusDays(1);
		System.out.println("localDate1=" + localDate1);
		localDate1 = localDate1.plusWeeks(1);
		System.out.println("localDate1=" + localDate1);

		localDate1 = localDate1.minusYears(1);
		System.out.println("localDate1=" + localDate1);

//		TemporalAmount temporalAmount = new TemporalAmount();
//		localDate1 = localDate1.plus(null);
//		System.out.println("localDate1=" + localDate1);

	}
	
	/**
	 * getting parts of the date
	 */
	public void test3() {
		System.out.println("test3");

		LocalDate localDate1 = LocalDate.now();
		
		DayOfWeek day = localDate1.getDayOfWeek();
		Month month = localDate1.getMonth();
		int year = localDate1.getYear();
		System.out.println("day=" + day + ", month=" + month + ", year=" + year);
		
	}
	
	/**
	 * LocalDate comparisons
	 */
	public void test4() {
		System.out.println("test4");

		LocalDate date1 = LocalDate.now();
		
		if (date1.isLeapYear()) {
			System.out.println("It's a leap year");
		} else {
			System.out.println("It's not a leap year");
		}
		
		LocalDate laterDate = LocalDate.parse("3020-01-01");
		
		boolean isEarlier = date1.isBefore(laterDate);
		boolean isLater = laterDate.isAfter(date1);
		
		System.out.println("isEarlier=" + isEarlier + ", isAfter=" + isLater);
		
		LocalDateTime startOfToday = LocalDate.now().atStartOfDay();
		System.out.println("startOfToday=" + startOfToday);
		
		LocalDate firstOfMonth = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("firstOfMonth=" + firstOfMonth);
	}

	/**
	 * localTime 
	 */
	public void test5() {
		System.out.println("test5");

		LocalTime timeNow = LocalTime.now();
		System.out.println("time now=" + timeNow);
		
		LocalTime tenThirtyPM = LocalTime.parse("22:30");
		System.out.println("tenThirtyPM=" + tenThirtyPM);
		
		tenThirtyPM = tenThirtyPM.minusHours(1);
		System.out.println("tenThirtyPM is now " + tenThirtyPM);
		
		int hours = tenThirtyPM.getHour();
		int minutes = tenThirtyPM.getMinute();
		int seconds = tenThirtyPM.getSecond();
		System.out.println("hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds);
		
		if (timeNow.isBefore(tenThirtyPM)) {
			System.out.println("time now (" + timeNow + ") is before " + tenThirtyPM);
		} else {
			System.out.println("time now (" + timeNow + ") is after " + tenThirtyPM);
		}
	}
	
	public void test6() {
		System.out.println("test6");

		LocalDateTime now = LocalDateTime.now();
		System.out.println("now=" + now);
		
		LocalDateTime localDateTime1 = LocalDateTime.parse("2020-01-02T03:05:06");
		System.out.println("localDateTime1=" + localDateTime1);
		
		LocalDateTime localDateTime2 = LocalDateTime.of(2020, Month.DECEMBER, 5, 9, 30, 45);
		System.out.println("localDateTime2=" + localDateTime2);
		
		LocalDateTime localDateTime3 = localDateTime2.plusDays(1);
		System.out.println("localDateTime3=" + localDateTime3);
		
		System.out.println("month=" + localDateTime3.getMonth());
		
		
	}
	
	public void test7() {
		System.out.println("test7");

		LocalDate localDate1 = LocalDate.now();
		
		LocalDate localDate2 = localDate1.plus(Period.ofDays(5));
		System.out.println("localDate2=" + localDate2);
		
		int daysBetween = Period.between(localDate1, localDate2).getDays();
		System.out.println("daysBetween=" + daysBetween);
		
		long days = ChronoUnit.DAYS.between(localDate1, localDate2);
		System.out.println("ms=" + days);
	}
	
	public void test8()  {
		LocalTime now = LocalTime.now();
		
		LocalTime soon = now.plusHours(2);
		
		long secondsBetween = Duration.between(now,  soon).getSeconds();
		System.out.println("minutesBetween=" + secondsBetween);
		
		
		
		
	}
	
	
}
