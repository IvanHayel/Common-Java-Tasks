package field.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class DateIntervalTest {
  /**
   * Method under test: {@link DateInterval#getDateIntervalFirstOption(LocalDate, LocalDate)}
   */
  @Test
  void testGetDateIntervalFirstOption() {
    assertTrue(
        DateInterval.getDateIntervalFirstOption(LocalDate.ofEpochDay(1L), LocalDate.ofEpochDay(1L))
            .isEmpty());
    assertEquals(1,
        DateInterval.getDateIntervalFirstOption(LocalDate.ofEpochDay(0L), LocalDate.ofEpochDay(1L))
            .size());
    List<LocalDate> interval = DateInterval.getDateIntervalFirstOption(
        LocalDate.now().minusDays(10), LocalDate.now());
    assertEquals(10, interval.size());
    interval.forEach(date -> log.info("Date (first option): {}", date));
  }

  /**
   * Method under test: {@link DateInterval#getDateIntervalSecondOption(LocalDate, LocalDate)}
   */
  @Test
  void testGetDateIntervalSecondOption() {
    assertTrue(
        DateInterval.getDateIntervalSecondOption(LocalDate.ofEpochDay(1L), LocalDate.ofEpochDay(1L))
            .isEmpty());
    assertEquals(1,
        DateInterval.getDateIntervalSecondOption(LocalDate.ofEpochDay(0L), LocalDate.ofEpochDay(1L))
            .size());
    List<LocalDate> interval = DateInterval.getDateIntervalSecondOption(
        LocalDate.now().minusDays(10), LocalDate.now());
    assertEquals(10, interval.size());
    interval.forEach(date -> log.info("Date (second option): {}", date));
  }
}

