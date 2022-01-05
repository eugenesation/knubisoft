package org.example.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleNumbersTest {

    @Test
    void isSimple() {
        int number = 5;
        Assertions.assertTrue(SimpleNumbers.isSimple(number));
    }
}