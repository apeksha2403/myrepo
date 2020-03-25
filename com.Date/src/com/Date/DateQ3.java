package com.Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class Leap implements TemporalAdjuster {

@Override
public Temporal adjustInto(Temporal temp) {
int y = ((LocalDate) temp).getYear();

LocalDate dt1=(LocalDate) temp;
if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))

{
Period p=Period.between(LocalDate.now(), LocalDate.of(2020, 2, 29));

System.out.println(p);
}
else
{
for(int i=1;i<=4;i++)
{
int yy=y+i;
if (((yy % 4 == 0) && (yy % 100 != 0)) || (yy % 400 == 0))

{
Period p=Period.between(dt1, LocalDate.of(yy, 2, 29));

System.out.println(p);
}

}
}
return temp;

}

}

public class DateQ3 {

public static void main(String[] args) {
LocalDate dt = LocalDate.now();
Temporal newdate = new Leap().adjustInto(dt);

}

}



