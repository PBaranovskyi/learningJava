package ltretykhlib.module3;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Tretykhlib on 23.04.2017.
 */
public class Currency {

    private double rate;

    public Currency(double convertRate) {
        rate = convertRate;
    }


    public BigDecimal convert(int uahAmount) {
        double usdAmount = uahAmount / rate;
        System.out.println("Amount in USD: " + usdAmount);
        BigDecimal roundedValue = new BigDecimal(usdAmount);
        BigDecimal rounded = roundedValue.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(rounded);
        return rounded;
    }

}



