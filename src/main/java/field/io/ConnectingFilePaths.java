package field.io;

import java.nio.file.Paths;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConnectingFilePaths {
  public static void main(String[] args) {
    var base = Paths.get("D:/some/path");
    var first = base.resolve("first.file");
    var second = base.resolve("second.file");
    var third = base.resolveSibling("parent").resolve("third.file");

    log.info(first.toAbsolutePath().toString());
    log.info(second.toAbsolutePath().toString());
    log.info(third.toAbsolutePath().toString());
  }
}
