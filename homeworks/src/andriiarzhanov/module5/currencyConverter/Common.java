package andriiarzhanov.module5.currencyConverter;

/**
 * Created by arzhanov on 25.04.17.
 */
public class Common {
    public static void main(String[] args) {
        Converter converter = new Converter(27.1);

        double amountInUAH = 500.;
        double amountInUSD = converter.convert(amountInUAH);

        System.out.println("For " + amountInUAH + " you can buy $" + amountInUSD);
    }
}
