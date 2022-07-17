package field.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FindingArrayElementTest {
  private static final int[] TEST_ARRAY = {121, 122, 123, 124, 125, 126, 127, 128, 129, 1301};
  private static final int[] TEST_ARRAY_WITH_NO_ELEMENT = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  private static final int TEST_ELEMENT = 1301;
  private static final int TEST_ELEMENT_INDEX = 9;

  /**
   * Method under test: {@link FindingArrayElement#containsElementFirstOption(int[], int)}
   */
  @Test
  void testContainsElementFirstOption() {
    assertTrue(FindingArrayElement.containsElementFirstOption(TEST_ARRAY, TEST_ELEMENT));
    assertFalse(
        FindingArrayElement.containsElementFirstOption(TEST_ARRAY_WITH_NO_ELEMENT, TEST_ELEMENT));
  }

  /**
   * Method under test: {@link FindingArrayElement#containsElementSecondOption(int[], int)}
   */
  @Test
  void testContainsElementSecondOption() {
    assertTrue(FindingArrayElement.containsElementSecondOption(TEST_ARRAY, TEST_ELEMENT));
    assertFalse(
        FindingArrayElement.containsElementSecondOption(TEST_ARRAY_WITH_NO_ELEMENT, TEST_ELEMENT));
  }

  /**
   * Method under test: {@link FindingArrayElement#containsElementThirdOption(int[], int)}
   */
  @Test
  void testContainsElementThirdOption() {
    assertTrue(FindingArrayElement.containsElementThirdOption(TEST_ARRAY, TEST_ELEMENT));
    assertFalse(
        FindingArrayElement.containsElementThirdOption(TEST_ARRAY_WITH_NO_ELEMENT, TEST_ELEMENT));
  }

  /**
   * Method under test: {@link FindingArrayElement#findIndexOfElementFirstOption(int[], int)}
   */
  @Test
  void testFindIndexOfElementFirstOption() {
    assertEquals(TEST_ELEMENT_INDEX, FindingArrayElement.findIndexOfElementFirstOption(TEST_ARRAY,
        TEST_ELEMENT));
    assertEquals(-1, FindingArrayElement.findIndexOfElementFirstOption(TEST_ARRAY_WITH_NO_ELEMENT,
        TEST_ELEMENT));
  }

  /**
   * Method under test: {@link FindingArrayElement#findIndexOfElementSecondOption(int[], int)}
   */
  @Test
  void testFindIndexOfElementSecondOption() {
    assertEquals(TEST_ELEMENT_INDEX, FindingArrayElement.findIndexOfElementSecondOption(TEST_ARRAY,
        TEST_ELEMENT));
    assertEquals(-1, FindingArrayElement.findIndexOfElementSecondOption(TEST_ARRAY_WITH_NO_ELEMENT,
        TEST_ELEMENT));
  }
}

