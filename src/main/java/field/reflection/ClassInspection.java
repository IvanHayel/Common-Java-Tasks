package field.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.StringJoiner;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;

@Slf4j
public class ClassInspection {
  public static void main(String[] args) {
    inspectApachePairClass();
  }

  private static void inspectApachePairClass() {
    var pair = Pair.of(1, 1);
    var clazz = pair.getClass();
    inspectClassName(clazz);
    inspectModifiers(clazz);
    inspectInterfaces(clazz);
    inspectConstructors(clazz);
    inspectFields(clazz);
    inspectMethods(clazz);
    inspectModule(clazz);
    inspectSuperClass(clazz);
    inspectGenericString(clazz);
    inspectDescriptor(clazz);
  }

  private static void inspectClassName(Class<?> clazz) {
    log.info("Class name: {}", clazz.getName());
    log.info("Simple name: {}", clazz.getSimpleName());
    log.info("Canonical name: {}", clazz.getCanonicalName());
  }

  private static void inspectModifiers(Class<?> clazz) {
    int modifiers = clazz.getModifiers();
    log.info("Is public? " + Modifier.isPublic(modifiers));
    log.info("Is final? " + Modifier.isFinal(modifiers));
    log.info("Is abstract? " + Modifier.isAbstract(modifiers));
  }

  private static void inspectInterfaces(Class<?> clazz) {
    var interfaces = clazz.getInterfaces();
    log.info("Interfaces: {}", Arrays.toString(interfaces));
  }

  private static void inspectConstructors(Class<?> clazz) {
    var constructors = clazz.getConstructors();
    log.info("Constructors: {}", Arrays.toString(constructors));
  }

  private static void inspectFields(Class<?> clazz) {
    var fields = clazz.getFields();
    var joiner = new StringJoiner(", ");
    Arrays.stream(fields).map(Field::getName).forEach(joiner::add);
    log.info("Fields: {}", joiner);
  }

  private static void inspectMethods(Class<?> clazz) {
    var methods = clazz.getMethods();
    var joiner = new StringJoiner(", ");
    Arrays.stream(methods).map(Method::getName).forEach(joiner::add);
    log.info("Methods: {}", joiner);
  }

  private static void inspectModule(Class<?> clazz) {
    var module = clazz.getModule();
    log.info("Module: {}", module.getName());
  }

  private static void inspectSuperClass(Class<?> clazz) {
    var superClass = clazz.getSuperclass();
    log.info("Super class: {}", superClass.getName());
  }

  private static void inspectGenericString(Class<?> clazz) {
    var genericString = clazz.toGenericString();
    log.info("Generic string: {}", genericString);
  }

  private static void inspectDescriptor(Class<?> clazz) {
    var descriptorString = clazz.descriptorString();
    log.info("Descriptor string: {}", descriptorString);
  }
}
