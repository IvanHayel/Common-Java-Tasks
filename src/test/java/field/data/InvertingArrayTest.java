package field.data;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class InvertingArrayTest {
  private static final int[] TEST_ARRAY = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
  private static final int[] EXPECTED_ARRAY = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

  /**
   * Method under test: {@link InvertingArray#reverseFirstOption(int[])}
   */
  @Test
  void testReverseFirstOption() {
    int[] array = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
    InvertingArray.reverseFirstOption(array);
    assertArrayEquals(EXPECTED_ARRAY, array);
  }

  /**
   * Method under test: {@link InvertingArray#reverseSecondOption(int[])}
   */
  @Test
  void testReverseSecondOption() {
    int[] array = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
    InvertingArray.reverseSecondOption(array);
    assertArrayEquals(EXPECTED_ARRAY, array);
  }

  /**
   * Method under test: {@link InvertingArray#reverseThirdOption(int[])}
   */
  @Test
  void testReverseThirdOption() {
    int[] array = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
    InvertingArray.reverseThirdOption(array);
    assertArrayEquals(EXPECTED_ARRAY, array);
  }

  /**
   * Method under test: {@link InvertingArray#reverseApache(int[])}
   */
  @Test
  void testReverseApache() {
    int[] array = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
    InvertingArray.reverseApache(array);
    assertArrayEquals(EXPECTED_ARRAY, array);
  }

  /**
   * Method under test: {@link InvertingArray#reverseGuava(int[])}
   */
  @Test
  void testReverseGuava() {
    int[] array = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
    InvertingArray.reverseGuava(array);
    assertArrayEquals(EXPECTED_ARRAY, array);
  }
}

