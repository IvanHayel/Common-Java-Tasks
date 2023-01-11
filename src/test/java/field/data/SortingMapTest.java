package field.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;

class SortingMapTest {
  private static final Map<Integer, Integer> TEST_MAP = new HashMap<>();
  private static final Map<Integer, Integer> EXPECTED_MAP = Map.of(
    111, 111,
    222, 222,
    333, 333,
    444, 444,
    555, 555,
    666, 666,
    777, 777
  );
  private static final List<Integer> EXPECTED_LIST = List.of(
    111,
    222,
    333,
    444,
    555,
    666,
    777
  );

  static {
    TEST_MAP.put(555, 555);
    TEST_MAP.put(222, 222);
    TEST_MAP.put(333, 333);
    TEST_MAP.put(111, 111);
    TEST_MAP.put(444, 444);
    TEST_MAP.put(777, 777);
    TEST_MAP.put(666, 666);
  }

  /**
   * Method under test: {@link SortingMap#sortByTreeMap(Map)}
   */
  @Test
  void testSortByTreeMap() {
    TreeMap<Integer, Integer> sortedMap = SortingMap.sortByTreeMap(TEST_MAP);
    assertEquals(EXPECTED_MAP, sortedMap);
  }

  /**
   * Method under test: {@link SortingMap#sortByKeyStream(Map, Comparator)}
   */
  @Test
  void testSortByKeyStream() {
    Map<Integer, Integer> sortedMap = SortingMap.sortByKeyStream(TEST_MAP,
      Comparator.naturalOrder());
    assertEquals(EXPECTED_MAP, sortedMap);
  }

  /**
   * Method under test: {@link SortingMap#sortByValueStream(Map, Comparator)}
   */
  @Test
  void testSortByValueStream() {
    Map<Integer, Integer> sortedMap = SortingMap.sortByValueStream(TEST_MAP,
      Comparator.naturalOrder());
    assertEquals(EXPECTED_MAP, sortedMap);
  }

  /**
   * Method under test: {@link SortingMap#sortByKeyList(Map)}
   */
  @Test
  void testSortByKeyList() {
    List<Integer> list = SortingMap.sortByKeyList(TEST_MAP);
    assertEquals(EXPECTED_LIST, list);
  }

  /**
   * Method under test: {@link SortingMap#sortByValueList(Map)}
   */
  @Test
  void testSortByValueList() {
    List<Integer> list = SortingMap.sortByValueList(TEST_MAP);
    assertEquals(EXPECTED_LIST, list);
  }
}
