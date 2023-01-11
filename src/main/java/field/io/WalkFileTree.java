package field.io;

import field.io.visitor.CopyFileVisitor;
import field.io.visitor.DeleteFileVisitor;
import field.io.visitor.PathVisitor;
import field.io.visitor.SearchFileVisitor;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.EnumSet;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WalkFileTree {
  private static final EnumSet<FileVisitOption> DEFAULT_OPTIONS;
  private static final Path TRAVERSE_PATH = Paths.get("src/main/java/field/io");
  private static final Path FILE_NAME = Paths.get("PathVisitor.java");
  private static final Path DIRECTORY_TO_DELETE = Paths.get("src/main/java/field/io/delete-me");
  private static final Path DIRECTORY_TO_COPY = Paths.get("src/main/java/field/io/copy-me");
  private static final Path DIRECTORY_WHERE_COPY = Paths.get("src/main/java/field/io/im-copied");

  static {
    DEFAULT_OPTIONS = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
  }

  @SneakyThrows
  public static void main(String[] args) {
    traverseFolder(TRAVERSE_PATH);
    searchFile(FILE_NAME);
    deleteDirectory(DIRECTORY_TO_DELETE);
    copyDirectory(DIRECTORY_TO_COPY);
    calculateFolderSize(TRAVERSE_PATH);
  }

  private static void traverseFolder(Path path) throws IOException {
    var visitor = new PathVisitor();
    Files.walkFileTree(path, visitor);
  }

  @SneakyThrows
  private static void searchFile(Path fileName) {
    var searchVisitor = new SearchFileVisitor(fileName);
    var root = Paths.get("src");
    Files.walkFileTree(root, DEFAULT_OPTIONS, Integer.MAX_VALUE, searchVisitor);
  }

  @SneakyThrows
  private static void deleteDirectory(Path directoryToDelete) {
    var deleteVisitor = new DeleteFileVisitor();
    try {
      Files.walkFileTree(directoryToDelete, DEFAULT_OPTIONS, Integer.MAX_VALUE, deleteVisitor);
    } catch (NoSuchFileException exception) {
      log.warn("Directory {} not found", directoryToDelete);
    }
  }

  @SneakyThrows
  private static void copyDirectory(Path directoryToCopy) {
    var copyVisitor = new CopyFileVisitor(DIRECTORY_TO_COPY, DIRECTORY_WHERE_COPY);
    try {
      Files.walkFileTree(directoryToCopy, DEFAULT_OPTIONS, Integer.MAX_VALUE, copyVisitor);
    } catch (NoSuchFileException exception) {
      log.warn("Directory {} not found", directoryToCopy);
    }
  }

  @SneakyThrows
  private static void calculateFolderSize(Path directory) {
    if (Files.isDirectory(directory)) {
      try (var stream = Files.walk(directory)) {
        var size = stream
          .filter(f -> f.toFile().isFile())
          .mapToLong(f -> f.toFile().length())
          .sum();
        log.info("Folder {} size: {} bytes", directory, size);
      }
    }
  }
}
