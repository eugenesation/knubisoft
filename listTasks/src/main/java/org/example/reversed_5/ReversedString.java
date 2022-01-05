package org.example.reversed_5;

public class ReversedString {

    private ReversedString() {
    }

    public static String reverseStr(String text) {
        char[] lettersBefore = text.toCharArray();
        String result = "";
        for (int i = lettersBefore.length - 1; i >= 0; i--) {
            result += lettersBefore[i];
        }
        return result;

    }

}
