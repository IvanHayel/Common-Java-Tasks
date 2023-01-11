package field.io;

import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingFilePaths {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    var relativePathFirstOption = Paths.get("/some/relative/path/1");
    var relativePathSecondOption = Path.of("/some/relative/path/2");
    var relativePathThirdOption = FileSystems.getDefault()
      .getPath("/some/relative/path/3", "some.file");
    var relativePathFourthOption = Paths.get(URI.create("file:///some/relative/path/4"));
    var relativePathFifthOption = Path.of(URI.create("file:///some/relative/path/5"));

    var absolutePath = Paths.get("C:/some/absolute/path");

    var shortcutPath = Paths.get("/some/../shortcut/path").normalize();
  }
}
