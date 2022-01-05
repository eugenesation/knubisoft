package org.example.between_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.time.LocalDateTime;

class DateBetweenTest {

    @Test
    void isDateBetween() throws ParseException {
        LocalDateTime localDateTime = LocalDateTime.of(2000, 10, 10, 10, 10);
        LocalDateTime localDateTime2 = LocalDateTime.of(3000, 10, 10, 10, 10);
        LocalDateTime between = LocalDateTime.of(2500, 10, 20, 20, 20);
        Assertions.assertTrue(DateBetween.isDateBetween(localDateTime, localDateTime2, between));

        LocalDateTime timeForFail = LocalDateTime.of(1500, 10, 10, 10, 10);
        Assertions.assertFalse(DateBetween.isDateBetween(localDateTime, localDateTime2, timeForFail));
    }
}