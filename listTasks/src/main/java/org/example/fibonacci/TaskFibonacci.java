package org.example.fibonacci;

public class TaskFibonacci {
    public static void sequence() {
        int firstValue = 1;
        int secondValue = 1;
        int value;
        int n = 10;
        System.out.println(firstValue + " " + secondValue);
        for (int i = 0; i <= n; i++) {
            value = firstValue + secondValue;
            System.out.println(value + " ");
            firstValue = secondValue;
            secondValue = value;
        }
        System.out.println();
    }
}
