package field.reflection;

import field.reflection.model.Melon;
import java.util.Arrays;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnnotationInspection {
  @SneakyThrows
  public static void main(String[] args) {
    var clazz = Melon.class;
    var eatMethod = clazz.getDeclaredMethod("eat");
    var annotatedType = eatMethod.getAnnotatedReceiverType();

    log.info("Type: {}", annotatedType.getType().getTypeName());
    log.info("Annotations: {}", Arrays.toString(annotatedType.getAnnotations()));
  }
}
