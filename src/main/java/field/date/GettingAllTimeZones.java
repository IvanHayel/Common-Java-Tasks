package field.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GettingAllTimeZones {
  public static Set<String> getAllTimeZoneIds() {
    return ZoneId.getAvailableZoneIds();
  }

  public static ZoneId getDefaultZoneId() {
    return ZoneId.systemDefault();
  }

  public static List<String> fetchTimeZones() {
    List<String> timeZones = new ArrayList<>();
    Set<String> zoneIds = getAllTimeZoneIds();
    LocalDateTime now = LocalDateTime.now();
    zoneIds.forEach(zoneId -> timeZones.add("(" +
      now.atZone(ZoneId.of(zoneId))
        .getOffset()
        .getId()
        .replace("Z", "+00:00") +
      ") " + zoneId));
    return timeZones;
  }
}
