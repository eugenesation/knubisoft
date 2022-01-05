package org.example.difference_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class DateDifferenceTest {

    @Test
    void getDifference() {
        LocalDate localDate = LocalDate.of(3000, 10, 10);
        LocalDate localDate2 = LocalDate.of(2000,5,5);
        String value = "1000 лет 5 месяцев 5 дней";
        Assertions.assertEquals(value, DateDifference.getDifference(localDate, localDate2).toString());

        Assertions.assertEquals(null, DateDifference.getDifference(null, null));


    }
}