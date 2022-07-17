package field.data;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CheckingEquivalenceOfArraysTest {
  private static final int[] FIRST_ARRAY = { 3, 4, 5, 6, 1, 2 };
  private static final int[] SECOND_ARRAY = { 3, 4, 5, 6, 1, 2 };
  private static final int[] THIRD_ARRAY = { 3, 4, 5, 6, 1, 7 };

  /**
   * Method under test: {@link CheckingEquivalenceOfArrays#areEqualsFirstOption(int[], int[])}
   */
  @Test
  void testAreEqualsFirstOption() {
    assertTrue(CheckingEquivalenceOfArrays.areEqualsFirstOption(FIRST_ARRAY, FIRST_ARRAY));
    assertTrue(CheckingEquivalenceOfArrays.areEqualsFirstOption(FIRST_ARRAY, SECOND_ARRAY));
    assertFalse(CheckingEquivalenceOfArrays.areEqualsFirstOption(FIRST_ARRAY, THIRD_ARRAY));
    assertFalse(CheckingEquivalenceOfArrays.areEqualsFirstOption(SECOND_ARRAY, THIRD_ARRAY));
  }

  /**
   * Method under test: {@link CheckingEquivalenceOfArrays#areEqualsSecondOption(int[], int[])}
   */
  @Test
  void testAreEqualsSecondOption() {
    assertTrue(CheckingEquivalenceOfArrays.areEqualsSecondOption(FIRST_ARRAY, FIRST_ARRAY));
    assertTrue(CheckingEquivalenceOfArrays.areEqualsSecondOption(FIRST_ARRAY, SECOND_ARRAY));
    assertFalse(CheckingEquivalenceOfArrays.areEqualsSecondOption(FIRST_ARRAY, THIRD_ARRAY));
    assertFalse(CheckingEquivalenceOfArrays.areEqualsSecondOption(SECOND_ARRAY, THIRD_ARRAY));
  }

  /**
   * Method under test: {@link CheckingEquivalenceOfArrays#areEqualsThirdOption(int[], int[])}
   */
  @Test
  void testAreEqualsThirdOption() {
    assertTrue(CheckingEquivalenceOfArrays.areEqualsThirdOption(FIRST_ARRAY, FIRST_ARRAY));
    assertTrue(CheckingEquivalenceOfArrays.areEqualsThirdOption(FIRST_ARRAY, SECOND_ARRAY));
    assertFalse(CheckingEquivalenceOfArrays.areEqualsThirdOption(FIRST_ARRAY, THIRD_ARRAY));
    assertFalse(CheckingEquivalenceOfArrays.areEqualsThirdOption(SECOND_ARRAY, THIRD_ARRAY));
  }
}

