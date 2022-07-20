package field.data;

import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConvertingCollectionToArray {
  private static final List<String> LIST = List.of("a", "b", "c");

  public static void main(String[] args) {
    String[] arrayFirst = LIST.toArray(new String[0]);
    String[] arraySecond = LIST.toArray(String[]::new);

    log.info("First array: {}", Arrays.toString(arrayFirst));
    log.info("Second array: {}", Arrays.toString(arraySecond));
  }
}
