package org.example.reversed;

public class ReversedString {

    public static String reverseStr(String text) {
        char[] lettersBefore = text.toCharArray();
        char[] lettersAfter;
        String result = "";
        for (int i = lettersBefore.length - 1; i >= 0; i--) {
            result += lettersBefore[i];
        }
        return result;

    }

}
