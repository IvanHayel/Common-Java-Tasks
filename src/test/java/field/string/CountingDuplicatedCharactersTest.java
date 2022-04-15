package field.string;

import com.google.common.collect.Multiset;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static field.string.CountingDuplicatedCharacters.*;

@Slf4j
class CountingDuplicatedCharactersTest {
    private static final String LARGE_TEXT_NAME = "large-test-text.txt";
    private static final URL LARGE_TEXT_URL = CountingDuplicatedCharactersTest.class
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
     * Method under test: {@link CountingDuplicatedCharacters#countDuplicatedCharactersFirstOptionUTF16(String)}
     */
    @Test
    void testCountDuplicatedCharactersFirstOptionUTF16() {
        long start = System.nanoTime();
        Map<Character, Integer> map = countDuplicatedCharactersFirstOptionUTF16(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("First option UTF16: search for Map<Character, Integer> took {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link CountingDuplicatedCharacters#countDuplicatedCharactersSecondOptionUTF16(String)}
     */
    @Test
    void testCountDuplicatedCharactersSecondOptionUTF16() {
        long start = System.nanoTime();
        Map<Character, Integer> map = countDuplicatedCharactersSecondOptionUTF16(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Second option UTF16: search for Map<Character, Integer> took {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link CountingDuplicatedCharacters#countDuplicatedCharactersThirdOptionUTF16(String)}
     */
    @Test
    void testCountDuplicatedCharactersThirdOptionUTF16() {
        long start = System.nanoTime();
        Map<Character, Long> map = countDuplicatedCharactersThirdOptionUTF16(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Third option UTF16: search for Map<Character, Long> took {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link CountingDuplicatedCharacters#countDuplicatedCharactersFirstOptionUTF32(String)}
     */
    @Test
    void testCountDuplicatedCharactersFirstOptionUTF32() {
        long start = System.nanoTime();
        Map<String, Integer> map = countDuplicatedCharactersFirstOptionUTF32(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("First option UTF32: search for Map<String, Integer> took {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link CountingDuplicatedCharacters#countDuplicatedCharactersSecondOptionUTF32(String)}
     */
    @Test
    void testCountDuplicatedCharactersSecondOptionUTF32() {
        long start = System.nanoTime();
        Map<String, Integer> map = countDuplicatedCharactersSecondOptionUTF32(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Second option UTF32: search for Map<String, Integer> took {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link CountingDuplicatedCharacters#countDuplicatedCharactersThirdOptionUTF32(String)}
     */
    @Test
    void testCountDuplicatedCharactersThirdOptionUTF32() {
        long start = System.nanoTime();
        Map<String, Long> map = countDuplicatedCharactersThirdOptionUTF32(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Third option UTF32: search for Map<String, Long> took {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link CountingDuplicatedCharacters#countDuplicatedCharactersGuava(String)}
     */
    @Test
    void testCountDuplicatedCharactersGuava() {
        long start = System.nanoTime();
        Multiset<String> map = countDuplicatedCharactersGuava(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Guava: search for Multiset<String> took {} ms", (end - start) / 1_000_000);
    }
}