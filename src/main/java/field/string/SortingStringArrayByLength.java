package field.string;

import java.util.Arrays;
import java.util.Comparator;

enum SortDirection {
  ASCENDING, DESCENDING
}

public class SortingStringArrayByLength {
  public static void sortArrayByLengthFirstOption(String[] array, SortDirection direction) {
    if (direction == SortDirection.ASCENDING) {
      Arrays.sort(array, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    } else {
      Arrays.sort(array, (s1, s2) -> -1 * Integer.compare(s1.length(), s2.length()));
    }
  }

  public static void sortArrayByLengthSecondOption(String[] array, SortDirection direction) {
    if (direction == SortDirection.ASCENDING) {
      Arrays.sort(array, Comparator.comparingInt(String::length));
    } else {
      Arrays.sort(array, Comparator.comparingInt(String::length).reversed());
    }
  }

  public static String[] sortArrayByLengthThirdOption(String[] array, SortDirection direction) {
    if (direction == SortDirection.ASCENDING) {
      return Arrays.stream(array)
        .sorted(Comparator.comparingInt(String::length))
        .toArray(String[]::new);
    } else {
      return Arrays.stream(array)
        .sorted(Comparator.comparingInt(String::length).reversed())
        .toArray(String[]::new);
    }
  }
}
