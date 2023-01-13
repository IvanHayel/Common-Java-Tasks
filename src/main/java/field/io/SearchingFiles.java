package field.io;

import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SearchingFiles {
  private static final Path ROOT_PATH = Paths.get("src/main/java");

  @SneakyThrows
  public static void main(String[] args) {
    log.info("Searching files ends with 'Visitor.java'...");
    var stream = Files.find(ROOT_PATH, Integer.MAX_VALUE,
      (path, attr) -> path.toString().endsWith("Visitor.java"), FileVisitOption.FOLLOW_LINKS);
    stream.forEach(path -> log.info("Found: {}", path));
    stream.close();
  }
}
