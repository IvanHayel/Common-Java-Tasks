package field.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SumOfBigNumbersTest {
  private static final BigInteger EXPECTED_INTEGER_SUM = new BigInteger("4294967294");
  private static final BigInteger EXPECTED_LONG_SUM = new BigInteger("18446744073709551614");
  private static final BigDecimal EXPECTED_DOUBLE_SUM = new BigDecimal("3.5953862697246314E+308");

  /**
   * Method under test: {@link SumOfBigNumbers#sumBigInteger(int, int)}
   */
  @Test
  void testSumBigInteger() {
    assertEquals(EXPECTED_INTEGER_SUM,
      SumOfBigNumbers.sumBigInteger(Integer.MAX_VALUE, Integer.MAX_VALUE));
    assertEquals(EXPECTED_LONG_SUM,
      SumOfBigNumbers.sumBigInteger(Long.MAX_VALUE, Long.MAX_VALUE));
  }

  /**
   * Method under test: {@link SumOfBigNumbers#sumBigDecimal(double, double)}
   */
  @Test
  void testSumBigDecimal() {
    assertEquals(EXPECTED_DOUBLE_SUM,
      SumOfBigNumbers.sumBigDecimal(Double.MAX_VALUE, Double.MAX_VALUE));
  }

  /**
   * Method under test: {@link SumOfBigNumbers#sumMath(int, int)}
   */
  @Test
  void testSumMath() {
    assertThrows(ArithmeticException.class,
      () -> SumOfBigNumbers.sumMath(Integer.MAX_VALUE, Integer.MAX_VALUE));
    assertThrows(ArithmeticException.class,
      () -> SumOfBigNumbers.sumMath(Long.MAX_VALUE, Long.MAX_VALUE));
  }
}

