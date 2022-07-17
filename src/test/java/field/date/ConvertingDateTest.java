package field.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import org.junit.jupiter.api.Test;

class ConvertingDateTest {
  /**
   * Method under test: {@link ConvertingDate#convertDateToInstant(Date)}
   */
  @Test
  void testConvertDateToInstant() {
    LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
    Instant actualConvertDateToInstantResult = ConvertingDate
        .convertDateToInstant(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
    assertSame(actualConvertDateToInstantResult.EPOCH, actualConvertDateToInstantResult);
  }

  /**
   * Method under test: {@link ConvertingDate#convertInstantToDate(Instant)}
   */
  @Test
  void testConvertInstantToDate() {
    Instant atStartOfDayResult = Instant.ofEpochSecond(0L);
    Date actualConvertInstantToDateResult = ConvertingDate
        .convertInstantToDate(atStartOfDayResult);
    assertEquals(atStartOfDayResult.toEpochMilli(), actualConvertInstantToDateResult.getTime());
  }

  /**
   * Method under test: {@link ConvertingDate#convertDateToLocalDate(Date)}
   */
  @Test
  void testConvertDateToLocalDate() {
    LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
    assertEquals("1970-01-01",
        ConvertingDate.convertDateToLocalDate(
                Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()))
            .toString());
  }

  /**
   * Method under test: {@link ConvertingDate#convertLocalDateToDate(LocalDate)}
   */
  @Test
  void testConvertLocalDateToDate() {
    LocalDate atStartOfDayResult = LocalDate.of(1970, 1, 1);
    assertEquals(-10800000L,
        ConvertingDate.convertLocalDateToDate(atStartOfDayResult).getTime());
  }

  /**
   * Method under test: {@link ConvertingDate#convertDateToLocalDateTime(Date)}
   */
  @Test
  void testConvertDateToLocalDateTime() {
    LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
    LocalDateTime actualConvertDateToLocalDateTimeResult = ConvertingDate
        .convertDateToLocalDateTime(
            Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
    assertEquals("1970-01-01", actualConvertDateToLocalDateTimeResult.toLocalDate().toString());
    assertEquals("03:00", actualConvertDateToLocalDateTimeResult.toLocalTime().toString());
  }

  /**
   * Method under test: {@link ConvertingDate#convertLocalDateTimeToDate(LocalDateTime)}
   */
  @Test
  void testConvertLocalDateTimeToDate() {
    LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
    Date actualConvertLocalDateTimeToDateResult = ConvertingDate
        .convertLocalDateTimeToDate(atStartOfDayResult);
    assertEquals(-10800000L, actualConvertLocalDateTimeToDateResult.getTime());
  }

  /**
   * Method under test: {@link ConvertingDate#convertDateToZonedDateTime(Date)}
   */
  @Test
  void testConvertDateToZonedDateTime() {
    LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
    ZonedDateTime actualConvertDateToZonedDateTimeResult = ConvertingDate
        .convertDateToZonedDateTime(
            Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
    assertEquals("1970-01-01", actualConvertDateToZonedDateTimeResult.toLocalDate().toString());
    assertEquals("03:00", actualConvertDateToZonedDateTimeResult.toLocalTime().toString());
  }

  /**
   * Method under test: {@link ConvertingDate#convertZonedDateTimeToDate(ZonedDateTime)}
   */
  @Test
  void testConvertZonedDateTimeToDate() {
    ZonedDateTime atStartOfDayResult = ZonedDateTime.of(LocalDate.of(1970, 1, 1),
        LocalTime.of(3, 0), ZoneId.of("UTC"));
    Date actualConvertZonedDateTimeToDateResult = ConvertingDate
        .convertZonedDateTimeToDate(atStartOfDayResult);
    assertEquals(10800000L, actualConvertZonedDateTimeToDateResult.getTime());
  }

  /**
   * Method under test: {@link ConvertingDate#convertDateToOffsetDateTime(Date)}
   */
  @Test
  void testConvertDateToOffsetDateTime() {
    LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
    OffsetDateTime actualConvertDateToOffsetDateTimeResult = ConvertingDate
        .convertDateToOffsetDateTime(
            Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
    assertEquals("1970-01-01", actualConvertDateToOffsetDateTimeResult.toLocalDate().toString());
    assertEquals("03:00", actualConvertDateToOffsetDateTimeResult.toLocalTime().toString());
  }

  /**
   * Method under test: {@link ConvertingDate#convertOffsetDateTimeToDate(OffsetDateTime)}
   */
  @Test
  void testConvertOffsetDateTimeToDate() {
    OffsetDateTime atStartOfDayResult = OffsetDateTime.of(LocalDate.of(1970, 1, 1),
        LocalTime.of(3, 0), ZoneOffset.UTC);
    Date actualConvertOffsetDateTimeToDateResult = ConvertingDate
        .convertOffsetDateTimeToDate(atStartOfDayResult);
    assertEquals(10800000L, actualConvertOffsetDateTimeToDateResult.getTime());
  }

  /**
   * Method under test: {@link ConvertingDate#convertDateToLocalTime(Date)}
   */
  @Test
  void testConvertDateToLocalTime() {
    LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
    assertEquals("03:00",
        ConvertingDate.convertDateToLocalTime(
                Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()))
            .toString());
  }

  /**
   * Method under test: {@link ConvertingDate#convertLocalTimeToDate(LocalTime)}
   */
  @Test
  void testConvertLocalTimeToDate() {
    LocalTime atStartOfDayResult = LocalTime.of(3, 0);
    assertEquals(0L,
        ConvertingDate.convertLocalTimeToDate(atStartOfDayResult).getTime());
  }

  /**
   * Method under test: {@link ConvertingDate#convertDateToOffsetTime(Date)}
   */
  @Test
  void testConvertDateToOffsetTime() {
    Date atStartOfDayResult = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay()
        .atZone(ZoneId.of("UTC")).toInstant());
    assertEquals("03:00+03:00",
        ConvertingDate.convertDateToOffsetTime(atStartOfDayResult).toString());
  }

  /**
   * Method under test: {@link ConvertingDate#convertOffsetTimeToDate(OffsetTime)}
   */
  @Test
  void testConvertOffsetTimeToDate() {
    OffsetTime atStartOfDayResult = OffsetTime.of(LocalTime.of(3, 0), ZoneOffset.UTC);
    assertEquals(10800000L,
        ConvertingDate.convertOffsetTimeToDate(atStartOfDayResult).getTime());
  }
}
