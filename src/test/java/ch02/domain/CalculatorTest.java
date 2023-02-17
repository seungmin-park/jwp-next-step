package ch02.domain;

import ch02.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add_test() {
        Calculator calculator = new Calculator("1", "2", "3");
        int result = calculator.sum();
        Assertions.assertEquals(result, 6);
    }
    @Test
    void add_throw_exception() {
        Assertions.assertThrowsExactly(RuntimeException.class, () -> Validator.validateNegative("-1", "2", "3"));
    }
}