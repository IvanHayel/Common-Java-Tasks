package field.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class BreadthFirstSearchTest {
  private static final BreadthFirstSearch TEST_GRAPH = new BreadthFirstSearch(4);
  private static final List<Integer> TEST_RESULT = List.of(0, 1, 2, 3);

  static {
    TEST_GRAPH.addEdge(0, 1);
    TEST_GRAPH.addEdge(0, 2);
    TEST_GRAPH.addEdge(1, 0);
    TEST_GRAPH.addEdge(2, 3);
    TEST_GRAPH.addEdge(3, 0);
    TEST_GRAPH.addEdge(3, 2);
    TEST_GRAPH.addEdge(3, 3);
  }

  /**
   * Method under test: {@link BreadthFirstSearch#BreadthFirstSearch(int)}
   */
  @Test
  void testConstructor() {
    assertThrows(IllegalArgumentException.class, () -> new BreadthFirstSearch(-1));
  }

  /**
   * Method under test: {@link BreadthFirstSearch#search(int)}
   */
  @Test
  void testSearch() {
    assertEquals(TEST_RESULT, TEST_GRAPH.search(0));
  }
}

