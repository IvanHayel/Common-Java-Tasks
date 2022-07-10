package field.string;

import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class RemovingSpecificCharacter {
  public static String removeCharacterFirstOption(String str, char c) {
    return str.replace(String.valueOf(c), "");
  }

  public static String removeCharacterSecondOption(String str, char c) {
    return str.replaceAll(Pattern.quote(String.valueOf(c)), "");
  }

  public static String removeCharacterThirdOption(String str, char c) {
    StringBuilder builder = new StringBuilder();
    char[] array = str.toCharArray();
    for(char ch : array) {
      if(ch != c) {
        builder.append(ch);
      }
    }
    return builder.toString();
  }

  public static String removeCharacterFourthOption(String str, char c) {
    return str.chars()
        .filter(ch -> ch != c)
        .mapToObj(ch -> String.valueOf((char) ch))
        .reduce("", (a, b) -> a + b);
  }

  public static String removeCharacterFifthOption(String str, String c) {
    int codePoint = c.codePointAt(0);
    return str.codePoints()
        .filter(ch -> ch != codePoint)
        .mapToObj(ch -> String.valueOf((char) ch))
        .reduce("", (a, b) -> a + b);
  }

  public static String removeCharacterApache(String str, char c) {
    return StringUtils.remove(str, c);
  }
}
