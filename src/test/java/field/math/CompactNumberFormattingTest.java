package field.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CompactNumberFormattingTest {
  private static final int TEST_VALUE = 123456789;
  private static final String EXPECTED_SHORT_VALUE = "123M";
  private static final String EXPECTED_LONG_VALUE = "123 million";


  /**
   * Method under test: {@link CompactNumberFormatting#formatCompactShort(int)}
   */
  @Test
  void testFormatCompactShort() {
    assertEquals(EXPECTED_SHORT_VALUE, CompactNumberFormatting.formatCompactShort(TEST_VALUE));
  }

  /**
   * Method under test: {@link CompactNumberFormatting#formatCompactLong(int)}
   */
  @Test
  void testFormatCompactLong() {
    assertEquals(EXPECTED_LONG_VALUE, CompactNumberFormatting.formatCompactLong(TEST_VALUE));
  }
}

