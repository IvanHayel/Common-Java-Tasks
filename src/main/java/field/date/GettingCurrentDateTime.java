package field.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class GettingCurrentDateTime {
  public static LocalDateTime getCurrentLocalDateTime() {
    return LocalDateTime.now();
  }

  public static LocalDate getCurrentLocalDate() {
    return LocalDate.now();
  }

  public static LocalTime getCurrentLocalTime() {
    return LocalTime.now();
  }
}
