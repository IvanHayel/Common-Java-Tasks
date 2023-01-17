package field.reflection.model;

import java.awt.Color;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {
  int id;
  String name;
  Color color;

  private Car(int id, String name) {
    this.id = id;
    this.name = name;
  }

  private Car(int id, Color color) {
    this.id = id;
    this.color = color;
  }
}
