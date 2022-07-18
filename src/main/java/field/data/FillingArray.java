package field.data;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class FillingArray {
  public static void fillArrayFirstOption(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
      array[i] = value;
    }
  }

  public static void fillArraySecondOption(int[] array, int value) {
    Arrays.fill(array, value);
  }

  public static void setArrayFirstOption(int[] array, IntUnaryOperator operator) {
    for (int i = 0; i < array.length; i++) {
      array[i] = operator.applyAsInt(i);
    }
  }

  public static void setArraySecondOption(int[] array, IntUnaryOperator operator) {
    Arrays.setAll(array, operator);
  }

  public static void setArrayParallel(int[] array, IntUnaryOperator operator) {
    Arrays.parallelSetAll(array, operator);
  }
}
