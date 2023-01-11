package field.io.visitor;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SearchFileVisitor extends SimpleFileVisitor<Path> {
  Path fileNameToSearch;

  @Override
  @SneakyThrows
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
    var wasFileFound = search(file);
    return wasFileFound ? FileVisitResult.TERMINATE : FileVisitResult.CONTINUE;
  }

  @SneakyThrows
  private boolean search(Path file) {
    var fileName = file.getFileName();
    if(fileName.equals(fileNameToSearch)) {
      log.info(String.format("Found file %s in %s", fileNameToSearch, file.toRealPath()));
      return true;
    }
    return false;
  }
}
