package field.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountingOccurrencesOfSubstringTest {
  private static final String TEST_STRING = "111 111 111 111111 111111 111111111111";
  private static final String SUBSTRING = "111";
  private static final int EXPECTED_RESULT = 11;

  /**
   * Method under test:
   * {@link CountingOccurrencesOfSubstring#countOccurrencesFirstOption(String, String)}
   */
  @Test
  void testCountOccurrencesFirstOption() {
    int result = CountingOccurrencesOfSubstring.countOccurrencesFirstOption(TEST_STRING, SUBSTRING);
    assertEquals(EXPECTED_RESULT, result);
  }

  /**
   * Method under test:
   * {@link CountingOccurrencesOfSubstring#countOccurrencesSecondOption(String, String)}
   */
  @Test
  void testCountOccurrencesSecondOption() {
    int result = CountingOccurrencesOfSubstring.countOccurrencesSecondOption(TEST_STRING,
      SUBSTRING);
    assertEquals(EXPECTED_RESULT, result);
  }

  /**
   * Method under test:
   * {@link CountingOccurrencesOfSubstring#countOccurrencesThirdOption(String, String)}
   */
  @Test
  void testCountOccurrencesThirdOption() {
    int result = CountingOccurrencesOfSubstring.countOccurrencesThirdOption(TEST_STRING, SUBSTRING);
    assertEquals(EXPECTED_RESULT, result);
  }
}

