package org.example.reversed_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReversedStringTest {

    @Test
    void reverseStr() {
        String str = "Check";
        Assertions.assertEquals("kcehC", ReversedString.reverseStr(str));
        String empty = null;
        Assertions.assertThrows(NullPointerException.class, () -> ReversedString.reverseStr(empty));

    }
}