package field.string;

import static field.string.InvertingLettersAndWords.invertApacheCommonsLang;
import static field.string.InvertingLettersAndWords.invertFirstOption;
import static field.string.InvertingLettersAndWords.invertSecondOption;
import static field.string.InvertingLettersAndWords.invertThirdOption;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class InvertingLettersAndWordsTest {
  private static final String LARGE_TEXT_NAME = "large-test-text.txt";
  private static final URL LARGE_TEXT_URL = InvertingLettersAndWordsTest.class
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
   * Method under test: {@link InvertingLettersAndWords#invertFirstOption(String)}
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
   * Method under test: {@link InvertingLettersAndWords#invertSecondOption(String)}
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
   * Method under test: {@link InvertingLettersAndWords#invertThirdOption(String)}
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
   * Method under test: {@link InvertingLettersAndWords#invertApacheCommonsLang(String)}
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