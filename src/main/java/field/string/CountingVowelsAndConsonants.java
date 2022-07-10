package field.string;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.tuple.Pair;

public class CountingVowelsAndConsonants {
  private static final Set<Character> ALL_VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

  public static Pair<Integer, Integer> countVowelsAndConsonantsFirstOption(String text) {
    text = text.toLowerCase();
    int vowels = 0;
    int consonants = 0;
    for (char character : text.toCharArray()) {
      if (ALL_VOWELS.contains(character)) {
        vowels++;
      } else if (character >= 'a' && character <= 'z') {
        consonants++;
      }
    }
    return Pair.of(vowels, consonants);
  }

  public static Pair<Long, Long> countVowelsAndConsonantsSecondOption(String text) {
    text = text.toLowerCase();
    long vowels = text.chars()
        .filter(character -> ALL_VOWELS.contains((char) character))
        .count();
    long consonants = text.chars()
        .filter(character -> !ALL_VOWELS.contains((char) character))
        .filter(character -> character >= 'a' && character <= 'z')
        .count();
    return Pair.of(vowels, consonants);
  }

  public static Pair<Long, Long> countVowelsAndConsonantsThirdOption(String text) {
    text = text.toLowerCase();
    Map<Boolean, Long> result = text.chars()
        .mapToObj(character -> (char) character)
        .filter(character -> (character >= 'a' && character <= 'z'))
        .collect(Collectors.partitioningBy(ALL_VOWELS::contains, Collectors.counting()));
    return Pair.of(result.get(true), result.get(false));
  }
}