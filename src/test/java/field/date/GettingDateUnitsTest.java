package field.date;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class GettingDateUnitsTest {
  private static final int YEAR = 2022;
  private static final int MONTH = 3;
  private static final int DAY = 4;
  private static final int HOUR = 5;
  private static final int MINUTE = 6;
  private static final int SECOND = 7;
  private static final int NANO = 8;
  private static final LocalDateTime TEST_DATE =
      LocalDateTime.of(YEAR, MONTH, DAY, HOUR, MINUTE, SECOND, NANO);

  /**
   * Method under test: {@link GettingDateUnits#getYearFirstOption(LocalDateTime)}
   */
  @Test
  void testGetYearFirstOption() {
    assertEquals(YEAR, GettingDateUnits.getYearFirstOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getYearSecondOption(LocalDateTime)}
   */
  @Test
  void testGetYearSecondOption() {
    assertEquals(YEAR, GettingDateUnits.getYearSecondOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getMonthFirstOption(LocalDateTime)}
   */
  @Test
  void testGetMonthFirstOption() {
    assertEquals(MONTH, GettingDateUnits.getMonthFirstOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getMonthSecondOption(LocalDateTime)}
   */
  @Test
  void testGetMonthSecondOption() {
    assertEquals(MONTH, GettingDateUnits.getMonthSecondOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getDayFirstOption(LocalDateTime)}
   */
  @Test
  void testGetDayFirstOption() {
    assertEquals(DAY, GettingDateUnits.getDayFirstOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getDaySecondOption(LocalDateTime)}
   */
  @Test
  void testGetDaySecondOption() {
    assertEquals(DAY, GettingDateUnits.getDaySecondOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getHourFirstOption(LocalDateTime)}
   */
  @Test
  void testGetHourFirstOption() {
    assertEquals(HOUR, GettingDateUnits.getHourFirstOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getHourSecondOption(LocalDateTime)}
   */
  @Test
  void testGetHourSecondOption() {
    assertEquals(HOUR, GettingDateUnits.getHourSecondOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getMinuteFirstOption(LocalDateTime)}
   */
  @Test
  void testGetMinuteFirstOption() {
    assertEquals(MINUTE, GettingDateUnits.getMinuteFirstOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getMinuteSecondOption(LocalDateTime)}
   */
  @Test
  void testGetMinuteSecondOption() {
    assertEquals(MINUTE, GettingDateUnits.getMinuteSecondOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getSecondFirstOption(LocalDateTime)}
   */
  @Test
  void testGetSecondFirstOption() {
    assertEquals(SECOND, GettingDateUnits.getSecondFirstOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getSecondSecondOption(LocalDateTime)}
   */
  @Test
  void testGetSecondSecondOption() {
    assertEquals(SECOND, GettingDateUnits.getSecondSecondOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getNanoFirstOption(LocalDateTime)}
   */
  @Test
  void testGetNanoFirstOption() {
    assertEquals(NANO, GettingDateUnits.getNanoFirstOption(TEST_DATE));
  }

  /**
   * Method under test: {@link GettingDateUnits#getNanoSecondOption(LocalDateTime)}
   */
  @Test
  void testGetNanoSecondOption() {
    assertEquals(NANO, GettingDateUnits.getNanoSecondOption(TEST_DATE));
  }
}
