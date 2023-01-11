package field.string;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GeneratingAllPermutations {
  private static final String HR = "----------------------------------------------------";
  private static final String STRING_FOR_PERMUTATION = "123";

  public static void main(String[] args) {
    permuteAndPrint(STRING_FOR_PERMUTATION);
  }

  public static void permuteAndPrint(String str) {
    permuteAndPrint("", str);
    log.info(HR);
    Set<String> set = permuteAndStore(str);
    set.forEach(permutation -> log.info("permuteAndStore() >> {}", permutation));
    log.info(HR);
    permuteAndPrintStream("", str);
    log.info(HR);
  }

  public static void permuteAndPrint(String prefix, String str) {
    int size = str.length();
    if (size == 0) {
      log.info("permuteAndPrint() >> {}", prefix);
    } else {
      for (int i = 0; i < size; i++) {
        permuteAndPrint(
          prefix + str.charAt(i),
          str.substring(i + 1, size) + str.substring(0, i)
        );
      }
    }
  }

  public static Set<String> permuteAndStore(String str) {
    return permuteAndStore("", str);
  }

  public static Set<String> permuteAndStore(String prefix, String str) {
    Set<String> permutations = new HashSet<>();
    int size = str.length();
    if (size == 0) {
      permutations.add(prefix);
    } else {
      for (int i = 0; i < size; i++) {
        permutations.addAll(permuteAndStore(
          prefix + str.charAt(i),
          str.substring(i + 1, size) + str.substring(0, i)
        ));
      }
    }
    return permutations;
  }

  public static void permuteAndPrintStream(String prefix, String str) {
    int size = str.length();
    if (size == 0) {
      log.info("permuteAndPrintStream() >> {}", prefix);
    } else {
      IntStream.range(0, size)
        .parallel()
        .forEach(i -> permuteAndPrintStream(
          prefix + str.charAt(i),
          str.substring(i + 1, size) + str.substring(0, i)
        ));
    }
  }

  public static Stream<String> permuteAndReturnStream(String str) {
    if (str == null || str.isBlank()) {
      return Stream.of("");
    }
    return IntStream.range(0, str.length())
      .parallel()
      .boxed()
      .flatMap(i -> permuteAndReturnStream(str.substring(0, i) + str.substring(i + 1))
        .map(c -> str.charAt(i) + c)
      );
  }
}