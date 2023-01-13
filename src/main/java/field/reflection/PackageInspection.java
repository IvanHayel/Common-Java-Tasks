package field.reflection;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PackageInspection {
  public static void main(String[] args) {
    simpleInspection();
    logPackagesByPrefix("java.util");
  }

  private static void simpleInspection() {
    var integerClass = Integer.class;
    var stringClass = String.class;
    var pathClass = Path.class;
    log.info("Package of Integer: {}", integerClass.getPackage().getName());
    log.info("Package of String: {}", stringClass.getPackage().getName());
    log.info("Package of Path: {}", pathClass.getPackage().getName());
  }

  private static void logPackagesByPrefix(String prefix) {
    log.info("Searching packages with prefix {} ...", prefix);
    fetchPackagesByPrefix(prefix).forEach(log::info);
    log.info("Searching packages done.");
  }

  private static List<String> fetchPackagesByPrefix(String prefix) {
    return Arrays.stream(Package.getPackages()).map(Package::getName)
      .filter(name -> name.startsWith(prefix)).toList();
  }
}
