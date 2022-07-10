package field.string;

import com.google.common.base.Strings;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

public class RepeatConcatenation {
  public static String repeatFirstOption(String string, int times) {
    StringBuilder builder = new StringBuilder(string.length() * times);
    for (int i = 0; i < times; i++) {
      builder.append(string);
    }
    return builder.toString();
  }

  public static String repeatSecondOption(String string, int times) {
    return string.repeat(times);
  }

  public static String repeatThirdOption(String string, int times) {
    return String.join("", Collections.nCopies(times, string));
  }

  public static String repeatFourthOption(String string, int times) {
    return Stream.generate(() -> string)
        .limit(times)
        .collect(Collectors.joining());
  }

  public static String repeatFifthOption(String string, int times) {
    return String.format("%0" + times + "d", 0).replace("0", string);
  }

  public static String repeatSixthOption(String string, int times) {
    return new String(new char[times]).replace("\0", string);
  }

  public static String repeatApache(String string, int times) {
    return StringUtils.repeat(string, times);
  }

  public static String repeatGuava(String string, int times) {
    return Strings.repeat(string, times);
  }

  public static boolean hasOnlySubstrings(String string) {
    StringBuilder builder = new StringBuilder();
    for(int i = 0; i < string.length() / 2; i++) {
      builder.append(string.charAt(i));
      String result = string.replaceAll(builder.toString(), "");
      if(result.length() == 0) {
        return true;
      }
    }
    return false;
  }
}
