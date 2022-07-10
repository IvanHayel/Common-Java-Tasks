package field.string;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortingStringArrayByLengthTest {
  private static final String[] EXPECTED_ASCENDING_SORTED_ARRAY =
      {"ab", "abc", "abcde", "abcdef", "abcdefg"};
  private static final String[] EXPECTED_DESCENDING_SORTED_ARRAY =
      {"abcdefg", "abcdef", "abcde", "abc", "ab"};

  private static String[] TEST_ARRAY;

  @BeforeEach
  void setUp() {
    TEST_ARRAY = new String[]{"abc", "ab", "abcdef", "abcde", "abcdefg"};
  }

  /**
   * Method under test: {@link SortingStringArrayByLength#sortArrayByLengthFirstOption(String[],
   * SortDirection)}
   */
  @Test
  void testSortArrayByLengthFirstOption() {
    SortingStringArrayByLength.sortArrayByLengthFirstOption(TEST_ARRAY, SortDirection.ASCENDING);
    assertArrayEquals(EXPECTED_ASCENDING_SORTED_ARRAY, TEST_ARRAY);
    SortingStringArrayByLength.sortArrayByLengthFirstOption(TEST_ARRAY, SortDirection.DESCENDING);
    assertArrayEquals(EXPECTED_DESCENDING_SORTED_ARRAY, TEST_ARRAY);
  }

  /**
   * Method under test: {@link SortingStringArrayByLength#sortArrayByLengthSecondOption(String[],
   * SortDirection)}
   */
  @Test
  void testSortArrayByLengthSecondOption() {
    SortingStringArrayByLength.sortArrayByLengthSecondOption(TEST_ARRAY, SortDirection.ASCENDING);
    assertArrayEquals(EXPECTED_ASCENDING_SORTED_ARRAY, TEST_ARRAY);
    SortingStringArrayByLength.sortArrayByLengthSecondOption(TEST_ARRAY, SortDirection.DESCENDING);
    assertArrayEquals(EXPECTED_DESCENDING_SORTED_ARRAY, TEST_ARRAY);
  }

  /**
   * Method under test: {@link SortingStringArrayByLength#sortArrayByLengthThirdOption(String[],
   * SortDirection)}
   */
  @Test
  void testSortArrayByLengthThirdOption() {
    String[] asc = SortingStringArrayByLength
        .sortArrayByLengthThirdOption(TEST_ARRAY, SortDirection.ASCENDING);
    assertArrayEquals(EXPECTED_ASCENDING_SORTED_ARRAY, asc);
    String[] desc = SortingStringArrayByLength
        .sortArrayByLengthThirdOption(TEST_ARRAY, SortDirection.DESCENDING);
    assertArrayEquals(EXPECTED_DESCENDING_SORTED_ARRAY, desc);
  }
}

