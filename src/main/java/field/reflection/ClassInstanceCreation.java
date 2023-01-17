package field.reflection;

import field.reflection.model.Car;
import java.awt.Color;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClassInstanceCreation {
  @SneakyThrows
  public static void main(String[] args) {
    var clazz = Car.class;
    var noArgsConstructor = clazz.getConstructor();
    var allArgsConstructor = clazz.getConstructor(int.class, String.class, Color.class);
    var firstPrivateConstructor = clazz.getDeclaredConstructor(int.class, String.class);
    var secondPrivateConstructor = clazz.getDeclaredConstructor(int.class, Color.class);

    firstPrivateConstructor.setAccessible(true);
    secondPrivateConstructor.setAccessible(true);

    Car carViaNoArgs = noArgsConstructor.newInstance();
    Car carViaAllArgs = allArgsConstructor.newInstance(1, "VW", Color.RED);
    Car carViaFirstPrivateConstructor = firstPrivateConstructor.newInstance(1, "VW");
    Car carViaSecondPrivateConstructor = secondPrivateConstructor.newInstance(1, Color.RED);

    log.info("No args constructor: {}", carViaNoArgs);
    log.info("All args constructor: {}", carViaAllArgs);
    log.info("First private constructor: {}", carViaFirstPrivateConstructor);
    log.info("Second private constructor: {}", carViaSecondPrivateConstructor);
  }
}
