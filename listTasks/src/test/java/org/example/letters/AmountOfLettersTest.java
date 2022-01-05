package org.example.letters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmountOfLettersTest {

    @Test
    void count() {
        String str = "aaaaaaaa";

        Assertions.assertEquals("{a=8}", AmountOfLetters.count(str));
    }
}