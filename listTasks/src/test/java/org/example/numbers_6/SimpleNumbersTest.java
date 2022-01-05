package org.example.numbers_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleNumbersTest {

    @Test
    void isSimple() {
        int number = 5;
        Assertions.assertTrue(SimpleNumbers.isSimple(number));
        int falseNumber = 6;
        Assertions.assertFalse(SimpleNumbers.isSimple(falseNumber));
    }

    @Test
    void isSimpleFalse() {
        int falseNumber = 6;
        Assertions.assertFalse(SimpleNumbers.isSimple(falseNumber));
    }
}