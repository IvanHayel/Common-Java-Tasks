package field.date;

import java.time.LocalDate;
import java.time.Period;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class AgeCalculationTest {
  private static final LocalDate BIRTH_DATE = LocalDate.of(1980, 1, 1);

  /**
   * Method under test: {@link AgeCalculation#calculateAge(LocalDate)}
   */
  @Test
  void testCalculateAge() {
    long age = AgeCalculation.calculateAge(BIRTH_DATE);
    log.info("Age: {}", age);
  }

  /**
   * Method under test: {@link AgeCalculation#calculateAgeExact(LocalDate)}
   */
  @Test
  void testCalculateAgeExact() {
    Period age = AgeCalculation.calculateAgeExact(BIRTH_DATE);
    String output = String.format("Exact age: %d years, %d months, %d days",
      age.getYears(), age.getMonths(), age.getDays());
    log.info(output);
  }
}
