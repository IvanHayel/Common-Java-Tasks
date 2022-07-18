package field.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortingMap {
  public static <K, V> TreeMap<K, V> sortByTreeMap(Map<K, V> map) {
    return new TreeMap<>(map);
  }

  public static <K, V> Map<K, V> sortByKeyStream(Map<K, V> map, Comparator<? super K> comparator) {
    return map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey(comparator))
        .collect(Collectors.toMap(
            Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new
        ));
  }

  public static <K, V> Map<K, V> sortByValueStream(Map<K, V> map, Comparator<? super V> comparator) {
    return map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(comparator))
        .collect(Collectors.toMap(
            Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new
        ));
  }

  public static <K extends Comparable, V> List<K> sortByKeyList(Map<K, V> map) {
    List<K> list = new ArrayList<>(map.keySet());
    Collections.sort(list);
    return list;
  }

  public static <K, V extends Comparable> List<V> sortByValueList(Map<K, V> map) {
    List<V> list = new ArrayList<>(map.values());
    Collections.sort(list);
    return list;
  }
}
