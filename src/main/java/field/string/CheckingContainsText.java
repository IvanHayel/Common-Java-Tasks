package field.string;

import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class CheckingContainsText {
  public static boolean containsFirstOption(String text, String substring) {
    return text.contains(substring);
  }

  public static boolean containsSecondOption(String text, String substring) {
    return text.indexOf(substring) != -1;
  }

  public static boolean containsThirdOption(String text, String substring) {
    return text.matches("(?i).*" + Pattern.quote(substring) + ".*");
  }

  public static boolean containsApache(String text, String substring) {
    return StringUtils.contains(text, substring);
  }
}
