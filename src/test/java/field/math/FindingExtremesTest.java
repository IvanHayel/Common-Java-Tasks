package field.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FindingExtremesTest {
  /**
   * Method under test: {@link FindingExtremes#minMath(int, int)}
   */
  @Test
  void testMinMath() {
    assertEquals(1, FindingExtremes.minMath(1, 1));
    assertEquals(1, FindingExtremes.minMath(3, 1));
    assertEquals(0, FindingExtremes.minMath(0, 1));
    assertEquals(-1, FindingExtremes.minMath(-1, 1));
  }

  /**
   * Method under test: {@link FindingExtremes#maxMath(int, int)}
   */
  @Test
  void testMaxMath() {
    assertEquals(1, FindingExtremes.maxMath(1, 1));
    assertEquals(3, FindingExtremes.maxMath(3, 1));
    assertEquals(1, FindingExtremes.maxMath(0, 1));
    assertEquals(1, FindingExtremes.maxMath(-1, 1));
  }

  /**
   * Method under test: {@link FindingExtremes#minWrapper(int, int)}
   */
  @Test
  void testMinWrapper() {
    assertEquals(1, FindingExtremes.minWrapper(1, 1));
    assertEquals(1, FindingExtremes.minWrapper(3, 1));
    assertEquals(0, FindingExtremes.minWrapper(0, 1));
    assertEquals(-1, FindingExtremes.minWrapper(-1, 1));
  }

  /**
   * Method under test: {@link FindingExtremes#maxWrapper(int, int)}
   */
  @Test
  void testMaxWrapper() {
    assertEquals(1, FindingExtremes.maxWrapper(1, 1));
    assertEquals(3, FindingExtremes.maxWrapper(3, 1));
    assertEquals(1, FindingExtremes.maxWrapper(0, 1));
    assertEquals(1, FindingExtremes.maxWrapper(-1, 1));
  }

  /**
   * Method under test: {@link FindingExtremes#minBinaryOperator(int, int)}
   */
  @Test
  void testMinBinaryOperator() {
    assertEquals(1, FindingExtremes.minBinaryOperator(1, 1));
    assertEquals(1, FindingExtremes.minBinaryOperator(3, 1));
    assertEquals(0, FindingExtremes.minBinaryOperator(0, 1));
    assertEquals(-1, FindingExtremes.minBinaryOperator(-1, 1));
  }

  /**
   * Method under test: {@link FindingExtremes#maxBinaryOperator(int, int)}
   */
  @Test
  void testMaxBinaryOperator() {
    assertEquals(1, FindingExtremes.maxBinaryOperator(1, 1));
    assertEquals(3, FindingExtremes.maxBinaryOperator(3, 1));
    assertEquals(1, FindingExtremes.maxBinaryOperator(0, 1));
    assertEquals(1, FindingExtremes.maxBinaryOperator(-1, 1));
  }
}

