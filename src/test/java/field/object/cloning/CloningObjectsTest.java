package field.object.cloning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

class CloningObjectsTest {
  private static final Point POINT = new Point(1.0d, 2.0d);

  /**
   * Method under test: {@link CloningObjects#clonePointManual(Point)}
   */
  @Test
  void testClonePointManual() {
    Point clone = CloningObjects.clonePointManual(POINT);
    assertNotSame(POINT, clone);
    assertEquals(POINT.getX(), clone.getX());
    assertEquals(POINT.getY(), clone.getY());
  }

  /**
   * Method under test: {@link CloningObjects#clonePointThroughCloneable(Point)}
   */
  @Test
  void testClonePointThroughCloneable() throws CloneNotSupportedException {
    Point clone = CloningObjects.clonePointThroughCloneable(POINT);
    assertNotSame(POINT, clone);
    assertEquals(POINT.getX(), clone.getX());
    assertEquals(POINT.getY(), clone.getY());
  }

  /**
   * Method under test: {@link CloningObjects#clonePointThroughCopyConstructor(Point)}
   */
  @Test
  void testClonePointThroughCopyConstructor() {
    Point clone = CloningObjects.clonePointThroughCopyConstructor(POINT);
    assertNotSame(POINT, clone);
    assertEquals(POINT.getX(), clone.getX());
    assertEquals(POINT.getY(), clone.getY());
  }

  /**
   * Method under test: {@link CloningObjects#clonePointThroughCloningLibrary(Point)}
   */
  @Test
  void testClonePointThroughCloningLibrary() {
    Point clone = CloningObjects.clonePointThroughCloningLibrary(POINT);
    assertNotSame(POINT, clone);
    assertEquals(POINT.getX(), clone.getX());
    assertEquals(POINT.getY(), clone.getY());
  }

  /**
   * Method under test: {@link CloningObjects#clonePointThroughSerialization(Point)}
   */
  @Test
  void testClonePointThroughSerialization() {
    Point clone = CloningObjects.clonePointThroughSerialization(POINT);
    assertNotSame(POINT, clone);
    assertEquals(POINT.getX(), clone.getX());
    assertEquals(POINT.getY(), clone.getY());
  }

  /**
   * Method under test: {@link CloningObjects#clonePointThroughSerializationApache(Point)}
   */
  @Test
  void testClonePointThroughSerializationApache() {
    Point clone = CloningObjects.clonePointThroughSerializationApache(POINT);
    assertNotSame(POINT, clone);
    assertEquals(POINT.getX(), clone.getX());
    assertEquals(POINT.getY(), clone.getY());
  }

  /**
   * Method under test: {@link CloningObjects#clonePointThroughJsonJackson(Point)}
   */
  @Test
  void testClonePointThroughJsonJackson() throws JsonProcessingException {
    Point clone = CloningObjects.clonePointThroughJsonJackson(POINT);
    assertNotSame(POINT, clone);
    assertEquals(POINT.getX(), clone.getX());
    assertEquals(POINT.getY(), clone.getY());
  }

  /**
   * Method under test: {@link CloningObjects#clonePointThroughJsonGson(Point)}
   */
  @Test
  void testClonePointThroughJsonGson() {
    Point clone = CloningObjects.clonePointThroughJsonGson(POINT);
    assertNotSame(POINT, clone);
    assertEquals(POINT.getX(), clone.getX());
    assertEquals(POINT.getY(), clone.getY());
  }
}
