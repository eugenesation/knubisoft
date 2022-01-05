package org.example.unique_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueSymbols {
    public static String uniqueWord(String example) {
        if (example == null) {
            return null;
        }
        String[] strings = example.split(" ");
        String resultString = strings[0];
        int res = new HashSet<>(Arrays.asList(strings[0].split(""))).size();
        for (String string : strings) {
            Set<String> set = new HashSet<>(Arrays.asList(string.split("")));
            if (res > set.size()) {
                res = set.size();
                resultString = string;
            }
        }
        return resultString;
    }
}
