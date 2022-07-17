package field.data;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class CreatingStreamFromArrayTest {
  private static final String[] TEST_ARRAY = {"a", "b", "c", "d", "e"};

  /**
   * Method under test: {@link CreatingStreamFromArray#createStreamFirstOption(String[])}
   */
  @Test
  void testCreateStreamFirstOption() {
    log.info("~~~~~~~~~~FIRST~OPTION~~~~~~~~~~");
    CreatingStreamFromArray.createStreamFirstOption(TEST_ARRAY).forEach(log::info);
  }

  /**
   * Method under test: {@link CreatingStreamFromArray#createStreamSecondOption(String[])}
   */
  @Test
  void testCreateStreamSecondOption() {
    log.info("~~~~~~~~~~SECOND~OPTION~~~~~~~~~~");
    CreatingStreamFromArray.createStreamSecondOption(TEST_ARRAY).forEach(log::info);
  }

  /**
   * Method under test: {@link CreatingStreamFromArray#createStreamThirdOption(String[])}
   */
  @Test
  void testCreateStreamThirdOption() {
    log.info("~~~~~~~~~~THIRD~OPTION~~~~~~~~~~");
    CreatingStreamFromArray.createStreamThirdOption(TEST_ARRAY).forEach(log::info);
  }
}

