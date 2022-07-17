package field.data;

import java.util.Arrays;

public class FindingArrayExtremes {
  public static int findMaxFirstOption(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  public static int findMaxSecondOption(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      max = Math.max(max, array[i]);
    }
    return max;
  }

  public static int findMaxThirdOption(int[] array) {
    return Arrays.stream(array).max().orElse(Integer.MAX_VALUE);
  }

  public static double calculateAverageFirstOption(int[] array) {
    double sum = 0;
    for (int j : array) {
      sum += j;
    }
    return sum / array.length;
  }

  public static double calculateAverageSecondOption(int[] array) {
    return Arrays.stream(array).average().orElse(0);
  }
}
