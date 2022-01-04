package org.example.between;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBetween {
    public static boolean isDateBetween() throws ParseException {
        String dateFirst = "2025 10 13";
        String dateSecond = "2023 05 05";
        String dateBetween = "2017 03 03";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy mm dd");
        Date firstOne = simpleDateFormat.parse(dateFirst);
        Date secondAnotherOne = simpleDateFormat.parse(dateSecond);
        Date betweenDate = simpleDateFormat.parse(dateBetween);

        if (firstOne.getTime() > secondAnotherOne.getTime()) {
            if (betweenDate.getTime() < firstOne.getTime() && betweenDate.getTime() > secondAnotherOne.getTime()) {
                return true;
            }
            else {
                return false;
            }
        } else {
            throw new IllegalArgumentException("Illegal time because first date cannot be bigger than second date.");
        }

    }
}
