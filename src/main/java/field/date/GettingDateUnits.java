package field.date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GettingDateUnits {
  public static int getYearFirstOption(LocalDateTime date) {
    return date.getYear();
  }

  public static int getYearSecondOption(LocalDateTime date) {
    return date.get(ChronoField.YEAR);
  }

  public static int getMonthFirstOption(LocalDateTime date) {
    return date.getMonthValue();
  }

  public static int getMonthSecondOption(LocalDateTime date) {
    return date.get(ChronoField.MONTH_OF_YEAR);
  }

  public static int getDayFirstOption(LocalDateTime date) {
    return date.getDayOfMonth();
  }

  public static int getDaySecondOption(LocalDateTime date) {
    return date.get(ChronoField.DAY_OF_MONTH);
  }

  public static int getHourFirstOption(LocalDateTime date) {
    return date.getHour();
  }

  public static int getHourSecondOption(LocalDateTime date) {
    return date.get(ChronoField.HOUR_OF_DAY);
  }

  public static int getMinuteFirstOption(LocalDateTime date) {
    return date.getMinute();
  }

  public static int getMinuteSecondOption(LocalDateTime date) {
    return date.get(ChronoField.MINUTE_OF_HOUR);
  }

  public static int getSecondFirstOption(LocalDateTime date) {
    return date.getSecond();
  }

  public static int getSecondSecondOption(LocalDateTime date) {
    return date.get(ChronoField.SECOND_OF_MINUTE);
  }

  public static int getNanoFirstOption(LocalDateTime date) {
    return date.getNano();
  }

  public static int getNanoSecondOption(LocalDateTime date) {
    return date.get(ChronoField.NANO_OF_SECOND);
  }
}
