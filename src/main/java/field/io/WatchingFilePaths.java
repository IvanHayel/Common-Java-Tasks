package field.io;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WatchingFilePaths {
  private static final Path PATH_TO_WATCH = Paths.get("src/main/java/field/io");
  private static final Kind[] EVENT_KINDS;

  private static WatchService watchService;

  static {
    initializeWatchService();
    EVENT_KINDS = new Kind[]{ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE};
  }

  @SneakyThrows
  public static void main(String[] args) {
    log.info("Watching {}", PATH_TO_WATCH.toRealPath());
    initializeWatchService();
    WatchKey watchKey = PATH_TO_WATCH.register(watchService, EVENT_KINDS);
    while (true) {
      watchKey.pollEvents().stream()
        .map(e -> String.format("%s -> %s", e.kind(), e.context()))
        .forEach(log::info);
      boolean valid = watchKey.reset();
      if (!valid) {
        break;
      }
    }
    watchService.close();
  }

  @SneakyThrows
  private static void initializeWatchService() {
    watchService = FileSystems.getDefault().newWatchService();
  }
}
