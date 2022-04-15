package field.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

import static field.string.CheckingContainsOnlyDigits.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class CheckingContainsOnlyDigitsTest {
    private static final String FOUR_MILLION_DIGITS_NAME = "four-million-digits.txt";
    private static final URL LARGE_TEXT_URL = CheckingContainsOnlyDigitsTest.class
            .getClassLoader()
            .getResource(FOUR_MILLION_DIGITS_NAME);
    private static final String FOUR_MILLION_DIGITS;

    static {
        try {
            FOUR_MILLION_DIGITS = Files.readString(Path.of(LARGE_TEXT_URL.toURI()));
            log.info("Loaded four-million-digits.txt. Symbols: {}", FOUR_MILLION_DIGITS.length());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method under test: {@link CheckingContainsOnlyDigits#containsOnlyDigitsFirstOption(String)}
     */
    @Test
    void testContainsOnlyDigitsFirstOption() {
        assertFalse(containsOnlyDigitsFirstOption("Text"));
        assertTrue(containsOnlyDigitsFirstOption("3301"));
        long start = System.nanoTime();
        boolean isContainsOnlyDigits = containsOnlyDigitsFirstOption(FOUR_MILLION_DIGITS);
        long end = System.nanoTime();
        assertTrue(isContainsOnlyDigits);
        log.info("First option: took {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link CheckingContainsOnlyDigits#containsOnlyDigitsSecondOption(String)}
     */
    @Test
    void testContainsOnlyDigitsSecondOption() {
        assertFalse(containsOnlyDigitsSecondOption("Text"));
        assertTrue(containsOnlyDigitsSecondOption("3301"));
        long start = System.nanoTime();
        boolean isContainsOnlyDigits = containsOnlyDigitsSecondOption(FOUR_MILLION_DIGITS);
        long end = System.nanoTime();
        assertTrue(isContainsOnlyDigits);
        log.info("Second option: took {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link CheckingContainsOnlyDigits#containsOnlyDigitsThirdOption(String)}
     */
    @Test
    void testContainsOnlyDigitsThirdOption() {
        assertFalse(containsOnlyDigitsThirdOption("Text"));
        assertTrue(containsOnlyDigitsThirdOption("3301"));
        long start = System.nanoTime();
        boolean isContainsOnlyDigits = containsOnlyDigitsThirdOption(FOUR_MILLION_DIGITS);
        long end = System.nanoTime();
        assertTrue(isContainsOnlyDigits);
        log.info("Third option: took {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link CheckingContainsOnlyDigits#containsOnlyDigitsApacheCommonsLang(String)}
     */
    @Test
    void testContainsOnlyDigitsApacheCommonsLang() {
        assertFalse(containsOnlyDigitsApacheCommonsLang("Text"));
        assertTrue(containsOnlyDigitsApacheCommonsLang("3301"));
        long start = System.nanoTime();
        boolean isContainsOnlyDigits = containsOnlyDigitsApacheCommonsLang(FOUR_MILLION_DIGITS);
        long end = System.nanoTime();
        assertTrue(isContainsOnlyDigits);
        log.info("Apache Commons Lang: took {} ms", (end - start) / 1_000_000);
    }
}

