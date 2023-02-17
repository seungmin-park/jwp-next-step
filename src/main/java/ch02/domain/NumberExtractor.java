package ch02.domain;

import ch02.validation.Validator;
import java.util.StringTokenizer;

public class NumberExtractor {

    private static final String REST_SEPARATOR = ",";
    private static final String COLON_SEPARATOR = ":";
    private static final String BASIC_SEPARATOR = ",|:";
    private static final String CUSTOM_SEPARATOR_PREFIX = "//";
    private static final String CUSTOM_SEPARATOR_SUFFIX = "\\n";
    public String[] extractNumber(String inputNumber) {
        if (Validator.validateEmptyInput(inputNumber)) {
            return new String[]{"0"};
        }

        if (containCustomSeparator(inputNumber)) {
            String customSeparator = extractCustomSeparator(inputNumber);
            String removeSeparatorNumber = inputNumber.substring(5);
            if (containBasicSeparator(inputNumber)) {
                return removeSeparatorNumber.split(customSeparator + "|" + BASIC_SEPARATOR);
            }
            return removeSeparatorNumber.split(customSeparator);
        }

        if (containBasicSeparator(inputNumber)) {
            return inputNumber.split(BASIC_SEPARATOR);
        }

        return new String[]{inputNumber};
    }

    private boolean containBasicSeparator(String inputNumber) {
        if (inputNumber.contains(REST_SEPARATOR) ||
                inputNumber.contains(COLON_SEPARATOR)) {
            return true;
        }
        return false;
    }

    public String extractCustomSeparator(String inputNumber) {
        return new StringTokenizer(inputNumber, "//\\n").nextToken();
    }

    private boolean containCustomSeparator(String inputNumber) {
        if (inputNumber.startsWith(CUSTOM_SEPARATOR_PREFIX) &&
                inputNumber.contains(CUSTOM_SEPARATOR_SUFFIX)) {
            return true;
        }
        return false;
    }
}
