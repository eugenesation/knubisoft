package org.example.ticket_2;

import java.util.List;

public class LuckyTicket {
    public static List<String> luckyTicket(List<String> elements) {
        int sum = 0;
        for (int i = 0; i <= 999999; i++) {
            int number1 = i / 100000;
            int number2 = (i / 10000) % 10;
            int number3 = (i / 1000) % 10 % 10;
            int number4 = (i / 100) % 10 % 10 % 10;
            int number5 = (i / 10) % 10 % 10 % 10 % 10;
            int number6 = i % 10 % 10 % 10 % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                sum++;
                elements.add(String.format("%06d", i));
            }
        }
        System.out.println("Рулон билетов с номерами от 000000 до 999999 имеет " + sum + " счастливых билетов.");

        for (String element : elements) {
            System.out.println(element);
        }
        return elements;
    }
}
