package org.example.reversed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedStringTest {

    @Test
    void reverseStr() {
        String str = "Check";
        Assertions.assertEquals("kcehC", ReversedString.reverseStr(str));

    }
}