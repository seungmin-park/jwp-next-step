package ch02.domain;

public class NumberExtractor {

    private static final String REST_SEPARATOR = ",";
    private static final String COLON_SEPARATOR = ":";


    private boolean containSeparator(String inputNumber) {
        if (inputNumber.contains(REST_SEPARATOR)) {
            return true;
        }
        if (inputNumber.contains(COLON_SEPARATOR)) {
            return true;
        }
        return false;
    }

    private boolean containCustomSeparator(String inputNumber) {
        if (inputNumber.startsWith("//") && inputNumber.contains("\\n")) {
            return true;
        }
        return false;
    }
}
