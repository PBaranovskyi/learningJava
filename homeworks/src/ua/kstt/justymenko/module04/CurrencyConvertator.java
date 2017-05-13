package ua.kstt.justymenko.module04;

/**
 * Created by n1kropol on 4/22/17.
 */
public class CurrencyConvertator {
    private double currencyRate;

    public CurrencyConvertator(double currencyRate) {
        this.currencyRate = currencyRate;
    }

    public double convert(double amountUAH){
        return amountUAH / currencyRate;
    }

    public static void main(String[] args) {
        CurrencyConvertator convertor = new CurrencyConvertator(26.4);
        double result = convertor.convert(20000.00);
        result = (Math.ceil(result * 2) / 2);
        System.out.println(String.format("%.2f", result));
//        as an example with BigDecimal
//        double converted = new BigDecimal(result).setScale(2, RoundingMode.UP).doubleValue();
//        System.out.println(converted);
    }
}
