package ch02.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    private final List<Integer> numbers;

    public Calculator(String... numbers) {
        this.numbers = Arrays.stream(numbers)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public int sum() {
        return numbers.stream()
                .mapToInt(i -> i)
                .sum();
    }
}
