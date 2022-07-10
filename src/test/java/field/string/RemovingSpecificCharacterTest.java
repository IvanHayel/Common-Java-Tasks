package field.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemovingSpecificCharacterTest {
  private static final String STRING = "abcdefghijklmnopqrstuvwxyz";
  private static final char CHARACTER = 'a';
  private static final String CHARACTER_STRING = "a";
  private static final String EXPECTED_RESULT = "bcdefghijklmnopqrstuvwxyz";


  /**
   * Method under test: {@link RemovingSpecificCharacter#removeCharacterFirstOption(String, char)}
   */
  @Test
  void testRemoveCharacterFirstOption() {
    String result = RemovingSpecificCharacter.removeCharacterFirstOption(STRING, CHARACTER);
    assertEquals(EXPECTED_RESULT, result);
  }

  /**
   * Method under test: {@link RemovingSpecificCharacter#removeCharacterSecondOption(String, char)}
   */
  @Test
  void testRemoveCharacterSecondOption() {
    String result = RemovingSpecificCharacter.removeCharacterSecondOption(STRING, CHARACTER);
    assertEquals(EXPECTED_RESULT, result);
  }

  /**
   * Method under test: {@link RemovingSpecificCharacter#removeCharacterThirdOption(String, char)}
   */
  @Test
  void testRemoveCharacterThirdOption() {
    String result = RemovingSpecificCharacter.removeCharacterThirdOption(STRING, CHARACTER);
    assertEquals(EXPECTED_RESULT, result);
  }

  /**
   * Method under test: {@link RemovingSpecificCharacter#removeCharacterFourthOption(String, char)}
   */
  @Test
  void testRemoveCharacterFourthOption() {
    String result = RemovingSpecificCharacter.removeCharacterFourthOption(STRING, CHARACTER);
    assertEquals(EXPECTED_RESULT, result);
  }

  /**
   * Method under test: {@link RemovingSpecificCharacter#removeCharacterFifthOption(String,
   * String)}
   */
  @Test
  void testRemoveCharacterFifthOption() {
    String result = RemovingSpecificCharacter.removeCharacterFifthOption(STRING, CHARACTER_STRING);
    assertEquals(EXPECTED_RESULT, result);
  }
}
