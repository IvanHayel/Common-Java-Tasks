package field.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class JoiningMultipleStringsWithDelimiterTest {
    private static final char DELIMITER = '&';
    private static final String[] STRINGS = {"This", "is", "a", "test"};
    private static final String EXPECTED = "This&is&a&test";

    /**
     * Method under test: {@link JoiningMultipleStringsWithDelimiter#joinByDelimiterFirstOption(char, String[])}
     */
    @Test
    void testJoinByDelimiterFirstOption() {
        String result = JoiningMultipleStringsWithDelimiter.joinByDelimiterFirstOption(DELIMITER, STRINGS);
        assertEquals(EXPECTED, result);
        log.info("joinByDelimiterFirstOption: {}", result);
    }

    /**
     * Method under test: {@link JoiningMultipleStringsWithDelimiter#joinByDelimiterSecondOption(char, String[])}
     */
    @Test
    void testJoinByDelimiterSecondOption() {
        String result = JoiningMultipleStringsWithDelimiter.joinByDelimiterSecondOption(DELIMITER, STRINGS);
        assertEquals(EXPECTED, result);
        log.info("joinByDelimiterSecondOption: {}", result);
    }

    /**
     * Method under test: {@link JoiningMultipleStringsWithDelimiter#joinByDelimiterThirdOption(char, String[])}
     */
    @Test
    void testJoinByDelimiterThirdOption() {
        String result = JoiningMultipleStringsWithDelimiter.joinByDelimiterThirdOption(DELIMITER, STRINGS);
        assertEquals(EXPECTED, result);
        log.info("joinByDelimiterThirdOption: {}", result);
    }

    /**
     * Method under test: {@link JoiningMultipleStringsWithDelimiter#joinByDelimiterFourthOption(char, String[])}
     */
    @Test
    void testJoinByDelimiterFourthOption() {
        String result = JoiningMultipleStringsWithDelimiter.joinByDelimiterFourthOption(DELIMITER, STRINGS);
        assertEquals(EXPECTED, result);
        log.info("joinByDelimiterFourthOption: {}", result);
    }

    /**
     * Method under test: {@link JoiningMultipleStringsWithDelimiter#joinByDelimiterApacheCommons(char, String[])}
     */
    @Test
    void testJoinByDelimiterApacheCommons() {
        String result = JoiningMultipleStringsWithDelimiter.joinByDelimiterApacheCommons(DELIMITER, STRINGS);
        assertEquals(EXPECTED, result);
        log.info("joinByDelimiterApacheCommons: {}", result);
    }

    /**
     * Method under test: {@link JoiningMultipleStringsWithDelimiter#joinByDelimiterGuava(char, String[])}
     */
    @Test
    void testJoinByDelimiterGuava() {
        String result = JoiningMultipleStringsWithDelimiter.joinByDelimiterGuava(DELIMITER, STRINGS);
        assertEquals(EXPECTED, result);
        log.info("joinByDelimiterGuava: {}", result);
    }
}