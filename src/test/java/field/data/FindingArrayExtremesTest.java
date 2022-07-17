package field.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindingArrayExtremesTest {
  private static final int[] TEST_ARRAY = {1, 2, 3, 4, 5};
  private static final int EXPECTED_MAX = 5;
  private static final double EXPECTED_AVERAGE = 3.0;

  /**
   * Method under test: {@link FindingArrayExtremes#findMaxFirstOption(int[])}
   */
  @Test
  void testFindMaxFirstOption() {
    assertEquals(EXPECTED_MAX, FindingArrayExtremes.findMaxFirstOption(TEST_ARRAY));
  }

  /**
   * Method under test: {@link FindingArrayExtremes#findMaxSecondOption(int[])}
   */
  @Test
  void testFindMaxSecondOption() {
    assertEquals(EXPECTED_MAX, FindingArrayExtremes.findMaxSecondOption(TEST_ARRAY));
  }

  /**
   * Method under test: {@link FindingArrayExtremes#findMaxThirdOption(int[])}
   */
  @Test
  void testFindMaxThirdOption() {
    assertEquals(EXPECTED_MAX, FindingArrayExtremes.findMaxThirdOption(TEST_ARRAY));
  }

  /**
   * Method under test: {@link FindingArrayExtremes#calculateAverageFirstOption(int[])}
   */
  @Test
  void testCalculateAverageFirstOption() {
    assertEquals(EXPECTED_AVERAGE, FindingArrayExtremes.calculateAverageFirstOption(TEST_ARRAY));
  }

  /**
   * Method under test: {@link FindingArrayExtremes#calculateAverageSecondOption(int[])}
   */
  @Test
  void testCalculateAverageSecondOption() {
    assertEquals(EXPECTED_AVERAGE, FindingArrayExtremes.calculateAverageSecondOption(TEST_ARRAY));
  }
}
