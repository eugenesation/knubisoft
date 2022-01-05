package org.example.letters_8;

import java.util.Map;

public class AmountOfLetters {
    public static Map<Character, Long> count(String example, Map<Character, Long> map) {
        char[] exampleToArray = example.toCharArray();

        for (char c : exampleToArray) {
            if (c == ' ') {
                continue;
            }
            if (!map.containsKey(c)) {
                map.put(c, 1L);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;

    }

}
