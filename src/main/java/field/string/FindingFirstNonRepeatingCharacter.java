package field.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingFirstNonRepeatingCharacter {
  private static final int EXTENDED_ASCII_CODES = 256;

  public static void main(String[] args) {
    String simpleTest = "abcdRabcd";
    System.out.println(getFirstNonRepeatedCharacterFirstOptionASCII256(simpleTest));
    System.out.println(getFirstNonRepeatedCharacterSecondOptionASCII256(simpleTest));
    System.out.println(getFirstNonRepeatedCharacterFirstOptionGeneral(simpleTest));
    System.out.println(getFirstNonRepeatedCharacterSecondOptionGeneral(simpleTest));
  }

  public static char getFirstNonRepeatedCharacterFirstOptionASCII256(String text) {
    int[] flags = new int[EXTENDED_ASCII_CODES];
    for (int counter = 0; counter < flags.length; counter++) {
      flags[counter] = -1;
    }
    for (int counter = 0; counter < text.length(); counter++) {
      char ch = text.charAt(counter);
      if (flags[ch] == -1) {
        flags[ch] = counter;
      } else {
        flags[ch] = -2;
      }
    }
    int position = Integer.MAX_VALUE;
    for (int counter = 0; counter < EXTENDED_ASCII_CODES; counter++) {
      if (flags[counter] >= 0) {
        position = Math.min(position, flags[counter]);
      }
    }
    return position == Integer.MAX_VALUE ? Character.MIN_VALUE : text.charAt(position);
  }

  public static char getFirstNonRepeatedCharacterSecondOptionASCII256(String text) {
    int[] flags = new int[EXTENDED_ASCII_CODES];
    Arrays.fill(flags, -1);
    for (int counter = 0; counter < text.length(); counter++) {
      char ch = text.charAt(counter);
      if (flags[ch] == -1) {
        flags[ch] = counter;
      } else {
        flags[ch] = -2;
      }
    }
    int position = Integer.MAX_VALUE;
    for (int counter = 0; counter < EXTENDED_ASCII_CODES; counter++) {
      if (flags[counter] >= 0) {
        position = Math.min(position, flags[counter]);
      }
    }
    return position == Integer.MAX_VALUE ? Character.MIN_VALUE : text.charAt(position);
  }

  public static char getFirstNonRepeatedCharacterFirstOptionGeneral(String text) {
    Map<Character, Integer> chars = new LinkedHashMap<>();
    for (int counter = 0; counter < text.length(); counter++) {
      char ch = text.charAt(counter);
      chars.compute(ch, (key, value) -> value == null ? 1 : ++value);
    }
    for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }
    return Character.MIN_VALUE;
  }

  public static char getFirstNonRepeatedCharacterSecondOptionGeneral(String text) {
    Map<Character, Integer> chars = new LinkedHashMap<>();
    for (char ch : text.toCharArray()) {
      chars.compute(ch, (key, value) -> value == null ? 1 : ++value);
    }
    for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }
    return Character.MIN_VALUE;
  }

  public static String getFirstNonRepeatedCharacterThirdOptionGeneral(String text) {
    Map<Integer, Long> chars = text.codePoints()
      .mapToObj(codePoint -> codePoint)
      .collect(
        Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    int cp = chars.entrySet().stream()
      .filter(entry -> entry.getValue() == 1L)
      .findFirst()
      .map(Map.Entry::getKey)
      .orElse(Integer.valueOf(Character.MIN_VALUE));
    return String.valueOf(Character.toChars(cp));
  }
}