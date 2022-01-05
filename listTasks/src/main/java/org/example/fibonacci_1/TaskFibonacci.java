package org.example.fibonacci_1;

import java.util.List;

public class TaskFibonacci {
    public static List<Integer> sequence(int firstValue, int secondValue, List<Integer> elements, int n) {
        elements.add(firstValue);
        elements.add(secondValue);
        firstValue = 1;
        secondValue = 1;
        int value;
        System.out.println(firstValue + " " + secondValue);
        for (int i = 0; i <= n; i++) {
            value = firstValue + secondValue;
            elements.add(value);
            System.out.println(value + " ");
            firstValue = secondValue;
            secondValue = value;
        }
        System.out.println();
        return elements;
    }

}
