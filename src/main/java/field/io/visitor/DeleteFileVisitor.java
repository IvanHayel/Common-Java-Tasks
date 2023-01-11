package field.io.visitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeleteFileVisitor extends SimpleFileVisitor<Path> {
  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
    var isDeleted = delete(file);
    if (isDeleted) {
      log.info("File {} deleted", file);
    }
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
    var isDeleted = delete(dir);
    if (isDeleted) {
      log.info("Directory {} deleted", dir);
    }
    return FileVisitResult.CONTINUE;
  }

  @SneakyThrows
  private static boolean delete(Path file) {
    return Files.deleteIfExists(file);
  }
}
