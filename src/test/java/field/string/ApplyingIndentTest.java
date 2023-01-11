package field.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ApplyingIndentTest {
  private static final String DAYS =
    "Monday\nTuesday\nWednesday\nThursday\nFriday\nSaturday\nSunday";
  private static final String EXPECTED_DAYS =
    "  Monday\n  Tuesday\n  Wednesday\n  Thursday\n  Friday\n  Saturday\n  Sunday\n";

  /**
   * Method under test: {@link ApplyingIndent#indent(String, int)}
   */
  @Test
  void testIndent() {
    assertEquals(" Text\n", ApplyingIndent.indent("Text", 1));
    assertEquals(EXPECTED_DAYS, ApplyingIndent.indent(DAYS, 2));
  }
}
