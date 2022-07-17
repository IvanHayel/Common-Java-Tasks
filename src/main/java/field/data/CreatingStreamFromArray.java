package field.data;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamFromArray {
  public static Stream<String> createStreamFirstOption(String[] array) {
    return Stream.of(array);
  }

  public static Stream<String> createStreamSecondOption(String[] array) {
    return Arrays.stream(array);
  }

  public static Stream<String> createStreamThirdOption(String[] array) {
    return Arrays.asList(array).stream();
  }
}
