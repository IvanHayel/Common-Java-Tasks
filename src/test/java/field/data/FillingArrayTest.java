package field.data;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import org.junit.jupiter.api.Test;

class FillingArrayTest {
  private static final int[] TEST_ARRAY = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  private static final int[] EXPECTED_ARRAY = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

  /**
   * Method under test: {@link FillingArray#fillArrayFirstOption(int[], int)}
   */
  @Test
  void testFillArrayFirstOption() {
    int[] array = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
    FillingArray.fillArrayFirstOption(array, 1);
    assertArrayEquals(EXPECTED_ARRAY, array);
  }

  /**
   * Method under test: {@link FillingArray#fillArraySecondOption(int[], int)}
   */
  @Test
  void testFillArraySecondOption() {
    int[] array = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
    FillingArray.fillArraySecondOption(array, 1);
    assertArrayEquals(EXPECTED_ARRAY, array);
  }

  /**
   * Method under test: {@link FillingArray#setArrayFirstOption(int[], IntUnaryOperator)}
   */
  @Test
  void testSetArrayFirstOption() {
    int[] array = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
    FillingArray.setArrayFirstOption(array, i -> 1);
    assertArrayEquals(EXPECTED_ARRAY, array);
  }

  /**
   * Method under test: {@link FillingArray#setArraySecondOption(int[], IntUnaryOperator)}
   */
  @Test
  void testSetArraySecondOption() {
    int[] array = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
    FillingArray.setArraySecondOption(array, i -> 1);
    assertArrayEquals(EXPECTED_ARRAY, array);
  }

  /**
   * Method under test: {@link FillingArray#setArrayParallel(int[], IntUnaryOperator)}
   */
  @Test
  void testSetArrayParallel() {
    int[] array = Arrays.copyOf(TEST_ARRAY, TEST_ARRAY.length);
    FillingArray.setArrayParallel(array, i -> 1);
    assertArrayEquals(EXPECTED_ARRAY, array);
  }
}

