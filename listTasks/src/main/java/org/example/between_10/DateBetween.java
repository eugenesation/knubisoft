package org.example.between_10;

import java.time.LocalDateTime;

public class DateBetween {
    public static boolean isDateBetween(LocalDateTime first, LocalDateTime second, LocalDateTime isBetween) {

        if (isBetween.isAfter(first) && isBetween.isBefore(second)) {
            return true;
        } else {
            return false;
        }

    }
}