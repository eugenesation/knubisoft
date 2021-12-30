package org.example.numbers;

public class SimpleNumbers {
    public static boolean isSimple(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        else if (number > 1 && (number % 2 == 0 || number % 3 == 0)) {
            return false;
        } if (number > 1 && (number % 2 != 0 || number % 3 != 0)){
            return true;
        }
        return false;
    }
}
