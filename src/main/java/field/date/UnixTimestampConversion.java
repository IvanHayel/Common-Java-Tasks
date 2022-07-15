package field.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UnixTimestampConversion {
  public static Date convertFirstOption(long unixTimestamp) {
    return new Date(unixTimestamp * 1000L);
  }

  public static Date convertSecondOption(long unixTimestamp) {
    return new Date(TimeUnit.MILLISECONDS.convert(unixTimestamp, TimeUnit.SECONDS));
  }

  public static Date convertThirdOption(long unixTimestamp) {
    return Date.from(Instant.ofEpochMilli(unixTimestamp));
  }

  public static LocalDateTime convertLocalDateTime(long unixTimestamp) {
    return LocalDateTime.ofInstant(Instant.ofEpochMilli(unixTimestamp), ZoneId.systemDefault());
  }

  public static ZonedDateTime convertZonedDateTime(long unixTimestamp) {
    return ZonedDateTime.ofInstant(Instant.ofEpochMilli(unixTimestamp), ZoneId.systemDefault());
  }
}
