package field.date;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class UnixTimestampConversionTest {
  private static final long UNIX_TEST_TIMESTAMP = 0L;

  /**
   * Method under test: {@link UnixTimestampConversion#convertFirstOption(long)}
   */
  @Test
  void testConvertFirstOption() {
    log.info("Date (first option): {}",
      UnixTimestampConversion.convertFirstOption(UNIX_TEST_TIMESTAMP));
  }

  /**
   * Method under test: {@link UnixTimestampConversion#convertSecondOption(long)}
   */
  @Test
  void testConvertSecondOption() {
    log.info("Date (second option): {}",
      UnixTimestampConversion.convertSecondOption(UNIX_TEST_TIMESTAMP));
  }

  /**
   * Method under test: {@link UnixTimestampConversion#convertThirdOption(long)}
   */
  @Test
  void testConvertThirdOption() {
    log.info("Date (third option): {}",
      UnixTimestampConversion.convertThirdOption(UNIX_TEST_TIMESTAMP));
  }

  /**
   * Method under test: {@link UnixTimestampConversion#convertLocalDateTime(long)}
   */
  @Test
  void testConvertLocalDateTime() {
    log.info("LocalDateTime: {}",
      UnixTimestampConversion.convertLocalDateTime(UNIX_TEST_TIMESTAMP));
  }

  /**
   * Method under test: {@link UnixTimestampConversion#convertZonedDateTime(long)}
   */
  @Test
  void testConvertZonedDateTime() {
    log.info("ZonedDateTime: {}",
      UnixTimestampConversion.convertZonedDateTime(UNIX_TEST_TIMESTAMP));
  }
}
