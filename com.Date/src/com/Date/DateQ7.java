package com.Date;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateQ7 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.of(2020,1,1);
		LocalDate lastday = LocalDate.of(2020, Month.DECEMBER, 31); 
		Period noOfSundays = Period.between(today, lastday); 
		System.out.println("Number of Sundays in 2020 : " 
		+ noOfSundays );

	}	

}
