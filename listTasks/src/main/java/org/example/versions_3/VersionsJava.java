package org.example.versions_3;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VersionsJava {
    public static List<String> getVersions(List<String> strings, String example) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("Java\\s+\\d+");
        Matcher matcher = pattern.matcher(example);
        String patternString;

        while (matcher.find()) {
            patternString = matcher.group().replaceAll("\\s+", "");
            strings.add(patternString);
        }
        return strings;

    }
}
