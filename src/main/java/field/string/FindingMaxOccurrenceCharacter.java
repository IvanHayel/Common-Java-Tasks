package field.string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.tuple.Pair;

/*
  * Find the most frequently occurring character in a string.
  *
  * If you don't want to use Apache Commons Lang3, you can use the following:
  * Map.Entry<Character, Integer> / Map.Entry<Character, Long>
 */

public class FindingMaxOccurrenceCharacter {
  private static final int EXTENDED_ASCII_CODES = 256;

  public static Pair<Character, Integer> maxOccurrenceCharacterFirstOption(String str) {
    Map<Character, Integer> counter = new HashMap<>();
    char[] array = str.toCharArray();
    for(int i = 0; i < array.length; i++) {
      char current = array[i];
      if(!Character.isWhitespace(current)) {
        counter.merge(current, 1, Integer::sum);
      }
    }
    int maxOccurrence = Collections.max(counter.values());
    char maxOccurrenceCharacter = Character.MIN_VALUE;
    for(Map.Entry<Character, Integer> entry : counter.entrySet()) {
      if(entry.getValue() == maxOccurrence) {
        maxOccurrenceCharacter = entry.getKey();
        break;
      }
    }
    return Pair.of(maxOccurrenceCharacter, maxOccurrence);
  }

  public static Pair<Character, Integer> maxOccurrenceCharacterSecondOption(String str) {
    int maxOccurrence = 0;
    char maxCharacter = Character.MIN_VALUE;
    char[] array = str.toCharArray();
    int[] asciiCodes = new int[EXTENDED_ASCII_CODES];
    for(int i = 0; i < array.length; i++) {
      char current = array[i];
      if(!Character.isWhitespace(current)) {
        asciiCodes[current]++;
        if(asciiCodes[current] > maxOccurrence) {
          maxOccurrence = asciiCodes[current];
          maxCharacter = current;
        }
      }
    }
    return Pair.of(maxCharacter, maxOccurrence);
  }

  public static Pair<Character, Long> maxOccurrenceCharacterThirdOption(String str) {
    return str.chars()
        .filter(ch -> !Character.isWhitespace(ch))
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue())
        .map(entry -> Pair.of(entry.getKey(), entry.getValue()))
        .orElse(Pair.of(Character.MIN_VALUE, 0L));
  }
}
