package field.string;

public class CheckingForAnagram {
  private static final int EXTENDED_ASCII_CODES = 256;

  public static boolean isAnagram(String first, String second) {
    first = first.toLowerCase().replaceAll("\\s", "");
    second = second.toLowerCase().replaceAll("\\s", "");
    if (first.length() != second.length()) {
      return false;
    }
    int[] letters = new int[EXTENDED_ASCII_CODES];
    for (int i = 0; i < first.length(); i++) {
      letters[first.charAt(i)]++;
      letters[second.charAt(i)]--;
    }
    for (int letter : letters) {
      if (letter != 0) {
        return false;
      }
    }
    return true;
  }
}
