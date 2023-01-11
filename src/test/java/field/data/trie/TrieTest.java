package field.data.trie;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrieTest {
  private static final String TEST_INSERT = "test";
  private static final String TEST_NOT_INSERT = "not";
  private static Trie TEST_TRIE;

  @BeforeEach
  void setUp() {
    TEST_TRIE = new Trie();
    System.out.println("TEST_TRIE: " + TEST_TRIE);
  }

  /**
   * Method under test: {@link Trie#insert(String)}
   */
  @Test
  void testInsert() {
    TEST_TRIE.insert(TEST_INSERT);
    assertTrue(TEST_TRIE.contains(TEST_INSERT));
    assertFalse(TEST_TRIE.contains(TEST_NOT_INSERT));
  }

  /**
   * Method under test: {@link Trie#contains(String)}
   */
  @Test
  void testContains() {
    TEST_TRIE.insert(TEST_INSERT);
    assertTrue(TEST_TRIE.contains(TEST_INSERT));
    assertFalse(TEST_TRIE.contains(TEST_NOT_INSERT));
  }

  /**
   * Method under test: {@link Trie#delete(String)}
   */
  @Test
  void testDelete() {
    TEST_TRIE.insert(TEST_INSERT);
    assertTrue(TEST_TRIE.delete(TEST_INSERT));
    assertFalse(TEST_TRIE.delete(TEST_NOT_INSERT));
    assertFalse(TEST_TRIE.delete(TEST_INSERT));
  }
}
