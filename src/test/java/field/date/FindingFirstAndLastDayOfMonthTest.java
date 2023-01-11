package field.date;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class FindingFirstAndLastDayOfMonthTest {
  /**
   * Method under test:
   * {@link FindingFirstAndLastDayOfMonth#findFirstDayOfMonthFirstOption(LocalDate)}
   */
  @Test
  void testFindFirstDayOfMonthFirstOption() {
    assertEquals("1970-01-01",
      FindingFirstAndLastDayOfMonth.findFirstDayOfMonthFirstOption(LocalDate.ofEpochDay(1L))
        .toString());
  }

  /**
   * Method under test:
   * {@link FindingFirstAndLastDayOfMonth#findFirstDayOfMonthSecondOption(LocalDate)}
   */
  @Test
  void testFindFirstDayOfMonthSecondOption() {
    assertEquals("1970-01-01",
      FindingFirstAndLastDayOfMonth.findFirstDayOfMonthSecondOption(LocalDate.ofEpochDay(1L))
        .toString());
  }

  /**
   * Method under test:
   * {@link FindingFirstAndLastDayOfMonth#findLastDayOfMonthSecondOption(LocalDate)}
   */
  @Test
  void testFindLastDayOfMonthSecondOption() {
    assertEquals("1970-01-31",
      FindingFirstAndLastDayOfMonth.findLastDayOfMonthSecondOption(LocalDate.ofEpochDay(1L))
        .toString());
  }

  /**
   * Method under test:
   * {@link FindingFirstAndLastDayOfMonth#findLastDayOfMonthThirdOption(LocalDate)}
   */
  @Test
  void testFindLastDayOfMonthThirdOption() {
    assertEquals("1970-01-31",
      FindingFirstAndLastDayOfMonth.findLastDayOfMonthThirdOption(LocalDate.ofEpochDay(1L))
        .toString());
  }
}

