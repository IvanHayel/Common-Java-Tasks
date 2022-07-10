package field.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingOccurrencesOfSubstring {
  public static int countOccurrencesFirstOption(String text, String substring) {
    int position = 0;
    int count = 0;
    int n = substring.length();
    while ((position = text.indexOf(substring, position)) != -1) {
      count++;
      position += n;
    }
    return count;
  }

  public static int countOccurrencesSecondOption(String text, String substring) {
    int result = text.split(Pattern.quote(substring), -1).length - 1;
    return Math.max(result, 0);
  }

  public static int countOccurrencesThirdOption(String text, String substring) {
    Pattern pattern = Pattern.compile(Pattern.quote(substring));
    Matcher matcher = pattern.matcher(text);
    int position = 0;
    int count = 0;
    while (matcher.find(position)) {
      count++;
      position = matcher.end();
    }
    return count;
  }
}
