package ua.kstt.justymenko.module04;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
        CurrencyConvertator convertor = new CurrencyConvertator(26.2);
        double result = convertor.convert(20000.00);
        System.out.println(result);
        double converted = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(converted);
//        result = 754.7169811320755
//        converted = 754.72
//        result = 766.2835249042146
//        converted = 766.28
    }
}
