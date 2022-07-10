package field.string;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CheckingContainsTextTest {
  private static final String TEXT = "abcdefghijklmnopqrstuvwxyz";
  private static final String SUBSTRING = "abc";
  private static final String NOT_SUBSTRING = "JDBC";
  private static final String EMPTY_STRING = "";

  /**
   * Method under test: {@link CheckingContainsText#containsFirstOption(String, String)}
   */
  @Test
  void testContainsFirstOption() {
    assertTrue(CheckingContainsText.containsFirstOption(TEXT, SUBSTRING));
    assertFalse(CheckingContainsText.containsFirstOption(TEXT, NOT_SUBSTRING));
    assertTrue(CheckingContainsText.containsFirstOption(TEXT, EMPTY_STRING));
  }

  /**
   * Method under test: {@link CheckingContainsText#containsSecondOption(String, String)}
   */
  @Test
  void testContainsSecondOption() {
    assertTrue(CheckingContainsText.containsSecondOption(TEXT, SUBSTRING));
    assertFalse(CheckingContainsText.containsSecondOption(TEXT, NOT_SUBSTRING));
    assertTrue(CheckingContainsText.containsSecondOption(TEXT, EMPTY_STRING));
  }

  /**
   * Method under test: {@link CheckingContainsText#containsThirdOption(String, String)}
   */
  @Test
  void testContainsThirdOption() {
    assertTrue(CheckingContainsText.containsThirdOption(TEXT, SUBSTRING));
    assertFalse(CheckingContainsText.containsThirdOption(TEXT, NOT_SUBSTRING));
    assertTrue(CheckingContainsText.containsThirdOption(TEXT, EMPTY_STRING));
  }

  /**
   * Method under test: {@link CheckingContainsText#containsApache(String, String)}
   */
  @Test
  void testContainsApache() {
    assertTrue(CheckingContainsText.containsApache(TEXT, SUBSTRING));
    assertFalse(CheckingContainsText.containsApache(TEXT, NOT_SUBSTRING));
    assertTrue(CheckingContainsText.containsApache(TEXT, EMPTY_STRING));
  }
}

