package field.string;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.converters.DoubleConverter;
import org.apache.commons.beanutils.converters.FloatConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.apache.commons.beanutils.converters.LongConverter;

@Slf4j
public class StringConversion {
    private static final String TO_INT = "3301";
    private static final String TO_LONG = "33013301330";
    private static final String TO_FLOAT = "3301.3301";
    private static final String TO_DOUBLE = "3301.33013301";
    private static final String WRONG_NUMBER = "3301.3301.3301";

    public static void main(String[] args) {
        int toInt = Integer.parseInt(TO_INT);
        long toLong = Long.parseLong(TO_LONG);
        float toFloat = Float.parseFloat(TO_FLOAT);
        double toDouble = Double.parseDouble(TO_DOUBLE);

        log.info("parseInt(): conversion to int success: {}", toInt);
        log.info("parseLong(): conversion to long success: {}", toLong);
        log.info("parseFloat(): conversion to float success: {}", toFloat);
        log.info("parseDouble(): conversion to double success: {}", toDouble);

        Integer toIntWrapper = Integer.valueOf(TO_INT);
        Long toLongWrapper = Long.valueOf(TO_LONG);
        Float toFloatWrapper = Float.valueOf(TO_FLOAT);
        Double toDoubleWrapper = Double.valueOf(TO_DOUBLE);

        log.info("valueOf(): conversion to int wrapper success: {}", toIntWrapper);
        log.info("valueOf(): conversion to long wrapper success: {}", toLongWrapper);
        log.info("valueOf(): conversion to float wrapper success: {}", toFloatWrapper);
        log.info("valueOf(): conversion to double wrapper success: {}", toDoubleWrapper);

        try {
            int simulationOfNumberFormatException = Integer.parseInt(WRONG_NUMBER);
        } catch (NumberFormatException e) {
            log.info("parseInt(): conversion of wrong number  -> {} -> {}", e.getClass(), e.getMessage());
        }

        try {
            Integer simulationOfNumberFormatException = Integer.valueOf(WRONG_NUMBER);
        } catch (NumberFormatException e) {
            log.info("valueOf(): conversion of wrong number  -> {} -> {}", e.getClass(), e.getMessage());
        }

        IntegerConverter integerConverter = new IntegerConverter();
        Integer convertedInt = integerConverter.convert(Integer.class, TO_INT);
        LongConverter longConverter = new LongConverter();
        Long convertedLong = longConverter.convert(Long.class, TO_LONG);
        FloatConverter floatConverter = new FloatConverter();
        Float convertedFloat = floatConverter.convert(Float.class, TO_FLOAT);
        DoubleConverter doubleConverter = new DoubleConverter();
        Double convertedDouble = doubleConverter.convert(Double.class, TO_DOUBLE);

        log.info("integerConverter.convert(): conversion to int success: {}", convertedInt);
        log.info("longConverter.convert(): conversion to long success: {}", convertedLong);
        log.info("floatConverter.convert(): conversion to float success: {}", convertedFloat);
        log.info("doubleConverter.convert(): conversion to double success: {}", convertedDouble);
    }
}