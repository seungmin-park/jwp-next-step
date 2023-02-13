package ch02.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add_test() {
        Calculator calculator = new Calculator();
        int result = calculator.add("1", "2", "3");
        Assertions.assertEquals(result, 6);
    }
    @Test
    void add_throw_exception() {
        Calculator calculator = new Calculator();
        Assertions.assertThrowsExactly(RuntimeException.class, () -> calculator.add("-1", "2", "3"));
    }
}