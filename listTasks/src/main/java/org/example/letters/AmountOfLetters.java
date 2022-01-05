package org.example.letters;

import java.util.HashMap;
import java.util.Map;

public class AmountOfLetters {
    public static Map<Character, Long> count(String example) {
        Map<Character, Long> letterContainer = new HashMap<>();
        char[] exampleToArray = example.toCharArray();

        for (char c : exampleToArray) {
            if (c == ' ') {
                continue;
            }
            if (!letterContainer.containsKey(c)) {
                letterContainer.put(c, 1L);
            } else {
                letterContainer.put(c, letterContainer.get(c) + 1);
            }
        }
        return letterContainer;

    }

}
