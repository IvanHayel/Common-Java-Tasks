package field.string;

import static field.string.FindingFirstNonRepeatingCharacter.getFirstNonRepeatedCharacterFirstOptionASCII256;
import static field.string.FindingFirstNonRepeatingCharacter.getFirstNonRepeatedCharacterFirstOptionGeneral;
import static field.string.FindingFirstNonRepeatingCharacter.getFirstNonRepeatedCharacterSecondOptionASCII256;
import static field.string.FindingFirstNonRepeatingCharacter.getFirstNonRepeatedCharacterSecondOptionGeneral;
import static field.string.FindingFirstNonRepeatingCharacter.getFirstNonRepeatedCharacterThirdOptionGeneral;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class FindingFirstNonRepeatingCharacterTest {
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
   * Method under test:
   * {@link
   * FindingFirstNonRepeatingCharacter#getFirstNonRepeatedCharacterFirstOptionASCII256(String)}
   */
  @Test
  void testGetFirstNonRepeatedCharacterFirstOptionASCII256() {
    long start = System.nanoTime();
    char firstNonRepeatedCharacterFirstOptionASCII256 = getFirstNonRepeatedCharacterFirstOptionASCII256(
      LARGE_TEXT);
    long end = System.nanoTime();
    assertEquals('V', firstNonRepeatedCharacterFirstOptionASCII256);
    log.info("First option (ASCII 256): search for '{}' (took {} ms)",
      firstNonRepeatedCharacterFirstOptionASCII256, (end - start) / 1_000_000);
  }

  /**
   * Method under test:
   * {@link
   * FindingFirstNonRepeatingCharacter#getFirstNonRepeatedCharacterSecondOptionASCII256(String)}
   */
  @Test
  void testGetFirstNonRepeatedCharacterSecondOptionASCII256() {
    long start = System.nanoTime();
    char firstNonRepeatedCharacter = getFirstNonRepeatedCharacterSecondOptionASCII256(LARGE_TEXT);
    long end = System.nanoTime();
    assertEquals('V', firstNonRepeatedCharacter);
    log.info("Second option (ASCII 256): search for '{}' (took {} ms)", firstNonRepeatedCharacter,
      (end - start) / 1_000_000);
  }

  /**
   * Method under test:
   * {@link
   * FindingFirstNonRepeatingCharacter#getFirstNonRepeatedCharacterFirstOptionGeneral(String)}
   */
  @Test
  void testGetNonRepeatedCharacterFirstOptionGeneral() {
    long start = System.nanoTime();
    char firstNonRepeatedCharacter = getFirstNonRepeatedCharacterFirstOptionGeneral(LARGE_TEXT);
    long end = System.nanoTime();
    assertEquals('V', firstNonRepeatedCharacter);
    log.info("First option (general): search for '{}' (took {} ms)", firstNonRepeatedCharacter,
      (end - start) / 1_000_000);
  }

  /**
   * Method under test:
   * {@link
   * FindingFirstNonRepeatingCharacter#getFirstNonRepeatedCharacterSecondOptionGeneral(String)}
   */
  @Test
  void testGetNonRepeatedCharacterSecondOptionGeneral() {
    long start = System.nanoTime();
    char firstNonRepeatedCharacter = getFirstNonRepeatedCharacterSecondOptionGeneral(LARGE_TEXT);
    long end = System.nanoTime();
    assertEquals('V', firstNonRepeatedCharacter);
    log.info("Second option (general): search for '{}' (took {} ms)", firstNonRepeatedCharacter,
      (end - start) / 1_000_000);
  }

  /**
   * Method under test:
   * {@link
   * FindingFirstNonRepeatingCharacter#getFirstNonRepeatedCharacterThirdOptionGeneral(String)}
   */
  @Test
  void testGetNonRepeatedCharacterThirdOptionGeneral() {
    long start = System.nanoTime();
    String firstNonRepeatedCharacter = getFirstNonRepeatedCharacterThirdOptionGeneral(LARGE_TEXT);
    long end = System.nanoTime();
    assertEquals("V", firstNonRepeatedCharacter);
    log.info("Third option (general): search for '{}' (took {} ms)", firstNonRepeatedCharacter,
      (end - start) / 1_000_000);
  }
}