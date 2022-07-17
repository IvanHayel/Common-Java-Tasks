package field.data;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import org.apache.commons.lang3.ArrayUtils;

public class InvertingArray {
  public static void reverseFirstOption(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = temp;
    }
  }

  public static void reverseSecondOption(int[] array) {
    int[] result = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i])
        .toArray();
    IntStream.range(0, array.length).forEach(i -> array[i] = result[i]);
  }

  public static void reverseThirdOption(int[] array) {
    List<Integer> list = new ArrayList<>();
    Arrays.stream(array).forEach(list::add);
    Collections.reverse(list);
    IntStream.range(0, array.length).forEach(i -> array[i] = list.get(i));
  }

  public static void reverseApache(int[] array) {
    ArrayUtils.reverse(array);
  }

  public static void reverseGuava(int[] array) {
    List<Integer> list = new ArrayList<>();
    Arrays.stream(array).forEach(list::add);
    List<Integer> reversed = Lists.reverse(list);
    IntStream.range(0, array.length).forEach(i -> array[i] = reversed.get(i));
  }
}
