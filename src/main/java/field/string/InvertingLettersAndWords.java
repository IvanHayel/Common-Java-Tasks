package field.string;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

public class InvertingLettersAndWords {
  private static final String WHITESPACE = " ";
  private static final Pattern PATTERN = Pattern.compile(" +");

  public static String invertFirstOption(String text) {
    String[] words = text.split(WHITESPACE);
    StringBuilder reverseString = new StringBuilder();
    for (String word : words) {
      StringBuilder reverseWord = new StringBuilder();
      for (int counter = word.length() - 1; counter >= 0; counter--) {
        reverseWord.append(word.charAt(counter));
      }
      reverseString.append(reverseWord).append(WHITESPACE);
    }
    return reverseString.toString().trim();
  }

  public static String invertSecondOption(String text) {
    return PATTERN.splitAsStream(text)
      .map(word -> new StringBuilder(word).reverse())
      .collect(Collectors.joining(WHITESPACE));
  }

  public static String invertThirdOption(String text) {
    return new StringBuilder(text).reverse().toString();
  }

  public static String invertApacheCommonsLang(String text) {
    return StringUtils.reverse(text);
  }
}