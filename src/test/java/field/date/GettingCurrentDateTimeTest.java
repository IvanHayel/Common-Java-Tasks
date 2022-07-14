package field.date;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class GettingCurrentDateTimeTest {
  /**
   * Method under test: {@link GettingCurrentDateTime#getCurrentLocalDateTime()}
   */
  @Test
  void testGetCurrentLocalDateTime() {
    log.info("Current LocalDateTime: {}", GettingCurrentDateTime.getCurrentLocalDateTime());
  }

  /**
   * Method under test: {@link GettingCurrentDateTime#getCurrentLocalDate()}
   */
  @Test
  void testGetCurrentLocalDate() {
    log.info("Current LocalDate: {}", GettingCurrentDateTime.getCurrentLocalDate());
  }

  /**
   * Method under test: {@link GettingCurrentDateTime#getCurrentLocalTime()}
   */
  @Test
  void testGetCurrentLocalTime() {
    log.info("Current LocalTime: {}", GettingCurrentDateTime.getCurrentLocalTime());
  }
}

