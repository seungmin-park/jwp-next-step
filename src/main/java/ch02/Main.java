package ch02;

import ch02.domain.Calculator;
import ch02.domain.NumberExtractor;
import ch02.validation.Validator;
import ch02.view.InputView;
import ch02.view.OutputView;

public class Main {
    public static void main(String[] args) {
        String readNumber = InputView.readNumber();
        NumberExtractor numberExtractor = new NumberExtractor();
        String[] numbers = numberExtractor.extractNumber(readNumber);
        Validator.validNumber(numbers);
        Validator.validateNegative(numbers);
        Calculator calculator = new Calculator(numbers);
        OutputView.printResult(calculator.sum());
    }
}
