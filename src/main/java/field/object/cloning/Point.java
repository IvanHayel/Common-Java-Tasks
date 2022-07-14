package field.object.cloning;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Point implements Cloneable, Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  private double x;
  private double y;

  public Point(Point point) {
    this.x = point.x;
    this.y = point.y;
  }

  @Override
  protected Point clone() throws CloneNotSupportedException {
    return (Point) super.clone();
  }
}
