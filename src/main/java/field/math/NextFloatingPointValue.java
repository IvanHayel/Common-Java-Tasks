package field.math;

public class NextFloatingPointValue {
  public static float nextUp(float value) {
    return Math.nextUp(value);
  }

  public static double nextUp(double value) {
    return Math.nextUp(value);
  }

  public static float nextDown(float value) {
    return Math.nextDown(value);
  }

  public static double nextDown(double value) {
    return Math.nextDown(value);
  }
}
