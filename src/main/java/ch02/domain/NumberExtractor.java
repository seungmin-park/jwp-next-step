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
}
