package field.string;

import com.google.common.base.Joiner;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

public class JoiningMultipleStringsWithDelimiter {
  public static String joinByDelimiterFirstOption(char delimiter, String... args) {
    StringBuilder builder = new StringBuilder();
    int i = 0;
    for (; i < args.length - 1; i++) {
      builder.append(args[i]).append(delimiter);
    }
    builder.append(args[i]);
    return builder.toString();
  }

  public static String joinByDelimiterSecondOption(char delimiter, String... args) {
    StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));
    for (String arg : args) {
      joiner.add(arg);
    }
    return joiner.toString();
  }

  public static String joinByDelimiterThirdOption(char delimiter, String... args) {
    return String.join(String.valueOf(delimiter), args);
  }

  public static String joinByDelimiterFourthOption(char delimiter, String... args) {
    return Arrays.stream(args)
        .collect(Collectors.joining(String.valueOf(delimiter)));
  }

  public static String joinByDelimiterApacheCommons(char delimiter, String... args) {
    return StringUtils.join(args, String.valueOf(delimiter));
  }

  public static String joinByDelimiterGuava(char delimiter, String... args) {
    return Joiner.on(delimiter).join(args);
  }
}