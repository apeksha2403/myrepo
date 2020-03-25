package com.Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class NumberOfHoliday implements TemporalAdjuster {
	public Temporal adjustInto(Temporal temporal){
	DayOfWeek dow= DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
	int noOfHoliday= 0;
	if (dow== DayOfWeek.SUNDAY || dow==DayOfWeek.SATURDAY) { noOfHoliday+= 1; }
	return temporal.plus(noOfHoliday, ChronoUnit.DAYS);
	}
	}
public class DateQ9 {

	public static void main(String[] args) {
		LocalDate currentLocalDate=LocalDate.now();
			LocalDate nextWorkingDate= currentLocalDate.with(new NumberOfHoliday());
			System.out.println("No. of sunday = " + nextWorkingDate);
	}

}
