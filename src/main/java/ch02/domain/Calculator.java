package ch02.domain;

import java.util.Arrays;

public class Calculator {
    public int add(String... numbers) {
        return Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
