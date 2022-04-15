package field.string;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

import static field.string.CountingVowelsAndConsonants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class CountingVowelsAndConsonantsTest {
    private static final String LARGE_TEXT_NAME = "large-test-text.txt";
    private static final URL LARGE_TEXT_URL = CountingVowelsAndConsonantsTest.class
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
     * Method under test: {@link CountingVowelsAndConsonants#countVowelsAndConsonantsFirstOption(String)}
     */
    @Test
    void testCountVowelsAndConsonantsFirstOption() {
        Pair<Integer, Integer> actualCountVowelsAndConsonantsFirstOptionResult = countVowelsAndConsonantsFirstOption("Text");
        assertEquals(1, actualCountVowelsAndConsonantsFirstOptionResult.getKey().intValue());
        assertEquals(3, actualCountVowelsAndConsonantsFirstOptionResult.getValue().intValue());
        long start = System.nanoTime();
        Pair<Integer, Integer> quantityVowelsAndConsonants = countVowelsAndConsonantsFirstOption(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("First option: took {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link CountingVowelsAndConsonants#countVowelsAndConsonantsSecondOption(String)}
     */
    @Test
    void testCountVowelsAndConsonantsSecondOption() {
        Pair<Long, Long> actualCountVowelsAndConsonantsSecondOptionResult = CountingVowelsAndConsonants
                .countVowelsAndConsonantsSecondOption("Text");
        assertEquals(1L, actualCountVowelsAndConsonantsSecondOptionResult.getKey().longValue());
        assertEquals(3L, actualCountVowelsAndConsonantsSecondOptionResult.getValue().longValue());
        long start = System.nanoTime();
        Pair<Long, Long> quantityVowelsAndConsonants = countVowelsAndConsonantsSecondOption(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Second option: took {} ms", (end - start) / 1_000_000);
    }

    /**
     * Method under test: {@link CountingVowelsAndConsonants#countVowelsAndConsonantsThirdOption(String)}
     */
    @Test
    void testCountVowelsAndConsonantsThirdOption() {
        Pair<Long, Long> actualCountVowelsAndConsonantsThirdOptionResult = CountingVowelsAndConsonants
                .countVowelsAndConsonantsThirdOption("Text");
        assertEquals(1L, actualCountVowelsAndConsonantsThirdOptionResult.getKey().longValue());
        assertEquals(3L, actualCountVowelsAndConsonantsThirdOptionResult.getValue().longValue());
        long start = System.nanoTime();
        Pair<Long, Long> quantityVowelsAndConsonants = countVowelsAndConsonantsThirdOption(LARGE_TEXT);
        long end = System.nanoTime();
        log.info("Third option: took {} ms", (end - start) / 1_000_000);
    }
}