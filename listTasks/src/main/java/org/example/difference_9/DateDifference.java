package org.example.difference_9;

import java.time.LocalDate;
import java.time.Period;

public class DateDifference {

    public static StringBuilder getDifference(LocalDate firstDate, LocalDate secondDate) {

        if (firstDate == null || secondDate == null) {
            return null;
        }

        Period between = Period.between(secondDate, firstDate);
        StringBuilder stringBuilder = new StringBuilder();
        long years = between.getYears();
        long months = between.getMonths();
        long days = between.getDays();

        printYears(years, stringBuilder);
        printMonths(months, stringBuilder);
        printDays(days, stringBuilder);
        System.out.println(stringBuilder);

        return stringBuilder;

    }

    private static StringBuilder printYears(long years, StringBuilder stringBuilder) {
        if (years % 10 == 1) {
            stringBuilder.append(years).append(" год ");
        } else if ((years % 100 > 4 && years % 100 < 21) || years % 10 == 0) {
            stringBuilder.append(years).append(" лет ");
        } else if (years % 10 > 1 && years % 10 < 5) {
            stringBuilder.append(years).append(" года ");
        }
        return stringBuilder;
    }

    private static StringBuilder printMonths(long months, StringBuilder stringBuilder) {
        if (months % 10 == 1) {
            stringBuilder.append(months).append(" месяц ");
        } else if ((months % 100 > 4 && months % 100 < 21) || months % 10 == 0) {
            stringBuilder.append(months).append(" месяцев ");
        } else if (months % 10 > 1 && months % 10 < 5) {
            stringBuilder.append(months).append(" месяца ");
        }
        return stringBuilder;
    }

    private static StringBuilder printDays(long days, StringBuilder stringBuilder) {
        if (days % 10 == 1) {
            stringBuilder.append(days).append(" день");
        } else if ((days % 100 > 4 && days % 100 < 21) || days % 10 == 0) {
            stringBuilder.append(days).append(" дней");
        } else if (days % 10 > 1 && days % 10 < 5) {
            stringBuilder.append(days).append(" дня");
        }
        return stringBuilder;
    }


}
