package org.example.unique_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UniqueSymbolsTest {

    @Test
    void uniqueWord() {
        String example = "ab fffff f 1234 jkjk";
        Assertions.assertEquals("fffff", UniqueSymbols.uniqueWord(example));

        Assertions.assertEquals(null, UniqueSymbols.uniqueWord(null));
    }
}