package field.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.ZoneId;
import java.util.List;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class GettingAllTimeZonesTest {
  private static final int ZONES_COUNT = 600;
  private static final String SYSTEM_DEFAULT_ZONE_ID = ZoneId.systemDefault().toString();

  /**
   * Method under test: {@link GettingAllTimeZones#getAllTimeZoneIds()}
   */
  @Test
  void testGetAllTimeZoneIds() {
    Set<String> actualAllTimeZoneIds = GettingAllTimeZones.getAllTimeZoneIds();
    assertEquals(ZONES_COUNT, actualAllTimeZoneIds.size());
    assertTrue(actualAllTimeZoneIds.contains("Asia/Aden"));
    assertTrue(actualAllTimeZoneIds.contains("America/Cuiaba"));
    assertTrue(actualAllTimeZoneIds.contains("Etc/GMT+9"));
    assertTrue(actualAllTimeZoneIds.contains("Etc/GMT+8"));
    assertTrue(actualAllTimeZoneIds.contains("Africa/Nairobi"));
    assertTrue(actualAllTimeZoneIds.contains("America/Marigot"));
    assertTrue(actualAllTimeZoneIds.contains("Asia/Aqtau"));
    assertTrue(actualAllTimeZoneIds.contains("Pacific/Kwajalein"));
    assertTrue(actualAllTimeZoneIds.contains("America/El_Salvador"));
    assertTrue(actualAllTimeZoneIds.contains("Asia/Pontianak"));
    assertTrue(actualAllTimeZoneIds.contains("Africa/Cairo"));
  }

  /**
   * Method under test: {@link GettingAllTimeZones#getDefaultZoneId()}
   */
  @Test
  void testGetDefaultZoneId() {
    String actualDefaultZoneId = GettingAllTimeZones.getDefaultZoneId().getId();
    assertEquals(SYSTEM_DEFAULT_ZONE_ID, actualDefaultZoneId);
  }

  /**
   * Method under test: {@link GettingAllTimeZones#fetchTimeZones()}
   */
  @Test
  void testFetchTimeZones() {
    List<String> actualFetchTimeZonesResult = GettingAllTimeZones.fetchTimeZones();
    assertEquals(ZONES_COUNT, actualFetchTimeZonesResult.size());
    assertEquals("(+03:00) Asia/Aden", actualFetchTimeZonesResult.get(0));
    assertEquals("(-04:00) America/Cuiaba", actualFetchTimeZonesResult.get(1));
    assertEquals("(-09:00) Etc/GMT+9", actualFetchTimeZonesResult.get(2));
    assertEquals("(-08:00) Etc/GMT+8", actualFetchTimeZonesResult.get(3));
    assertEquals("(+03:00) Africa/Nairobi", actualFetchTimeZonesResult.get(4));
    assertEquals("(-04:00) America/Marigot", actualFetchTimeZonesResult.get(5));
    assertEquals("(-03:00) America/Argentina/Buenos_Aires", actualFetchTimeZonesResult.get(594));
    assertEquals("(+11:00) Pacific/Guadalcanal", actualFetchTimeZonesResult.get(596));

    log.info("All time zones:");
    actualFetchTimeZonesResult.forEach(log::info);
  }
}
