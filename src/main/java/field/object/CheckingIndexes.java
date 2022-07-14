package field.object;

import java.util.Objects;

public class CheckingIndexes {
  public static boolean isIndexValidFirstOption(int index, int upperBound) {
    return index >= 0 && index < upperBound;
  }

  public static boolean isIndexValidSecondOption(int index, int upperBound) {
    try {
      Objects.checkIndex(index, upperBound);
    } catch (IndexOutOfBoundsException e) {
      return false;
    }
    return true;
  }

  public static boolean isIntervalValidFirstOption(int from, int to, int upperBound) {
    return from >= 0 && to < upperBound;
  }

  public static boolean isIntervalValidSecondOption(int from, int to, int upperBound) {
    try {
      Objects.checkFromToIndex(from, to, upperBound);
    } catch (IndexOutOfBoundsException e) {
      return false;
    }
    return true;
  }
}
