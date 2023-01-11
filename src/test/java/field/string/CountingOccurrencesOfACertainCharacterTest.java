package field.string;

import static field.string.CountingOccurrencesOfACertainCharacter.countApacheStringUtilsCountMatches;
import static field.string.CountingOccurrencesOfACertainCharacter.countCommonFirstOption;
import static field.string.CountingOccurrencesOfACertainCharacter.countCommonSecondOption;
import static field.string.CountingOccurrencesOfACertainCharacter.countCommonThirdOption;
import static field.string.CountingOccurrencesOfACertainCharacter.countConsideringUnicodeSurrogatePairs;
import static field.string.CountingOccurrencesOfACertainCharacter.countGuavaCharMatcherCountIn;
import static field.string.CountingOccurrencesOfACertainCharacter.countSpringStringUtilsCountOccurrencesOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class CountingOccurrencesOfACertainCharacterTest {
  private static final String LARGE_TEXT_NAME = "large-test-text.txt";
  private static final URL LARGE_TEXT_URL = CountingOccurrencesOfACertainCharacterTest.class
    .getClassLoader()
    .getResource(LARGE_TEXT_NAME);
  private static final String LARGE_TEXT;
  private static final String SIMPLE_TEXT =
    "The girl is more sensor now than space suit. post-apocalyptic and never most unusual.";

  static {
    try {
      LARGE_TEXT = Files.readString(Path.of(LARGE_TEXT_URL.toURI()));
      log.info("Loaded large-test-text.txt. Symbols: {}", LARGE_TEXT.length());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Method under test:
   * {@link CountingOccurrencesOfACertainCharacter#countCommonFirstOption(String, char)}
   */
  @Test
  void testCountCommonFirstOption() {
    assertEquals(6, countCommonFirstOption(SIMPLE_TEXT, 'a'));
    long start = System.nanoTime();
    int result = countCommonFirstOption(LARGE_TEXT, 'a');
    long end = System.nanoTime();
    log.info("First option: 'a' - {} took {} ms", result, (end - start) / 1_000_000);
  }

  /**
   * Method under test:
   * {@link CountingOccurrencesOfACertainCharacter#countCommonSecondOption(String, char)}
   */
  @Test
  void testCountCommonSecondOption() {
    assertEquals(6, countCommonSecondOption(SIMPLE_TEXT, 'a'));
    long start = System.nanoTime();
    int result = countCommonSecondOption(LARGE_TEXT, 'a');
    long end = System.nanoTime();
    log.info("Second option: 'a' - {} took {} ms", result, (end - start) / 1_000_000);
  }

  /**
   * Method under test:
   * {@link CountingOccurrencesOfACertainCharacter#countCommonThirdOption(String, char)}
   */
  @Test
  void testCountCommonThirdOption() {
    assertEquals(6, countCommonThirdOption(SIMPLE_TEXT, 'a'));
    long start = System.nanoTime();
    long result = countCommonThirdOption(LARGE_TEXT, 'a');
    long end = System.nanoTime();
    log.info("Third option: 'a' - {} took {} ms", result, (end - start) / 1_000_000);
  }

  /**
   * Method under test:
   * {@link CountingOccurrencesOfACertainCharacter#countConsideringUnicodeSurrogatePairs(String,
   * String)}
   */
  @Test
  void testCountConsideringUnicodeSurrogatePairs() {
    assertEquals(6, countConsideringUnicodeSurrogatePairs(SIMPLE_TEXT, "a"));
    long start = System.nanoTime();
    int result = countConsideringUnicodeSurrogatePairs(LARGE_TEXT, "a");
    long end = System.nanoTime();
    log.info("Unicode surrogate pairs: 'a' - {} took {} ms", result, (end - start) / 1_000_000);
  }

  /**
   * Method under test:
   * {@link CountingOccurrencesOfACertainCharacter#countApacheStringUtilsCountMatches(String,
   * String)}
   */
  @Test
  void testCountApacheStringUtilsCountMatches() {
    assertEquals(6, countApacheStringUtilsCountMatches(SIMPLE_TEXT, "a"));
    long start = System.nanoTime();
    int result = countApacheStringUtilsCountMatches(LARGE_TEXT, "a");
    long end = System.nanoTime();
    log.info("Apache: 'a' - {} took {} ms", result, (end - start) / 1_000_000);
  }

  /**
   * Method under test:
   * {@link CountingOccurrencesOfACertainCharacter#countSpringStringUtilsCountOccurrencesOf(String,
   * String)}
   */
  @Test
  void testCountSpringStringUtilsCountOccurrencesOf() {
    assertEquals(6, countSpringStringUtilsCountOccurrencesOf(SIMPLE_TEXT, "a"));
    long start = System.nanoTime();
    int result = countSpringStringUtilsCountOccurrencesOf(LARGE_TEXT, "a");
    long end = System.nanoTime();
    log.info("Spring: 'a' - {} took {} ms", result, (end - start) / 1_000_000);
  }

  /**
   * Method under test:
   * {@link CountingOccurrencesOfACertainCharacter#countGuavaCharMatcherCountIn(String, char)}
   */
  @Test
  void testCountGuavaCharMatcherCountIn() {
    assertEquals(6, countGuavaCharMatcherCountIn(SIMPLE_TEXT, 'a'));
    long start = System.nanoTime();
    int result = countGuavaCharMatcherCountIn(LARGE_TEXT, 'a');
    long end = System.nanoTime();
    log.info("Guava: 'a' - {} took {} ms", result, (end - start) / 1_000_000);
  }
}