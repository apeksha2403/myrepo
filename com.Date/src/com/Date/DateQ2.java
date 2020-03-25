package com.Date;

import java.time.Duration;
import java.time.LocalTime;

public class DateQ2 {

	public static void main(String[] args) {
		LocalTime localtime=LocalTime.now();
		System.out.println(localtime);
		LocalTime time2=LocalTime.of(12,30,30);
       Duration d1=Duration.between(localtime,time2);
       long time=d1.toHours();
       System.out.println(time);
	}

}
