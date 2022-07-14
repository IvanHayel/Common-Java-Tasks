package field.date;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertingStringToDate {
  public static LocalDateTime convertStringToLocalDateTime(String date) {
    return LocalDateTime.parse(date);
  }

  public static LocalDateTime convertStringToDateWithFormat(String date, String format) {
    return LocalDateTime.parse(date, DateTimeFormatter.ofPattern(format));
  }

  public static ZonedDateTime convertStringToZonedDateTime(String date) {
    return ZonedDateTime.parse(date);
  }

  public static OffsetDateTime convertStringToOffsetDateTime(String date) {
    return OffsetDateTime.parse(date);
  }
}
