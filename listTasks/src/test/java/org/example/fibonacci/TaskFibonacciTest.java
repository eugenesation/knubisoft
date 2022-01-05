package org.example.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskFibonacciTest {

    @Test
    void sequence() {
        int firstValue = 5;
        int secondValue = 12;
        Assertions.assertTrue(TaskFibonacci.sequence(firstValue, secondValue) == 233);
    }
}