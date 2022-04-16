package field.string;

public class RemovingWhitespaces {
    public static String removeWhitespacesCommon(String text) {
        return text.replaceAll("\\s+", "");
    }

    public static String removeWhitespacesApache(String text) {
        return org.apache.commons.lang3.StringUtils.deleteWhitespace(text);
    }

    public static String removeWhitespacesSpring(String text) {
        return org.springframework.util.StringUtils.trimAllWhitespace(text);
    }
}