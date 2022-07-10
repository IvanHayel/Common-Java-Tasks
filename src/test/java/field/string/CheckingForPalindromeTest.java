package field.string;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CheckingForPalindromeTest {
  private static final String PALINDROME = "radar";
  private static final String NOT_PALINDROME = "radar1";
  private static final String EMPTY_STRING = "";

  /**
   * Method under test: {@link CheckingForPalindrome#isPalindromeFirstOption(String)}
   */
  @Test
  void testIsPalindromeFirstOption() {
    assertTrue(CheckingForPalindrome.isPalindromeFirstOption(PALINDROME));
    assertFalse(CheckingForPalindrome.isPalindromeFirstOption(NOT_PALINDROME));
    assertTrue(CheckingForPalindrome.isPalindromeFirstOption(EMPTY_STRING));
  }

  /**
   * Method under test: {@link CheckingForPalindrome#isPalindromeSecondOption(String)}
   */
  @Test
  void testIsPalindromeSecondOption() {
    assertTrue(CheckingForPalindrome.isPalindromeSecondOption(PALINDROME));
    assertFalse(CheckingForPalindrome.isPalindromeSecondOption(NOT_PALINDROME));
    assertTrue(CheckingForPalindrome.isPalindromeSecondOption(EMPTY_STRING));
  }

  /**
   * Method under test: {@link CheckingForPalindrome#isPalindromeThirdOption(String)}
   */
  @Test
  void testIsPalindromeThirdOption() {
    assertTrue(CheckingForPalindrome.isPalindromeThirdOption(PALINDROME));
    assertFalse(CheckingForPalindrome.isPalindromeThirdOption(NOT_PALINDROME));
    assertTrue(CheckingForPalindrome.isPalindromeThirdOption(EMPTY_STRING));
  }

  /**
   * Method under test: {@link CheckingForPalindrome#isPalindromeFourthOption(String)}
   */
  @Test
  void testIsPalindromeFourthOption() {
    assertTrue(CheckingForPalindrome.isPalindromeFourthOption(PALINDROME));
    assertFalse(CheckingForPalindrome.isPalindromeFourthOption(NOT_PALINDROME));
    assertTrue(CheckingForPalindrome.isPalindromeFourthOption(EMPTY_STRING));
  }
}

