package org.example.difference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.Date;

public class DateDifference {

    public static void getDifference() {
        Period periodFirst = Period.of(6, 5, 2);
        Period periodSecond = Period.of(6, 2, 1);
        Period result = periodFirst.minus(periodSecond);

        System.out.println(result.getYears() + " год " + result.getMonths() + " месяц " + result.getDays() + " дней");

    }
}
