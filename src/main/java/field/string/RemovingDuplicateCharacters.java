package field.string;

import java.util.Arrays;
import java.util.Set;

public class RemovingDuplicateCharacters {
  public static String removeDuplicatesFirstOption(String str) {
    char[] array = str.toCharArray();
    StringBuilder builder = new StringBuilder();
    for (char c : array) {
      if (builder.indexOf(String.valueOf(c)) == -1) {
        builder.append(c);
      }
    }
    return builder.toString();
  }

  public static String removeDuplicatesSecondOption(String str) {
    char[] array = str.toCharArray();
    StringBuilder builder = new StringBuilder();
    Set<Character> set = new java.util.HashSet<>();
    for (char c : array) {
      if (set.add(c)) {
        builder.append(c);
      }
    }
    return builder.toString();
  }

  public static String removeDuplicatesThirdOption(String str) {
    return Arrays.stream(str.split(""))
      .distinct()
      .reduce("", (a, b) -> a + b);
  }
}
