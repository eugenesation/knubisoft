package org.example.unique;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueSymbols {
    public static String uniqueWord() {
        String example = "fffff ab f 1234 jkjk";
        String[] strings = example.split(" ");
        int size = new HashSet<>(Arrays.asList(strings[0].split(""))).size();
        for (int i = 1; i < strings.length - 1; i++) {
            if (size > new HashSet<>(Arrays.asList(strings[i].split(""))).size()) {
                size = new HashSet<>(Arrays.asList(strings[i].split(""))).size();
            }
        }
        return strings[size - 1];
    }
}
