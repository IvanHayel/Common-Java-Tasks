package field.io.visitor;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CopyFileVisitor extends SimpleFileVisitor<Path> {
  Path source;
  Path target;

  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
    var newDirectory = target.resolve(source.relativize(dir));
    try {
      Files.copy(dir, newDirectory, REPLACE_EXISTING, COPY_ATTRIBUTES);
      log.info("Copied {}", dir);
    } catch (IOException exception) {
      log.error("Error while copying directory {}", dir);
      return FileVisitResult.SKIP_SUBTREE;
    }
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
    try {
      copySubTree(file, target.resolve(source.relativize(file)));
      log.info("Copied {}", file);
    } catch (IOException exception) {
      log.error("Error while copying file {}", file);
    }
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
    var newDirectory = target.resolve(source.relativize(dir));
    try {
      var time = Files.getLastModifiedTime(newDirectory);
      Files.setLastModifiedTime(dir, time);
    } catch (IOException exception) {
      log.error("Error while setting time attribute to {}", dir);
    }
    return FileVisitResult.CONTINUE;
  }

  private static void copySubTree(Path from, Path to) throws IOException {
    Files.copy(from, to, REPLACE_EXISTING, COPY_ATTRIBUTES);
  }
}
