package field.data;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MapComputeMerge {
  private static final Map<String, String> map = new HashMap<>();

  static {
    map.put("postgresql", "127.0.0.1");
    map.put("mysql", "127.0.0.2");
    map.put("oracle", "localhost");
    map.put("redis", "127.0.0.4");
    map.put("cassandra", "127.0.0.5");
  }

  public static void main(String[] args) {
    log.info("Map: {}", map);

    log.info("~~~~~~~~~~~~~~~computeIfPresent()~~~~~~~~~~~~~~~");
    map.computeIfPresent("postgresql", (key, value) -> value + ":8080");
    log.info("Changed: {}", map.get("postgresql"));

    log.info("~~~~~~~~~~~~~~~computeIfAbsent()~~~~~~~~~~~~~~~");
    map.computeIfAbsent("mongodb", key -> "localhost:27017");
    log.info("Added: {}", map.get("mongodb"));

    log.info("~~~~~~~~~~~~~~~compute()~~~~~~~~~~~~~~~");
    map.compute("redis", (key, value) -> value + ":6379");
    log.info("Changed: {}", map.get("redis"));

    log.info("~~~~~~~~~~~~~~~merge()~~~~~~~~~~~~~~~");
    map.merge("cassandra", "localhost", (key, value) -> value + ":9042");
    log.info("Changed: {}", map.get("cassandra"));

    log.info("~~~~~~~~~~~~~~~putIfAbsent()~~~~~~~~~~~~~~~");
    map.putIfAbsent("elasticsearch", "localhost:9200");
    log.info("Added: {}", map.get("elasticsearch"));

    log.info("Map: {}", map);
  }
}
