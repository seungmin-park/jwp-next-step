package ch02.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberExtractorTest {

    @Test
    void extractRestSeparator() {
        NumberExtractor numberExtractor = new NumberExtractor();
        String[] result = numberExtractor.extractNumber("1,2,3");
        Assertions.assertEquals(result.length, 3);
        Assertions.assertArrayEquals(result, new String[]{"1", "2", "3"});
    }

    @Test
    void extractColonSeparator() {
        NumberExtractor numberExtractor = new NumberExtractor();
        String[] result = numberExtractor.extractNumber("1:2:3");
        Assertions.assertEquals(result.length, 3);
        Assertions.assertArrayEquals(result, new String[]{"1", "2", "3"});
    }

    @Test
    void extractBasicSeparator() {
        NumberExtractor numberExtractor = new NumberExtractor();
        String[] result = numberExtractor.extractNumber("1,2:3");
        Assertions.assertEquals(result.length, 3);
        Assertions.assertArrayEquals(result, new String[]{"1", "2", "3"});
    }

}