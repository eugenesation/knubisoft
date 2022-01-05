package org.example.letters_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class AmountOfLettersTest {

    @Test
    void count() {
        String str = "aaaaaaaa";
        Map<Character, Long> map = new HashMap<>();
        AmountOfLetters.count(str, map);
        Character a = 'a';
        for (Map.Entry<Character, Long> pair : map.entrySet()) {
            Assertions.assertEquals(8, pair.getValue());
            Assertions.assertEquals(a, pair.getKey());
        }

        String oneMoreWord = "hello hi yo";
        Map<Character, Long> map2 = new HashMap<>();
        AmountOfLetters.count(oneMoreWord, map2);
        Character h = 'h';

        Assertions.assertEquals(2, map2.get(h));
    }
}