package field.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class DateInterval {
  public static List<LocalDate> getDateIntervalFirstOption(LocalDate start, LocalDate end) {
    List<LocalDate> dates = new ArrayList<>();
    for(LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
      dates.add(date);
    }
    return dates;
  }

  public static List<LocalDate> getDateIntervalSecondOption(LocalDate start, LocalDate end) {
    return start.datesUntil(end, Period.ofDays(1)).toList();
  }
}
