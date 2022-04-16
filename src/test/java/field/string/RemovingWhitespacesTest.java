package field.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

import static field.string.RemovingWhitespaces.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class RemovingWhitespacesTest {
    private static final String LARGE_TEXT_NAME = "large-test-text.txt";
    private static final URL LARGE_TEXT_URL = CountingDuplicatedCharactersTest.class
            .getClassLoader()
            .getResource(LARGE_TEXT_NAME);
    private static final String LARGE_TEXT;
    private static final String SIMPLE_TEXT = "Virtually!";

    static {
        try {
            LARGE_TEXT = Files.readString(Path.of(LARGE_TEXT_URL.toURI()));
            log.info("Loaded large-test-text.txt. Symbols: {}", LARGE_TEXT.length());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method under test: {@link RemovingWhitespaces#removeWhitespacesCommon(String)}
     */
    @Test
    void testRemoveWhitespacesCommon() {
        assertEquals(SIMPLE_TEXT, removeWhitespacesCommon(SIMPLE_TEXT));
        long start = System.nanoTime();
        String largeTextWithoutWhitespaces = removeWhitespacesCommon(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Common: spaces removed - {} took {} ms", LARGE_TEXT.length() - largeTextWithoutWhitespaces.length(), (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link RemovingWhitespaces#removeWhitespacesApache(String)}
     */
    @Test
    void testRemoveWhitespacesApache() {
        assertEquals(SIMPLE_TEXT, removeWhitespacesApache(SIMPLE_TEXT));
        long start = System.nanoTime();
        String largeTextWithoutWhitespaces = removeWhitespacesApache(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Apache: spaces removed - {} took {} ms", LARGE_TEXT.length() - largeTextWithoutWhitespaces.length(), (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link RemovingWhitespaces#removeWhitespacesSpring(String)}
     */
    @Test
    void testRemoveWhitespacesSpring() {
        assertEquals(SIMPLE_TEXT, removeWhitespacesSpring(SIMPLE_TEXT));
        long start = System.nanoTime();
        String largeTextWithoutWhitespaces = removeWhitespacesSpring(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Spring: spaces removed - {} took {} ms", LARGE_TEXT.length() - largeTextWithoutWhitespaces.length(), (end - start) / 1_000_000);
    }
}