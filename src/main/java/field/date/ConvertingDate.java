package field.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class ConvertingDate {
  private static final ZoneId DEFAULT_TIME_ZONE = ZoneId.systemDefault();

  public static Instant convertDateToInstant(Date date) {
    return date.toInstant();
  }

  public static Date convertInstantToDate(Instant instant) {
    return Date.from(instant);
  }

  public static LocalDate convertDateToLocalDate(Date date) {
    return date.toInstant().atZone(DEFAULT_TIME_ZONE).toLocalDate();
  }

  public static Date convertLocalDateToDate(LocalDate localDate) {
    return Date.from(localDate.atStartOfDay(DEFAULT_TIME_ZONE).toInstant());
  }

  public static LocalDateTime convertDateToLocalDateTime(Date date) {
    return date.toInstant().atZone(DEFAULT_TIME_ZONE).toLocalDateTime();
  }

  public static Date convertLocalDateTimeToDate(LocalDateTime localDateTime) {
    return Date.from(localDateTime.atZone(DEFAULT_TIME_ZONE).toInstant());
  }

  public static ZonedDateTime convertDateToZonedDateTime(Date date) {
    return date.toInstant().atZone(DEFAULT_TIME_ZONE);
  }

  public static Date convertZonedDateTimeToDate(ZonedDateTime zonedDateTime) {
    return Date.from(zonedDateTime.toInstant());
  }

  public static OffsetDateTime convertDateToOffsetDateTime(Date date) {
    return date.toInstant().atZone(DEFAULT_TIME_ZONE).toOffsetDateTime();
  }

  public static Date convertOffsetDateTimeToDate(OffsetDateTime offsetDateTime) {
    return Date.from(offsetDateTime.toInstant());
  }

  public static LocalTime convertDateToLocalTime(Date date) {
    return LocalTime.ofInstant(date.toInstant(), DEFAULT_TIME_ZONE);
  }

  public static Date convertLocalTimeToDate(LocalTime localTime) {
    return Date.from(
        localTime.atDate(LocalDate.EPOCH)
            .toInstant(DEFAULT_TIME_ZONE.getRules().getOffset(Instant.now()))
    );
  }

  public static OffsetTime convertDateToOffsetTime(Date date) {
    return OffsetTime.ofInstant(date.toInstant(), DEFAULT_TIME_ZONE);
  }

  public static Date convertOffsetTimeToDate(OffsetTime offsetTime) {
    return Date.from(offsetTime.atDate(LocalDate.EPOCH).toInstant());
  }
}
