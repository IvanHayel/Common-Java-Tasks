package field.data;

import java.util.Arrays;

public class CheckingEquivalenceOfArrays {
  public static boolean areEqualsFirstOption(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    }
    for (int i = 0; i < array1.length; i++) {
      if (array1[i] != array2[i]) {
        return false;
      }
    }
    return true;
  }

  public static boolean areEqualsSecondOption(int[] array1, int[] array2) {
    return Arrays.equals(array1, array2);
  }

  public static boolean areEqualsThirdOption(int[] array1, int[] array2) {
    return Arrays.mismatch(array1, array2) == -1;
  }
}
