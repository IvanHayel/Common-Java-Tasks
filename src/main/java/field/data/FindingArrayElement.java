package field.data;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindingArrayElement {
  public static boolean containsElementFirstOption(int[] array, int toContain) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == toContain) {
        return true;
      }
    }
    return false;
  }

  public static boolean containsElementSecondOption(int[] array, int toContain) {
    return Arrays.stream(array).anyMatch(i -> i == toContain);
  }

  public static boolean containsElementThirdOption(int[] array, int toContain) {
    Arrays.sort(array);
    return Arrays.binarySearch(array, toContain) >= 0;
  }

  public static int findIndexOfElementFirstOption(int[] array, int toFind) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == toFind) {
        return i;
      }
    }
    return -1;
  }

  public static int findIndexOfElementSecondOption(int[] array, int toFind) {
    return IntStream.range(0, array.length).filter(i -> array[i] == toFind).findFirst().orElse(-1);
  }
}
