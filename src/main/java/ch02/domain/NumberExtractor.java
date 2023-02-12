package ch02.domain;

public class NumberExtractor {

    private static final String REST_SEPARATOR = ",";
    private static final String COLON_SEPARATOR = ":";
    private static final String CUSTOM_SEPARATOR_PREFIX = "//";
    private static final String CUSTOM_SEPARATOR_SUFFIX = "\\n";


    private boolean containRestSeparator(String inputNumber) {
        if (inputNumber.contains(REST_SEPARATOR)) {
            return true;
        }
        return false;
    }

    private boolean containColonSeparator(String inputNumber) {
        if (inputNumber.contains(COLON_SEPARATOR)) {
            return true;
        }
        return false;
    }

    private boolean containCustomSeparator(String inputNumber) {
        if (inputNumber.startsWith(CUSTOM_SEPARATOR_PREFIX) &&
                inputNumber.contains(CUSTOM_SEPARATOR_SUFFIX)) {
            return true;
        }
        return false;
    }
}
