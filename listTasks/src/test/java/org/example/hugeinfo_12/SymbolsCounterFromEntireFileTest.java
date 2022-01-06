package org.example.hugeinfo_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SymbolsCounterFromEntireFileTest {

    @Test
    void count() throws FileNotFoundException {
        FileReader fileReader = new FileReader("testData.txt");
        Map<Character, Long> letterContainer = new HashMap<>();
        SymbolsCounterFromEntireFile.count(letterContainer, fileReader);
        Character a = 'a';

        for (Map.Entry<Character, Long> pair : letterContainer.entrySet()) {
            Assertions.assertEquals(4, pair.getValue());
            Assertions.assertEquals(a, pair.getKey());
        }
    }
}