package andriiarzhanov.module5.currencyConverter;

/**
 * Created by arzhanov on 25.04.17.
 */
public class Converter {


    private static double currency;

    Converter (double currency) {
        this.currency = currency;
    }

    public static double convert(double amountInUAH) {
        return Math.floor((amountInUAH / currency) * 100 ) / 100;
    }
}
