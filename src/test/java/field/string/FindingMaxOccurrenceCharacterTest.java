package field.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

class FindingMaxOccurrenceCharacterTest {
  private static final String TEST_STRING = "Hello World";
  private static final Pair<Character, Integer> EXPECTED_RESULT_INTEGER = Pair.of('l', 3);
  private static final Pair<Character, Long> EXPECTED_RESULT_LONG = Pair.of('l', 3L);

  /**
   * Method under test:
   * {@link FindingMaxOccurrenceCharacter#maxOccurrenceCharacterFirstOption(String)}
   */
  @Test
  void testMaxOccurrenceCharacterFirstOption() {
    Pair<Character, Integer> result =
      FindingMaxOccurrenceCharacter.maxOccurrenceCharacterFirstOption(TEST_STRING);
    assertEquals(EXPECTED_RESULT_INTEGER, result);
  }

  /**
   * Method under test:
   * {@link FindingMaxOccurrenceCharacter#maxOccurrenceCharacterSecondOption(String)}
   */
  @Test
  void testMaxOccurrenceCharacterSecondOption() {
    Pair<Character, Integer> result =
      FindingMaxOccurrenceCharacter.maxOccurrenceCharacterSecondOption(TEST_STRING);
    assertEquals(EXPECTED_RESULT_INTEGER, result);
  }

  /**
   * Method under test:
   * {@link FindingMaxOccurrenceCharacter#maxOccurrenceCharacterThirdOption(String)}
   */
  @Test
  void testMaxOccurrenceCharacterThirdOption() {
    Pair<Character, Long> result =
      FindingMaxOccurrenceCharacter.maxOccurrenceCharacterThirdOption(TEST_STRING);
    assertEquals(EXPECTED_RESULT_LONG, result);
  }
}

