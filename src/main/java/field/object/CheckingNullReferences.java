package field.object;

import java.util.List;
import java.util.Objects;

public class CheckingNullReferences {
  public static boolean isNullFirstOption(Object obj) {
    return obj == null;
  }

  public static boolean isNullSecondOption(Object obj) {
    return Objects.isNull(obj);
  }

  public static boolean isNullList(List<Object> list) {
    return list.stream().anyMatch(Objects::isNull);
  }

  public static boolean isNullWithCustomNullPointerException(Object obj) {
    try {
      Objects.requireNonNull(obj, "Custom NullPointerException!");
    } catch (NullPointerException e) {
      return true;
    }
    return false;
  }
}
