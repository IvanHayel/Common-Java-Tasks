package field.io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamingFile {
  private static final Path FILE_PATH;

  static {
    FILE_PATH = Paths.get("src/main/java/field/io/visitor/PathVisitor.java");
  }

  public static void main(String[] args) {
    streamReadFirstLine();
    streamBufferedReadFirstLine();
  }

  private static void streamReadFirstLine() {
    try(var stream = Files.lines(FILE_PATH)) {
      log.info("Simple read: {}", stream.findFirst().orElse("no content"));
    } catch (IOException exception) {
      log.warn(exception.getMessage());
    }
  }

  private static void streamBufferedReadFirstLine() {
    try(var stream = Files.newBufferedReader(FILE_PATH, StandardCharsets.UTF_8).lines()) {
      log.info("Buffered read: {}", stream.findFirst().orElse("no content"));
    } catch (IOException exception) {
      log.warn(exception.getMessage());
    }
  }
}
