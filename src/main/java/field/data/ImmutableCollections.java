package field.data;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.collections.list.UnmodifiableList;

public class ImmutableCollections {
  private static final List<Integer> IMMUTABLE_LIST_FIRST =
      List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  private static final List<Integer> IMMUTABLE_LIST_SECOND =
      Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
  private static final List<Integer> IMMUTABLE_LIST_APACHE =
      UnmodifiableList.decorate(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
  private static final List<Integer> IMMUTABLE_LIST_GUAVA =
      ImmutableList.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  private static final List<Integer> SINGLETON_LIST = Collections.singletonList(1);
}

class ImmutableArray<T> {
  private final T[] array;

  public ImmutableArray(T[] array) {
    this.array = Arrays.copyOf(array, array.length);
  }

  public static <T> ImmutableArray<T> of(T[] array) {
    return new ImmutableArray<>(array);
  }

  public T get(int index) {
    return array[index];
  }
}
