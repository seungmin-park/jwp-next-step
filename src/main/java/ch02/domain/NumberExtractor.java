package ch02.domain;

public class NumberExtractor {

    private static final String REST_SEPARATOR = ",";
    private static final String COLON_SEPARATOR = ":";
    private static final String BASIC_SEPARATOR = ",|:";
    private static final String CUSTOM_SEPARATOR_PREFIX = "//";
    private static final String CUSTOM_SEPARATOR_SUFFIX = "\\n";

    public String[] extractNumber(String inputNumber) {
        if (containBasicSeparator(inputNumber)) {
            return inputNumber.split(BASIC_SEPARATOR);
        }
        throw new IllegalArgumentException();
    }

    private boolean containBasicSeparator(String inputNumber) {
        if (inputNumber.contains(REST_SEPARATOR) ||
                inputNumber.contains(COLON_SEPARATOR)) {
            return true;
        }
        return false;
    }

    public String extractCustomSeparator(String inputNumber) {
        return inputNumber.split(String.join(CUSTOM_SEPARATOR_PREFIX, CUSTOM_SEPARATOR_PREFIX))[1];
    }

    private boolean containCustomSeparator(String inputNumber) {
        if (inputNumber.startsWith(CUSTOM_SEPARATOR_PREFIX) &&
                inputNumber.contains(CUSTOM_SEPARATOR_SUFFIX)) {
            return true;
        }
        return false;
    }
}
