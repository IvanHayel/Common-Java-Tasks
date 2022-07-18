package field.data;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ResizingArrayTest {
  private static final int[] TEST_ARRAY = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  private static final int TEST_SIZE = 3;
  private static final int[] EXPECTED_RESULT = {1, 2, 3};

  /**
   * Method under test: {@link ResizingArray#resizeFirstOption(int[], int)}
   */
  @Test
  void testResizeFirstOption() {
    int[] result = ResizingArray.resizeFirstOption(TEST_ARRAY, TEST_SIZE);
    assertArrayEquals(EXPECTED_RESULT, result);
  }

  /**
   * Method under test: {@link ResizingArray#resizeSecondOption(int[], int)}
   */
  @Test
  void testResizeSecondOption() {
    int[] result = ResizingArray.resizeSecondOption(TEST_ARRAY, TEST_SIZE);
    assertArrayEquals(EXPECTED_RESULT, result);
  }

  /**
   * Method under test: {@link ResizingArray#resizeThirdOption(int[], int)}
   */
  @Test
  void testResizeThirdOption() {
    int[] result = ResizingArray.resizeThirdOption(TEST_ARRAY, TEST_SIZE);
    assertArrayEquals(EXPECTED_RESULT, result);
  }
}

