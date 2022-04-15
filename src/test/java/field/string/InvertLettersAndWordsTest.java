package field.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

import static field.string.InvertLettersAndWords.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class InvertLettersAndWordsTest {
    private static final String LARGE_TEXT_NAME = "large-test-text.txt";
    private static final URL LARGE_TEXT_URL = FindingFirstNonRepeatingCharacterTest.class
            .getClassLoader()
            .getResource(LARGE_TEXT_NAME);
    private static final String LARGE_TEXT;

    static {
        try {
            LARGE_TEXT = Files.readString(Path.of(LARGE_TEXT_URL.toURI()));
            log.info("Loaded large-test-text.txt. Symbols: {}", LARGE_TEXT.length());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method under test: {@link InvertLettersAndWords#invertFirstOption(String)}
     */
    @Test
    void testInvertFirstOption() {
        assertEquals("txeT", invertFirstOption("Text"));
        long start = System.nanoTime();
        String invertedText = invertFirstOption(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("First option: inverted text in {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link InvertLettersAndWords#invertSecondOption(String)}
     */
    @Test
    void testInvertSecondOption() {
        assertEquals("txeT", invertSecondOption("Text"));
        long start = System.nanoTime();
        String invertedText = invertSecondOption(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Second option: inverted text in {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link InvertLettersAndWords#invertThirdOption(String)}
     */
    @Test
    void testInvertThirdOption() {
        assertEquals("txeT", invertThirdOption("Text"));
        long start = System.nanoTime();
        String invertedText = invertThirdOption(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Third option: inverted text in {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link InvertLettersAndWords#invertApacheCommonsLang(String)}
     */
    @Test
    void testInvertApacheCommonsLang() {
        assertEquals("txeT", invertApacheCommonsLang("Text"));
        long start = System.nanoTime();
        String invertedText = invertApacheCommonsLang(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Apache Commons Lang: inverted text in {} ms", (end - start) / 1_000_000);
    }
}