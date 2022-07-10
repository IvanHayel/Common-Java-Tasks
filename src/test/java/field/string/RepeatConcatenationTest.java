package field.string;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RepeatConcatenationTest {
  private static final String TEST_STRING = "3301";
  private static final int TEST_TIMES = 3;
  private static final String EXPECTED_RESULT = "330133013301";

  /**
   * Method under test: {@link RepeatConcatenation#repeatFirstOption(String, int)}
   */
  @Test
  void testRepeatFirstOption() {
    assertEquals(EXPECTED_RESULT, RepeatConcatenation.repeatFirstOption(TEST_STRING, TEST_TIMES));
  }

  /**
   * Method under test: {@link RepeatConcatenation#repeatSecondOption(String, int)}
   */
  @Test
  void testRepeatSecondOption() {
    assertEquals(EXPECTED_RESULT, RepeatConcatenation.repeatSecondOption(TEST_STRING, TEST_TIMES));
  }

  /**
   * Method under test: {@link RepeatConcatenation#repeatThirdOption(String, int)}
   */
  @Test
  void testRepeatThirdOption() {
    assertEquals(EXPECTED_RESULT, RepeatConcatenation.repeatThirdOption(TEST_STRING, TEST_TIMES));
  }

  /**
   * Method under test: {@link RepeatConcatenation#repeatFourthOption(String, int)}
   */
  @Test
  void testRepeatFourthOption() {
    assertEquals(EXPECTED_RESULT, RepeatConcatenation.repeatFourthOption(TEST_STRING, TEST_TIMES));
  }

  /**
   * Method under test: {@link RepeatConcatenation#repeatFifthOption(String, int)}
   */
  @Test
  void testRepeatFifthOption() {
    assertEquals(EXPECTED_RESULT, RepeatConcatenation.repeatFifthOption(TEST_STRING, TEST_TIMES));
  }

  /**
   * Method under test: {@link RepeatConcatenation#repeatSixthOption(String, int)}
   */
  @Test
  void testRepeatSixthOption() {
    assertEquals(EXPECTED_RESULT, RepeatConcatenation.repeatSixthOption(TEST_STRING, TEST_TIMES));
  }

  /**
   * Method under test: {@link RepeatConcatenation#repeatApache(String, int)}
   */
  @Test
  void testRepeatApache() {
    assertEquals(EXPECTED_RESULT, RepeatConcatenation.repeatApache(TEST_STRING, TEST_TIMES));
  }

  /**
   * Method under test: {@link RepeatConcatenation#repeatGuava(String, int)}
   */
  @Test
  void testRepeatGuava() {
    assertEquals(EXPECTED_RESULT, RepeatConcatenation.repeatGuava(TEST_STRING, TEST_TIMES));
  }

  /**
   * Method under test: {@link RepeatConcatenation#hasOnlySubstrings(String)}
   */
  @Test
  void testHasOnlySubstrings() {
    assertFalse(RepeatConcatenation.hasOnlySubstrings(TEST_STRING));
    assertFalse(RepeatConcatenation.hasOnlySubstrings("0123456789"));
    assertTrue(RepeatConcatenation.hasOnlySubstrings(EXPECTED_RESULT));
    assertTrue(RepeatConcatenation.hasOnlySubstrings("01234567890123456789"));
  }
}

