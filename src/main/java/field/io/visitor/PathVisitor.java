package field.io.visitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PathVisitor extends SimpleFileVisitor<Path> {
  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
    if (exc != null) {
      throw exc;
    }
    log.info("Visited directory: {}", dir);
    return FileVisitResult.CONTINUE;
  }
}
