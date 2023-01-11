package field.string;

import java.util.function.Function;

public class StringTransformation {
  public static <R> R transformFirstOption(String string,
    Function<? super String, ? extends R> function) {
    return function.apply(string);
  }

  public static String transformSecondOption(String string,
    Function<? super String, ? extends String> function) {
    return string.transform(function);
  }
}
