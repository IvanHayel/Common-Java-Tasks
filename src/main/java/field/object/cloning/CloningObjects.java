package field.object.cloning;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.rits.cloning.Cloner;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.lang3.SerializationUtils;

public class CloningObjects {
  public static Point clonePointManual(Point point) {
    Point clone = new Point();
    clone.setX(point.getX());
    clone.setY(point.getY());
    return clone;
  }

  public static Point clonePointThroughCloneable(Point point) throws CloneNotSupportedException {
    return point.clone();
  }

  public static Point clonePointThroughCopyConstructor(Point point) {
    return new Point(point);
  }

  public static Point clonePointThroughCloningLibrary(Point point) {
    Cloner cloner = new Cloner();
    return cloner.deepClone(point);
  }

  public static Point clonePointThroughSerialization(Point point) {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
      objectOutputStream.writeObject(point);
      ByteArrayInputStream byteArrayInputStream =
          new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
      ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
      return (Point) objectInputStream.readObject();
    } catch (IOException | ClassNotFoundException exception) {
      exception.printStackTrace();
    }
    return null;
  }

  public static Point clonePointThroughSerializationApache(Point point) {
    return SerializationUtils.clone(point);
  }

  public static Point clonePointThroughJsonJackson(Point point) throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(point);
    return mapper.readValue(json, Point.class);
  }

  public static Point clonePointThroughJsonGson(Point point) {
    Gson gson = new Gson();
    String json = gson.toJson(point);
    return gson.fromJson(json, Point.class);
  }
}
