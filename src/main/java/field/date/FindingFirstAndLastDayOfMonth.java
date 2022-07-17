package field.date;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class FindingFirstAndLastDayOfMonth {
  public static LocalDate findFirstDayOfMonthFirstOption(LocalDate date) {
    return date.withDayOfMonth(1);
  }

  public static LocalDate findFirstDayOfMonthSecondOption(LocalDate date) {
    return date.with(TemporalAdjusters.firstDayOfMonth());
  }

  public static LocalDate findLastDayOfMonthSecondOption(LocalDate date) {
    return date.withDayOfMonth(date.lengthOfMonth());
  }

  public static LocalDate findLastDayOfMonthThirdOption(LocalDate date) {
    return date.with(TemporalAdjusters.lastDayOfMonth());
  }
}
