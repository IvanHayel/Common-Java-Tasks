package field.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Function;
import org.junit.jupiter.api.Test;

class StringTransformationTest {
  private static final Function<String, String> TO_UPPER_CASE = String::toUpperCase;
  private static final String TEST_STRING = "Hello world";
  private static final String EXPECTED_STRING = "HELLO WORLD";

  /**
   * Method under test: {@link StringTransformation#transformFirstOption(String, Function)}
   */
  @Test
  void testTransformFirstOption() {
    assertEquals(
      EXPECTED_STRING,
      StringTransformation.transformFirstOption(TEST_STRING, TO_UPPER_CASE)
    );
  }

  /**
   * Method under test: {@link StringTransformation#transformSecondOption(String, Function)}
   */
  @Test
  void testTransformSecondOption() {
    assertEquals(
      EXPECTED_STRING,
      StringTransformation.transformSecondOption(TEST_STRING, TO_UPPER_CASE)
    );
  }
}

