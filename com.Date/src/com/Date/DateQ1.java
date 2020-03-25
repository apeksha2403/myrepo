package com.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class DateQ1 {

	public static void main(String[] args) {
		LocalDate localdate=LocalDate.now();
		System.out.println(localdate);
		int day=localdate.getDayOfMonth()+15;
		System.out.println(day);
		
	}

}
