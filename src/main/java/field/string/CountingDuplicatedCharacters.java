package field.string;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicatedCharacters {
    public static Map<Character, Integer> countDuplicatedCharactersFirstOptionUTF16(String text) {
        Map<Character, Integer> result = new HashMap<>();
        for (char character : text.toCharArray())
            result.compute(character, (key, value) -> value == null ? 1 : ++value);
        return result;
    }

    public static Map<Character, Integer> countDuplicatedCharactersSecondOptionUTF16(String text) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            result.compute(character, (key, value) -> value == null ? 1 : ++value);
        }
        return result;
    }

    public static Map<Character, Long> countDuplicatedCharactersThirdOptionUTF16(String text) {
        return text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    public static Map<String, Integer> countDuplicatedCharactersFirstOptionUTF32(String text) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            int cp = text.codePointAt(i);
            String ch = String.valueOf(Character.toChars(cp));
            if (Character.charCount(cp) == 2) i++;
            result.compute(ch, (key, value) -> value == null ? 1 : ++value);
        }
        return result;
    }

    public static Map<String, Integer> countDuplicatedCharactersSecondOptionUTF32(String text) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            String ch = String.valueOf(Character.toChars(text.codePointAt(i)));
            if (i < text.length() - 1 && text.codePointCount(i, i + 2) == 1) i++;
            result.compute(ch, (key, value) -> value == null ? 1 : ++value);
        }
        return result;
    }

    public static Map<String, Long> countDuplicatedCharactersThirdOptionUTF32(String text) {
        return text.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    public static Multiset<String> countDuplicatedCharactersGuava(String text) {
        return HashMultiset.create(text.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.toList()));
    }
}