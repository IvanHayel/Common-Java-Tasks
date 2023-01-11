package field.string;

public class CountingOccurrencesOfACertainCharacter {
  public static int countCommonFirstOption(String text, char character) {
    return text.length() - text.replace(String.valueOf(character), "").length();
  }

  public static int countCommonSecondOption(String text, char character) {
    int result = 0;
    for (int counter = 0; counter < text.length(); counter++) {
      if (text.charAt(counter) == character) {
        result++;
      }
    }
    return result;
  }

  public static long countCommonThirdOption(String text, char character) {
    return text.chars()
      .filter(c -> c == character)
      .count();
  }

  public static int countConsideringUnicodeSurrogatePairs(String text, String character) {
    if (character.codePointCount(0, character.length()) > 1) {
      return -1;
    }
    int result = text.length() - text.replace(character, "").length();
    return character.length() == 2 ? result / 2 : result;
  }

  public static int countApacheStringUtilsCountMatches(String text, String character) {
    return org.apache.commons.lang3.StringUtils.countMatches(text, character);
  }

  public static int countSpringStringUtilsCountOccurrencesOf(String text, String character) {
    return org.springframework.util.StringUtils.countOccurrencesOf(text, character);
  }

  public static int countGuavaCharMatcherCountIn(String text, char character) {
    return com.google.common.base.CharMatcher.is(character).countIn(text);
  }
}