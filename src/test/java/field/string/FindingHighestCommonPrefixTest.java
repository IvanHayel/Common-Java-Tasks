package field.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindingHighestCommonPrefixTest {
  private static final String[] TEST_ARRAY = {"flower", "flow", "flight"};
  private static final String EXPECTED_PREFIX = "fl";

  /**
   * Method under test: {@link FindingHighestCommonPrefix#findPrefixFirstOption(String[])}
   */
  @Test
  void testFindPrefixFirstOption() {
    assertEquals(EXPECTED_PREFIX, FindingHighestCommonPrefix.findPrefixFirstOption(TEST_ARRAY));
  }

  /**
   * Method under test: {@link FindingHighestCommonPrefix#findPrefixSecondOption(String[])}
   */
  @Test
  void testFindPrefixSecondOption() {
    assertEquals(EXPECTED_PREFIX, FindingHighestCommonPrefix.findPrefixSecondOption(TEST_ARRAY));
  }
}

