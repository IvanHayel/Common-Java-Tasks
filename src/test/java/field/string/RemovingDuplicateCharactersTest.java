package field.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemovingDuplicateCharactersTest {
  private static final String TEST_STRING = "aabbccddeeffgghhiijklmnopqrstuvwxyzzz";
  private static final String EXPECTED_STRING = "abcdefghijklmnopqrstuvwxyz";
  private static final String EMPTY_STRING = "";

  /**
   * Method under test: {@link RemovingDuplicateCharacters#removeDuplicatesFirstOption(String)}
   */
  @Test
  void testRemoveDuplicatesFirstOption() {
    assertEquals(EXPECTED_STRING, RemovingDuplicateCharacters.removeDuplicatesFirstOption(TEST_STRING));
    assertEquals(EMPTY_STRING, RemovingDuplicateCharacters.removeDuplicatesFirstOption(EMPTY_STRING));
  }

  /**
   * Method under test: {@link RemovingDuplicateCharacters#removeDuplicatesSecondOption(String)}
   */
  @Test
  void testRemoveDuplicatesSecondOption() {
    assertEquals(EXPECTED_STRING, RemovingDuplicateCharacters.removeDuplicatesSecondOption(TEST_STRING));
    assertEquals(EMPTY_STRING, RemovingDuplicateCharacters.removeDuplicatesSecondOption(EMPTY_STRING));
  }

  /**
   * Method under test: {@link RemovingDuplicateCharacters#removeDuplicatesThirdOption(String)}
   */
  @Test
  void testRemoveDuplicatesThirdOption() {
    assertEquals(EXPECTED_STRING, RemovingDuplicateCharacters.removeDuplicatesThirdOption(TEST_STRING));
    assertEquals(EMPTY_STRING, RemovingDuplicateCharacters.removeDuplicatesThirdOption(EMPTY_STRING));
  }
}

