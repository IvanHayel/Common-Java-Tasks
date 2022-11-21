package field.io;

import java.io.File;
import java.net.URI;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConvertingFilePaths {
  @SuppressWarnings("unused")
  @SneakyThrows
  public static void main(String[] args) {
    var path = Paths.get("/some/path");

    String pathToString = path.toString();
    URI pathToUri = path.toUri();
    Path absolutePath = path.toAbsolutePath();
    try {
      Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
      File pathToFile = path.toFile();
    } catch (NoSuchFileException exception) {
      log.info("File doesn't exist! {}", pathToString);
    }
  }
}
