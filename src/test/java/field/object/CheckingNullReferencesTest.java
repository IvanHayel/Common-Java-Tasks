package field.object;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class CheckingNullReferencesTest {
  private static final Object NOT_NULL = new Object();
  private static final List<Object> LIST = new ArrayList<>();
  private static final List<Object> LIST_WITH_NULL = new ArrayList<>();

  static {
    LIST_WITH_NULL.add(null);
  }

  /**
   * Method under test: {@link CheckingNullReferences#isNullFirstOption(Object)}
   */
  @Test
  void testIsNullFirstOption() {
    assertFalse(CheckingNullReferences.isNullFirstOption(NOT_NULL));
    assertTrue(CheckingNullReferences.isNullFirstOption(null));
  }

  /**
   * Method under test: {@link CheckingNullReferences#isNullSecondOption(Object)}
   */
  @Test
  void testIsNullSecondOption() {
    assertTrue(CheckingNullReferences.isNullSecondOption(null));
    assertFalse(CheckingNullReferences.isNullSecondOption(NOT_NULL));
  }

  /**
   * Method under test: {@link CheckingNullReferences#isNullList(List)}
   */
  @Test
  void testIsNullList() {
    assertTrue(CheckingNullReferences.isNullList(LIST_WITH_NULL));
    assertFalse(CheckingNullReferences.isNullList(LIST));
  }

  /**
   * Method under test: {@link CheckingNullReferences#isNullWithCustomNullPointerException(Object)}
   */
  @Test
  void testIsNullWithCustomNullPointerException() {
    assertTrue(CheckingNullReferences.isNullWithCustomNullPointerException(null));
    assertFalse(CheckingNullReferences.isNullWithCustomNullPointerException(NOT_NULL));
  }
}

