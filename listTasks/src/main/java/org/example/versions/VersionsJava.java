package org.example.versions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VersionsJava {
    public static void getVersions() {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("Java.+[1-9]");
        Matcher matcher = pattern.matcher(str);
        String patternString;

        while (matcher.find()) {
            patternString = str.substring(matcher.start(), matcher.end());
            String[] strings = patternString.split(",");
            for (String string : strings) {
                System.out.println(string);
            }
        }

    }
}
