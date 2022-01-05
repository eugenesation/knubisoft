package org.example.fibonacci_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TaskFibonacciTest {

    @Test
    void sequence() {
        int firstValue = 5;
        int secondValue = 12;
        List<Integer> list = new ArrayList<>();
        Assertions.assertEquals(14, TaskFibonacci.sequence(firstValue, secondValue, list, 11).size());
        Assertions.assertTrue(list.get(11) == 144);
        Assertions.assertTrue(list.get(10) == 89);
    }
}