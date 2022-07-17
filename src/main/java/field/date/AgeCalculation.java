package field.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class AgeCalculation {
  public static long calculateAge(LocalDate birthDate) {
    return ChronoUnit.YEARS.between(birthDate, LocalDate.now());
  }

  public static Period calculateAgeExact(LocalDate birthDate) {
    return Period.between(birthDate, LocalDate.now());
  }
}
