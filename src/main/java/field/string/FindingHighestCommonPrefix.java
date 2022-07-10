package field.string;

public class FindingHighestCommonPrefix {
  public static String findPrefixFirstOption(String[] strings) {
    if (strings.length == 0) {
      return "";
    }
    String prefix = strings[0];
    for (int i = 1; i < strings.length; i++) {
      while (strings[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
      }
    }
    return prefix;
  }

  public static String findPrefixSecondOption(String[] strings) {
    if (strings.length == 1) {
      return strings[0];
    }
    int firstLength = strings[0].length();
    for (int prefixLength = 0; prefixLength < firstLength; prefixLength++) {
      char c = strings[0].charAt(prefixLength);
      for (int i = 1; i < strings.length; i++) {
        if (strings[i].length() <= prefixLength || strings[i].charAt(prefixLength) != c) {
          return strings[0].substring(0, prefixLength);
        }
      }
    }
    return strings[0];
  }
}
