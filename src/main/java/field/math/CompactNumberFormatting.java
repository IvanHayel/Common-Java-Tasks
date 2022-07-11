package field.math;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class CompactNumberFormatting {
  private static final NumberFormat SHORT_COMPACT_FORMAT =
      CompactNumberFormat.getCompactNumberInstance();
  private static final NumberFormat LONG_COMPACT_FORMAT =
      CompactNumberFormat.getCompactNumberInstance(Locale.ENGLISH, Style.LONG);

  public static String formatCompactShort(int value) {
    return SHORT_COMPACT_FORMAT.format(value);
  }

  public static String formatCompactLong(int value) {
    return LONG_COMPACT_FORMAT.format(value);
  }
}
