package field.math;

import java.util.function.BinaryOperator;

public class FindingExtremes {
  public static int minMath(int a, int b) {
    return Math.min(a, b);
  }

  public static int maxMath(int a, int b) {
    return Math.max(a, b);
  }

  public static int minWrapper(int a, int b) {
    return Integer.min(a, b);
  }

  public static int maxWrapper(int a, int b) {
    return Integer.max(a, b);
  }

  public static int minBinaryOperator(int a, int b) {
    return BinaryOperator.minBy(Integer::compare).apply(a, b);
  }

  public static int maxBinaryOperator(int a, int b) {
    return BinaryOperator.maxBy(Integer::compare).apply(a, b);
  }
}
