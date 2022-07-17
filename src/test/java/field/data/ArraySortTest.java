package field.data;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArraySortTest {
  private static final int TEST_START = 0;
  private static final int TEST_END = 50_000;
  private static final int[] INTEGER_EXPECTED_SORTED_ARRAY =
      IntStream.range(TEST_START, TEST_END).toArray();

  private static int[] INTEGER_TEST_ARRAY;

  @BeforeEach
  void setUp() {
    var list = new ArrayList<Integer>();
    IntStream.range(TEST_START, TEST_END).forEach(list::add);
    Collections.shuffle(list);
    INTEGER_TEST_ARRAY = list.stream().mapToInt(Integer::intValue).toArray();
  }

  /**
   * Method under test: {@link ArraySort#sortArrayDefault(int[])}
   */
  @Test
  void testSortArrayDefault() {
    ArraySort.sortArrayDefault(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayParallel(int[])}
   */
  @Test
  void testSortArrayParallel() {
    ArraySort.sortArrayParallel(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayBubbleFirstOption(int[])}
   */
  @Test
  void testSortArrayBubbleFirstOption() {
    ArraySort.sortArrayBubbleFirstOption(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayBubbleSecondOption(int[])}
   */
  @Test
  void testSortArrayBubbleSecondOption() {
    ArraySort.sortArrayBubbleSecondOption(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayInsertionFirstOption(int[])}
   */
  @Test
  void testSortArrayInsertionFirstOption() {
    ArraySort.sortArrayInsertionFirstOption(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayCountingFirstOption(int[])}
   */
  @Test
  void testSortArrayCountingFirstOption() {
    ArraySort.sortArrayCountingFirstOption(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayHeap(int[])}
   */
  @Test
  void testSortArrayHeap() {
    ArraySort.sortArrayHeap(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayPancake(int[])}
   */
  @Test
  void testSortArrayPancake() {
    ArraySort.sortArrayPancake(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayExchange(int[])}
   */
  @Test
  void testSortArrayExchange() {
    ArraySort.sortArrayExchange(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArraySelection(int[])}
   */
  @Test
  void testSortArraySelection() {
    ArraySort.sortArraySelection(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayShell(int[])}
   */
  @Test
  void testSortArrayShell() {
    ArraySort.sortArrayShell(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayMerge(int[])}
   */
  @Test
  void testSortArrayMerge() {
    ArraySort.sortArrayMerge(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayBucketSsg(int[])}
   */
  @Test
  void testSortArrayBucketSsg() {
    ArraySort.sortArrayBucketSsg(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayBucketSg(int[])}
   */
  @Test
  void testSortArrayBucketSg() {
    ArraySort.sortArrayBucketSg(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayCocktail(int[])}
   */
  @Test
  void testSortArrayCocktail() {
    ArraySort.sortArrayCocktail(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayCycle(int[])}
   */
  @Test
  void testSortArrayCycle() {
    ArraySort.sortArrayCycle(INTEGER_TEST_ARRAY);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayQuick(int[], int, int)}
   */
  @Test
  void testSortArrayQuick() {
    ArraySort.sortArrayQuick(INTEGER_TEST_ARRAY, 0, INTEGER_TEST_ARRAY.length - 1);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }

  /**
   * Method under test: {@link ArraySort#sortArrayRadix(int[], int)}
   */
  @Test
  void testSortArrayRadix() {
    ArraySort.sortArrayRadix(INTEGER_TEST_ARRAY, 10);
    assertArrayEquals(INTEGER_EXPECTED_SORTED_ARRAY, INTEGER_TEST_ARRAY);
  }
}
