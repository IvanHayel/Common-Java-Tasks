package field.lvti;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LvtiSimpleExample {
  public static void main(String[] args) {
    String string = "Hello World";
    Object object = new Object();
    Thread[] threads = new Thread[10];
    Map<List<String>, Map<String, String>> map = new HashMap<>();
    EnumConstantNotPresentException exception = new EnumConstantNotPresentException(Enum.class,
        "FOO");
    int integer = new Random().nextInt();

    var lvtiString = "Hello World";
    var lvtiObject = new Object();
    var lvtiThreads = new Thread[10];
    var lvtiMap = new HashMap<List<String>, Map<String, String>>();
    var lvtiException = new EnumConstantNotPresentException(Enum.class, "FOO");
    var lvtiInteger = new Random().nextInt();
  }
}
