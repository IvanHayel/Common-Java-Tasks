package field.data;

import java.util.Arrays;

public class ResizingArray {
  public static int[] resizeFirstOption(int[] array, int newSize) {
    int[] result = new int[newSize];
    System.arraycopy(array, 0, result, 0, Math.min(array.length, newSize));
    return result;
  }

  public static int[] resizeSecondOption(int[] array, int newSize) {
    int[] result = new int[newSize];
    int length = Math.min(array.length, newSize);
    for (int i = 0; i < length; i++) {
      result[i] = array[i];
    }
    return result;
  }

  public static int[] resizeThirdOption(int[] array, int newSize) {
    return Arrays.copyOf(array, newSize);
  }
}
