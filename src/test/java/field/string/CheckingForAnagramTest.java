package field.string;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CheckingForAnagramTest {
  private static final String FIRST_STRING = "H e LL o";
  private static final String SECOND_STRING = " o l L He ";
  private static final String NOT_ANAGRAM_STRING = "Ola";
  private static final String EMPTY_STRING = "";
  private static final String BLANK_STRING = "                        ";

  /**
   * Method under test: {@link CheckingForAnagram#isAnagram(String, String)}
   */
  @Test
  void testIsAnagram() {
    assertTrue(CheckingForAnagram.isAnagram(FIRST_STRING, SECOND_STRING));
    assertFalse(CheckingForAnagram.isAnagram(FIRST_STRING, NOT_ANAGRAM_STRING));
    assertFalse(CheckingForAnagram.isAnagram(FIRST_STRING, EMPTY_STRING));
    assertFalse(CheckingForAnagram.isAnagram(FIRST_STRING, BLANK_STRING));
  }
}

