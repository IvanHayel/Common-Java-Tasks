package field.math;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SumOfBigNumbers {
  public static BigInteger sumBigInteger(int a, int b) {
    return BigInteger.valueOf(a).add(BigInteger.valueOf(b));
  }

  public static BigInteger sumBigInteger(long a, long b) {
    return BigInteger.valueOf(a).add(BigInteger.valueOf(b));
  }

  public static BigDecimal sumBigDecimal(double a, double b) {
    return BigDecimal.valueOf(a).add(BigDecimal.valueOf(b));
  }

  // Except addExact() there are multiplyExact(), divideExact(), negateExact(), etc.

  public static int sumMath(int a, int b) throws ArithmeticException {
    return Math.addExact(a, b);
  }

  public static long sumMath(long a, long b) throws ArithmeticException {
    return Math.addExact(a, b);
  }
}
