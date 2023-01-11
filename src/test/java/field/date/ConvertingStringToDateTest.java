package field.date;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import org.junit.jupiter.api.Test;

class ConvertingStringToDateTest {
  private static final String ISO_TEST_DATE = "2022-01-01T00:00:00.000";
  private static final String ISO_ZONED_TEST_DATE = "2022-01-01T00:00:00.000+00:00[UTC]";
  private static final String ISO_OFFSET_TEST_DATE = "2022-01-01T00:00:00.000+00:00";
  private static final String CUSTOM_TEST_DATE = "!2022-01-01!00:00:00.000!";
  private static final String CUSTOM_TEST_PATTERN = "!yyyy-MM-dd!HH:mm:ss.SSS!";
  private static final Instant EXCEPTED_INSTANT = Instant.parse("2022-01-01T00:00:00.000Z");

  /**
   * Method under test: {@link ConvertingStringToDate#convertStringToLocalDateTime(String)}
   */
  @Test
  void testConvertStringToLocalDateTime() {
    LocalDateTime actual = ConvertingStringToDate.convertStringToLocalDateTime(ISO_TEST_DATE);
    assertEquals(EXCEPTED_INSTANT, actual.toInstant(ZoneOffset.UTC));
  }

  /**
   * Method under test:
   * {@link ConvertingStringToDate#convertStringToDateWithFormat(String, String)}
   */
  @Test
  void testConvertStringToDateWithFormat() {
    LocalDateTime actual =
      ConvertingStringToDate.convertStringToDateWithFormat(CUSTOM_TEST_DATE, CUSTOM_TEST_PATTERN);
    assertEquals(EXCEPTED_INSTANT, actual.toInstant(ZoneOffset.UTC));
  }

  /**
   * Method under test: {@link ConvertingStringToDate#convertStringToZonedDateTime(String)}
   */
  @Test
  void testConvertStringToZonedDateTime() {
    ZonedDateTime actual = ConvertingStringToDate.convertStringToZonedDateTime(ISO_ZONED_TEST_DATE);
    assertEquals(EXCEPTED_INSTANT, actual.toInstant());
  }

  /**
   * Method under test: {@link ConvertingStringToDate#convertStringToOffsetDateTime(String)}
   */
  @Test
  void testConvertStringToOffsetDateTime() {
    OffsetDateTime actual = ConvertingStringToDate.convertStringToOffsetDateTime(
      ISO_OFFSET_TEST_DATE);
    assertEquals(EXCEPTED_INSTANT, actual.toInstant());
  }
}
