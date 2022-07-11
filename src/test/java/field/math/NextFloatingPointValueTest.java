package field.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NextFloatingPointValueTest {
  /**
   * Method under test: {@link NextFloatingPointValue#nextUp(double)}
   */
  @Test
  void testNextUp() {
    assertEquals(10.000000000000001d, NextFloatingPointValue.nextUp(10.0d));
    assertEquals(10.000001f, NextFloatingPointValue.nextUp(10.0f));
  }

  /**
   * Method under test: {@link NextFloatingPointValue#nextDown(double)}
   */
  @Test
  void testNextDown() {
    assertEquals(9.999999999999999d, NextFloatingPointValue.nextDown(10.0d));
    assertEquals(9.999999f, NextFloatingPointValue.nextDown(10.0f));
  }
}

