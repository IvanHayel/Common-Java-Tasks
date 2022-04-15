package field.string;

import org.apache.commons.lang3.StringUtils;

public class CheckingContainsOnlyDigits {
    public static boolean containsOnlyDigitsFirstOption(String text) {
        for (int counter = 0; counter < text.length(); counter++)
            if (!Character.isDigit(text.charAt(counter)))
                return false;
        return true;
    }

    public static boolean containsOnlyDigitsSecondOption(String text) {
        return text.chars().allMatch(Character::isDigit);
    }

    public static boolean containsOnlyDigitsThirdOption(String text) {
        return text.matches("[0-9]+");
    }

    public static boolean containsOnlyDigitsApacheCommonsLang(String text) {
        return StringUtils.isNumeric(text);
    }
}