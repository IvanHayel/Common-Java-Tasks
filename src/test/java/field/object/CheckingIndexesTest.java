package field.object;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CheckingIndexesTest {
  /**
   * Method under test: {@link CheckingIndexes#isIndexValidFirstOption(int, int)}
   */
  @Test
  void testIsIndexValidFirstOption() {
    assertFalse(CheckingIndexes.isIndexValidFirstOption(1, 1));
    assertTrue(CheckingIndexes.isIndexValidFirstOption(0, 1));
    assertFalse(CheckingIndexes.isIndexValidFirstOption(-1, 1));
  }

  /**
   * Method under test: {@link CheckingIndexes#isIndexValidSecondOption(int, int)}
   */
  @Test
  void testIsIndexValidSecondOption() {
    assertFalse(CheckingIndexes.isIndexValidSecondOption(1, 1));
    assertTrue(CheckingIndexes.isIndexValidSecondOption(0, 1));
  }

  /**
   * Method under test: {@link CheckingIndexes#isIntervalValidFirstOption(int, int, int)}
   */
  @Test
  void testIsIntervalValidFirstOption() {
    assertFalse(CheckingIndexes.isIntervalValidFirstOption(1, 1, 1));
    assertFalse(CheckingIndexes.isIntervalValidFirstOption(-1, 1, 1));
    assertTrue(CheckingIndexes.isIntervalValidFirstOption(1, 0, 1));
  }

  /**
   * Method under test: {@link CheckingIndexes#isIntervalValidSecondOption(int, int, int)}
   */
  @Test
  void testIsIntervalValidSecondOption() {
    assertTrue(CheckingIndexes.isIntervalValidSecondOption(1, 1, 1));
    assertFalse(CheckingIndexes.isIntervalValidSecondOption(-1, 1, 1));
  }
}

