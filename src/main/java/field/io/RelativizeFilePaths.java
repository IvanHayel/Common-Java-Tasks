package field.io;

import java.nio.file.Paths;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RelativizeFilePaths {
  public static void main(String[] args) {
    var first = Paths.get("/a/b/c");
    var second = Paths.get("/a/b/d");

    log.info("first: {}", first.toAbsolutePath());
    log.info("second: {}", second.toAbsolutePath());
    log.info("first.relativize(second): {}", first.relativize(second));
    log.info("second.relativize(first): {}", second.relativize(first));
  }
}
