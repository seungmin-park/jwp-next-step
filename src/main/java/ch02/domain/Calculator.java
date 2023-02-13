package ch02.domain;

import java.util.Arrays;

public class Calculator {

    public int add(String... numbers) {
        return Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .filter(Calculator::validNegative)
                .sum();
    }

    private static boolean validNegative(int num) {
        if (num < 0) {
            throw new RuntimeException();
        }
        return true;
    }
}
