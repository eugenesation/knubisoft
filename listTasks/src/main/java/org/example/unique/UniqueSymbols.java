package org.example.unique;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueSymbols {
    public static String uniqueWord() {
        String example = "fffff ab f 1234 jkjk";
        String[] strings = example.split(" ");
        int size = new HashSet<>(Arrays.asList(strings[0].split(""))).size();
        for (int i = 0; i < strings.length - 1; i++) {
            if (size > new HashSet<>(Arrays.asList(strings[i].split(""))).size()) {
                size = new HashSet<>(Arrays.asList(strings[i].split(""))).size();
            } else {
                return strings[i];
            }
        }
        return null;
    }
}
