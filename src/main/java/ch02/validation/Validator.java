package ch02.validation;

import java.util.Arrays;

public class Validator {
    public static boolean validateEmptyInput(String inputNumber) {
        return inputNumber.trim().isEmpty();
    }

    public static void validateNegative(String... numbers) {
        if (containNegative(numbers)) {
            throw new RuntimeException("음수 감지");
        }
    }


    private static boolean containNegative(String[] numbers) {
        return Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .anyMatch(i -> i < 0);
    }

    public static void validNumber(String[] numbers) {
        try {
            Arrays.stream(numbers)
                    .forEach(Integer::parseInt);
        } catch (NumberFormatException e) {
            throw new RuntimeException("숫자와 연산자를 확인해주세요");
        }
    }
}
